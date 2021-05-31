package com.OOP2021_16.util;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;
import java.io.*;

public class FileUploadUtils {

    public static String writeFileContentFromRequest(HttpServletRequest request){
        String username = (String)request.getSession().getAttribute("username");
        try{
            request.setCharacterEncoding("utf-8");
            if(ServletFileUpload.isMultipartContent(request)) {
                DiskFileItemFactory diskFileItemFactory=new DiskFileItemFactory();// 创建该对象
                ServletFileUpload fileUpload=new ServletFileUpload(diskFileItemFactory);// 创建该对象
                FileItemIterator itemIterator=fileUpload.getItemIterator(request);// 解析request 请求,并返回FileItemIterator集合
                while(itemIterator.hasNext()) {
                    FileItemStream itemStream=itemIterator.next();//从集合中获得一个文件流
                    if(!itemStream.isFormField() && itemStream.getName().length() > 0) {    //过滤掉表单中非文件
                        BufferedInputStream in = new BufferedInputStream(itemStream.openStream()); //获得文件输入流
                        in.mark(itemStream.openStream().available()+1);
                        //判断上传的文件的编码格式 支持 UTF-8 和 ANSI两种类型
                        String path = request.getServletContext().getRealPath("profilePhoto/");
                        File saveFile = new File(path);
                        if(!saveFile.exists()) saveFile.mkdirs();
                        FileOutputStream out = new FileOutputStream(path + username + ".png");
                        byte buffer[] = new byte[1024];
                        //判断输入流中的数据是否已经读完的标识
                        int len;
                        while ((len = in.read(buffer)) > 0) {
                            out.write(buffer, 0, len);
                        }
                        in.close();
                        out.close();
                        return username + ".png";
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
