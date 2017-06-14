<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/index.js"></script>
	<link href="css/index.css" rel="stylesheet" type="text/css">
  </head>
  
  <body>
  	<div class="formcont">
  		<form action="111" onsubmit="return checkInput()">
	  		<div><label>昵称：</label><input id="name" class="name" type="text"/> <span></span></div>
	   		<div><label>密码：</label><input id="pass" class="txt" type="text"/> <span >111</span></div>
	   		<div><label>确认密码：</label><input id="pass2" class="txt" type="text"/> <span>222</span></div>
	   		<div><label>邮箱：</label><input id="yx" class=" yx" type="text"/> <span></span></div>
	   		<div><label>身份证：</label><input id="id" class=" id" type="text"/> <span></span></div>
	   		<div><label>手机号码：</label><input id="mobile" class=" mobile " type="text"/> <span></span></div>
	   		<div><label>电话号码：</label><input id="phone" class=" phone" type="text"/> <span></span></div>
	   		<div><label></label><input type="radio" name="sex" checked/>   男   <input type="radio" name="sex"/>   女   </div>
	   		<div><label></label>
	   			<select id="year"></select>   年
	   			<select id="month"></select>   月
	   			<select id="day"></select>   日
	   		</div>
	   		<div class="center"><input type="submit"  value="注册" />  <input type="button" id="btn" value="yanzheng" /></div>
	  	</form>
  	</div>
  </body>
</html>
