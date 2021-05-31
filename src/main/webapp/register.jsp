<%@ page contentType="text/html; charset=UTF-8"%>
<html class="loginHtml"><head>
	<meta charset="utf-8">
	<title>注册</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="icon" href="${pageContext.request.contextPath}/logo2.jpg">
	<link rel="stylesheet" href="layui/css/layui.css" media="all">
	<link id="layuicss-layer" rel="stylesheet" href="http://admin.dataoke.com/layui/css/modules/layer/default/layer.css?v=3.1.1" media="all">
	<style>
		.childrenBody{ padding:10px;}
		.layui-table-view{ margin:0 !important;}
		.magb0{margin-bottom:0 !important;}
		.magt0{ margin-top:0 !important;}
		.magt3{ margin-top:3px !important;}
		.magt10{ margin-top:10px !important;}
		.magb15{ margin-bottom:15px !important;}
		.magt30{ margin-top:30px !important;}
		.layui-left{text-align:left;}
		.layui-block{ width:100% !important;}
		.layui-center{text-align:center;}
		.layui-right{text-align:right;}
		.layui-elem-quote.title{ padding:10px 15px; margin-bottom:0;}
		.layui-bg-white{ background-color:#fff !important;}
		.border{ border:1px solid #e6e6e6 !important; padding:10px; border-top:none;}
		.main_btn .layui-btn{ margin:2px 5px 2px 0;}
		.layui-timeline-axis{ left:-4px;}
		.layui-elem-quote{ word-break: break-all;}
		.icons li,.icons li:hover,.loginBody .seraph,.loginBody .seraph:hover,.loginBody .layui-form-item.layui-input-focus label,.loginBody .layui-form-item label,.loginBody .layui-form-item.layui-input-focus input,.loginBody .layui-form-item input{transition: all 0.3s ease-in-out;-webkit-transition: all 0.3s ease-in-out;}
		.icons li:hover i,.icons li i{transition: font-size 0.3s ease-in-out;-webkit-transition: font-size 0.3s ease-in-out;}
		.loginBody .layui-input-focus .layui-input::-webkit-input-placeholder{transition: color 0.2s linear 0.2s;-webkit-transition: color 0.2s linear 0.2s;}
		.loginBody .layui-input-focus .layui-input::-moz-placeholder{transition: color 0.2s linear 0.2s;}
		.loginBody .layui-input-focus .layui-input:-ms-input-placeholder{transition: color 0.2s linear 0.2s;}
		.loginBody .layui-input-focus .layui-input::placeholder{transition: color 0.2s linear 0.2s;-webkit-transition: color 0.2s linear 0.2s;}
		.loginHtml,.loginBody{ height:100%;}
		.loginBody{ background:url("../images/login_bg.jpg") no-repeat center center;}
		.loginBody form.layui-form{ padding:0 20px; width:300px; height:380px; position:absolute; left:50%; top:50%; margin:-150px 0 0 -150px; -webkit-box-sizing:border-box;-moz-box-sizing:border-box; -o-box-sizing:border-box; box-sizing:border-box; background:#fff;-webkit-border-radius:5px; -moz-border-radius:5px; border-radius:5px; box-shadow:0 0 50px #009688;}
		.login_face{ margin:-55px auto 20px; width:100px; height:100px; -webkit-border-radius:50%; -moz-border-radius:50%; border-radius:50%; border:5px solid #fff; overflow:hidden;box-shadow:0 0 30px #009688;}
		.login_face img{ width:100%;}
		.loginBody .layui-form-item{ position:relative;}
		.loginBody .layui-form-item label{ position:absolute; color:#757575; left:10px; top:9px; line-height:20px; background:#fff; padding:0 5px; font-size:14px; cursor:text;}
		.loginBody .layui-form-item.layui-input-focus label{ top:-10px; font-size:12px; color:#ff6700;}
		.loginBody .layui-form-item.layui-input-active label{ top:-10px; font-size:12px;}
		.loginBody .layui-input::-webkit-input-placeholder{color:#fff;}
		.loginBody .layui-input::-moz-placeholder{color:#fff;}
		.loginBody .layui-input:-ms-input-placeholder{color:#fff;}
		.loginBody .layui-input::placeholder{color:#fff;}
		.loginBody .layui-form-item.layui-input-focus input{ border-color:#ff6700 !important;}
		.loginBody .layui-input-focus .layui-input::-webkit-input-placeholder{color:#757575;}
		.loginBody .layui-input-focus .layui-input::-moz-placeholder{color:#757575;}
		.loginBody .layui-input-focus .layui-input:-ms-input-placeholder{color:#757575;}
		.loginBody .layui-input-focus .layui-input::placeholder{color:#757575;}
		.loginBody .seraph{ font-size:30px; text-align:center;}
		.loginBody .seraph.icon-qq:hover{ color:#0288d1;}
		.loginBody .seraph.icon-wechat:hover{ color:#00d20d;}
		.loginBody .seraph.icon-sina:hover{ color:#d32f2f;}
		.imgCode{ position:relative;}
		#imgCode img{ position:absolute; top:1px; right:1px; cursor:pointer;}
	</style>
</head>
<body class="loginBody" style="background:#1d2024">
	<form class="layui-form login-form" method="post" action="">
		<div class="login_face">
			<img src="logo1.jpg" class="userAvatar">
		</div>
		<div class="layui-form-item input-item">
			<label for="userName">用户名</label>
			<input name="username" type="text" lay-verify="required" placeholder="请输入用户名" autocomplete="off" id="userName" class="layui-input">
		</div>
		<div class="layui-form-item input-item">
			<label for="email">邮箱</label>
			<input name="email" type="text" lay-verify="required" placeholder="请输入邮箱" autocomplete="off" id="email" class="layui-input">
		</div>
		<div class="layui-form-item input-item">
			<label for="password">密码</label>
			<input name="password" type="password" lay-verify="required" placeholder="请输入密码" autocomplete="off" id="password" class="layui-input">
		</div>
		<div class="layui-form-item input-item">
			<label for="password_verify">确认密码</label>
			<input name="password_verify" type="password_verify" lay-verify="required" placeholder="请确认密码" autocomplete="off" id="password_verify" class="layui-input">
		</div>
		<div class="layui-form-item">
			<button class="layui-btn layui-block" lay-filter="register" lay-submit="">注册</button>
		</div>
		已有账户？<a href="${pageContext.request.contextPath}/login.jsp">点击登录</a>
	</form>
	<script type="text/javascript" src="layui/layui.js"></script>

	<script>
        layui.use(['form','layer','jquery'],function(){
            var form = layui.form,
                layer = parent.layer === undefined ? layui.layer : top.layer
            $ = layui.jquery;

            //登录按钮
            form.on("submit(register)",function(){
                $(this).text("注册中...").attr("disabled","disabled").addClass("layui-disabled");

                var _this = $(this);
                $.post('/register',$('.login-form').serialize(),function (data) {
					if (data.status == 0){
						layer.open({
							title: '萌租房'
							,content: data.msg
							,btn: ['确定']
							,btn1: function(){
								location.reload();
							}
						});
                    }
                    else{
						layer.open({
							title: '萌租房'
							,content: '注册成功！'
							,btn: ['确定']
							,btn1: function(){
								location.href = "/login.jsp";
							}
						});
					}

                },"json");
                return false;
            });

            //表单输入效果
            $(".loginBody .input-item").click(function(e){
                e.stopPropagation();
                $(this).addClass("layui-input-focus").find(".layui-input").focus();
            })
            $(".loginBody .layui-form-item .layui-input").focus(function(){
                $(this).parent().addClass("layui-input-focus");
            })
            $(".loginBody .layui-form-item .layui-input").blur(function(){
                $(this).parent().removeClass("layui-input-focus");
                if($(this).val() != ''){
                    $(this).parent().addClass("layui-input-active");
                }else{
                    $(this).parent().removeClass("layui-input-active");
                }
            })
        })

	</script>

</body></html>