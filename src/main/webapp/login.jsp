<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>点点登录</title>
<link href="page-profile/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
</head>
<body>
<!-- contact-form -->	
<div class="message warning">
<div class="inset">
	<div class="login-head">
		<h1>登录窗</h1>
		 <!--<div class="alert-close"> </div>-->
	</div>
		<form action="login" method="get">
			<li>
				<input name="name" type="text" class="text" value="账号" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入账号';}"><a href="#" class=" icon user"></a>
			</li>
				<div class="clear"> </div>
			<li>
				<input name="password" type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入密码';}"> <a href="#" class="icon lock"></a>
			</li>
			<div class="clear"> </div>
            <div class="power">
                 <input type="radio" name="power" value="1">学生
                 <input type="radio" name="power" value="2">组织
                 <input type="radio" name="power" value="3">管理员          
            </div>
            <div class="clear"> </div>
			<div class="submit">
				<input type="submit" onclick="" value="登录" >
				<h4><a href="#">密码找回</a></h4>			    
			</div>
            <div class="clear"> </div>				
		</form>						
	</div>
	</div>
	<div class="clear"> </div>
<!--- footer --->
<div class="footer">
	<p>陈锘制作，于2019年4月1日</p>
</div>

</body>
</html>