<%@ page import="com.OOP2021_16.dao.UserDao" %>
<%@ page import="com.OOP2021_16.dao.impl.UserDaoImpl" %>
<%@ page import="com.OOP2021_16.domain.User" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>

<body onload="load();">
<%
UserDao userDao = new UserDaoImpl();
User user = userDao.findById((int)session.getAttribute("id"));
%>
<div class="layui-anim layui-anim-upbit">
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>我的个人资料</legend>
</fieldset>
<div class="fly-panel fly-panel-user" pad20="">
    <div class="layui-tab layui-tab-card">
    <ul class="layui-tab-title">
        <li class="layui-this">基本信息</li>
        <li>头像</li>
        <li>账户余额</li>
    </ul>
    <div class="layui-tab-content" style="height: 500px;padding: 20px 0;">
                <div class="layui-form layui-form-pane layui-tab-item layui-show">
                    <div style="width: 650px; position: relative; left:25%;">
                    <form method="post">
                        <div class="layui-form-item">
                            <label for="L_email" class="layui-form-label">用户名</label>
                            <div class="layui-input-inline">
                                <input type="text" id="username" name="username" required lay-verify="username" autocomplete="off" value=<%=session.getAttribute("username")%> class="layui-input" disabled style="cursor:not-allowed !important;">
                            </div>
                        </div>

                        <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">邮箱</label>
                        <div class="layui-input-inline">
                            <input type="text" id="email" name="email" required lay-verify="email" autocomplete="off" value=<%=user.getEmail()%> class="layui-input" disabled style="cursor:not-allowed !important;">
                        </div>
                        <div class="layui-form-mid layui-word-aux">
                            您的邮箱尚未激活
                            <a href="" class="layui-btn layui-btn-sm layui-btn-normal" style="position: relative; top: -2px;">立即激活邮箱</a>
                        </div>
                    </div>
                </form>
                    </div>
                </div>

                <div class="layui-form layui-form-pane layui-tab-item">
                    <div class="layui-form-item">
                        <div style="width: 650px; position: relative; left:25%;">
                            <div class="avatar-add">
                                <p>建议尺寸168*168，支持jpg、png、gif，最大不能超过50KB</p>
                                <button type="button" class="layui-btn" id="profilePhoto">
                                    <i class="layui-icon">&#xe681;</i>
                                    上传头像
                                </button>
                                <input class="layui-upload-file" type="file" accept name="file">
                                <img id="picture" src="/<%=user.getProfilePhoto()%>" width="100px" height="100px"/>
                                <span class="loading"></span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="layui-form layui-form-pane layui-tab-item">
                    <div class="layui-form-item">
                        <div style="width: 650px; position: relative; left:25%;">
                            <button class="layui-btn">刷新余额<span class="layui-badge-dot layui-bg-orange"></span></button>
                            <div class="layui-field-box">
                                <table class="layui-table" lay-skin="nob">
                                    <tbody>
                                    <tr>
                                        <td>当前余额：<span class="price"><%=user.getBalance()%></span></td>
                                    </tr>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>

    </div>

</div>
</div>


<script>
    layui.use('element', function(){
        var $ = layui.jquery
            ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块

        //触发事件
        var active = {
            tabAdd: function(){
                //新增一个Tab项
                element.tabAdd('demo', {
                    title: '新选项'+ (Math.random()*1000|0) //用于演示
                    ,content: '内容'+ (Math.random()*1000|0)
                    ,id: new Date().getTime() //实际使用一般是规定好的id，这里以时间戳模拟下
                })
            }
            ,tabDelete: function(othis){
                //删除指定Tab项
                element.tabDelete('demo', '44'); //删除：“商品管理”


                othis.addClass('layui-btn-disabled');
            }
            ,tabChange: function(){
                //切换到指定Tab项
                element.tabChange('demo', '22'); //切换到：用户管理
            }
        };

        $('.site-demo-active').on('click', function(){
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        });

        //Hash地址的定位
        var layid = location.hash.replace(/^#test=/, '');
        element.tabChange('test', layid);

        element.on('tab(test)', function(elem){
            location.hash = 'test='+ $(this).attr('lay-id');
        });

    });
</script>
<script>
    layui.use('upload', function(){
        var upload = layui.upload;

        //执行实例
        var uploadInst = upload.render({
            elem: '#profilePhoto' //绑定元素
            ,url: '../upload' //上传接口
            ,done: function(res){
                layer.open({
                    title: '萌租房'
                    ,content: '上传成功！'
                    ,btn: ['确定']
                    ,btn1: function(){
                        location.reload();
                    }
                });
            }
            ,error: function(){
                //请求异常回调
            }
        });
    });
</script>
</div>
</body>
</html>