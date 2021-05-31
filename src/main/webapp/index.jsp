<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.OOP2021_16.dao.UserDao" %>
<%@ page import="com.OOP2021_16.dao.impl.UserDaoImpl" %>
<%@ page import="com.OOP2021_16.domain.User" %>
<%
if(session.getAttribute("username") == null) {
  String site = "/main.html";
  response.setStatus(response.SC_MOVED_TEMPORARILY);
  response.setHeader("Location", site);
}else{
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>房屋租赁系统-商户版</title>
  <link rel="stylesheet" href="layui/css/layui.css" media="all">
  <link rel="icon" href="${pageContext.request.contextPath}/logo2.jpg">
  <script type="text/javascript" src="layui/layui.js"></script>
  <script type="text/javascript" charset="utf-8"  src="js/L2Dwidget.0.min.js"></script>
  <script type="text/javascript" charset="utf-8"  src="js/L2Dwidget.min.js"></script>
  <script type="text/javascript">
    L2Dwidget.init({"display": {
        "superSample": 2,
        "width": 200,
        "height": 400,
        "position": "right",
        "hOffset": 0,
        "vOffset": 0
      }
    });
  </script>
</head>
<body class="layui-layout-body">
<%
  UserDao userDao = new UserDaoImpl();
  User user = userDao.findById((int)session.getAttribute("id"));
  String profilePhoto = user.getProfilePhoto();
%>
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">房屋租赁系统-商户版</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img id="photo" src="<%=profilePhoto%>" class="layui-nav-img">
          <%=session.getAttribute("username")%>
        </a>
        <dl class="layui-nav-child">
          <dd><a href="javascript:">基本资料</a></dd>
          
        </dl>
      </li>
      <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/login.jsp" onclick="<%session.setAttribute("username",null);session.setAttribute("id",0);%>">退出</a></li>
    </ul>
  </div>
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree">
        <li class="layui-nav-item">
          <a href="javascript:;"><i class="layui-icon">&#xe656;</i>  主页</a>
        </li>
        <li class="layui-nav-item">
          <a class="" href="javascript:;"><i class="layui-icon">&#xe68e;</i>  房产管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">我的房产</a></dd>
            <dd><a href="javascript:;">添加房产</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;"><i class="layui-icon">&#xe66f;</i>  租客管理</a>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;"><i class="layui-icon">&#xe698;</i>  我的订单</a>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;"><i class="layui-icon">&#xe606;</i>  反馈</a>
        </li>
      </ul>
    </div>
  </div>

  <div id="main" class="layui-body">
    <iframe src="home/home.html" id="ifr" style="width:100%;height:100%"></iframe>
    
  </div>
</div>

<script>
  String.prototype.endWith=function(endStr){
    var d=this.length-endStr.length;
    return (d>=0&&this.lastIndexOf(endStr) === d);
  };
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  var $ = layui.jquery;
  $("a").on('click',function(){
    const text = $(this).text();
    const main = $("#main");
    if(text.endWith("租客管理")){
      main.find("#ifr").remove();
      main.append('<iframe src="renter/renterManagement.html" id="ifr" style="width:100%;height:100%"></iframe>');
    }else if(text.endWith("我的订单")){
      main.find("#ifr").remove();
      main.append('<iframe src="statistics/orderManagement.html" id="ifr" style="width:100%;height:100%"></iframe>');
    }else if(text.endWith("反馈")){
      main.find("#ifr").remove();
      main.append('<iframe src="feedback/UserFeedback.html" id="ifr" style="width:100%;height:100%"></iframe>')
    }else if(text.endWith("主页")){
      main.find("#ifr").remove();
      main.append('<iframe src="home/home.html" id="ifr" style="width:100%;height:100%"></iframe>')
    }else if(text.endWith("我的房产")){
      main.find("#ifr").remove();
      main.append('<iframe src="house/houseManagement.html" id="ifr" style="width:100%;height:100%"></iframe>')
    }else if(text.endWith("添加房产")){
      main.find("#ifr").remove();
      main.append('<iframe src="house/addHouse.html" id="ifr" style="width:100%;height:100%"></iframe>')
    }else if(text.endWith("基本资料")){
      main.find("#ifr").remove();
      main.append('<iframe src="loginuser/basicInfo.jsp" id="ifr" style="width:100%;height:100%"></iframe>')
      //main.append('<iframe src="user/userManagement.html" id="ifr" style="width:100%;height:100%"></iframe>')
    }
  })
});
</script>
</body>
</html>
<%
}
%>