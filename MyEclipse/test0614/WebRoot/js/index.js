window.onload=function (){
	var date=new Date();
	var select=document.getElementsByTagName("select");
	function $(id){
  		return document.getElementById(id);
	}
	
	function initSelect(obj,begin,end){
		if(obj.length==0){
			console.log(11111111111);
			for(i=begin;i<=end;i++){
				var option=document.createElement("option");
				option.text=i;
				obj.appendChild(option);
			}
		}else{
			if(begin<=end){
				console.log(begin+"--22---"+end);
				for(i=begin;i<end;i++){
					console.log(i);
					var option=document.createElement("option");
					option.text=i+1;
					obj.appendChild(option);
				}
			}else if(begin>end){
				console.log(begin+"--11---"+end);
				for(i=end;i<begin;i++){
					console.log(i);
					obj.options.remove(end);
				}
			}
		}
		
	}
	initSelect($("year"),1997,date.getFullYear());
	initSelect($("month"),1,12);
	initSelect($("day"),1,31);
	function judgeDays(yeartxt,monthtxt){
		if(monthtxt==2){
			if((yeartxt%4==0&&year%100!==0)||year%400==0){
				return 29;
			}else{
				return 28;
			}
		}else if(monthtxt==1||monthtxt==3||monthtxt==5||monthtxt==7||monthtxt==8||monthtxt==10||monthtxt==12){
			return 31;
		}else{
			return 30;
		}
		
	}
	for(i=0;i<=select.length-1;i++){
		select[i].onchange=function(){
			//console.log($("day").length);
			initSelect($("day"),$("day").length,judgeDays($("year").options[$("year").selectedIndex].value,$("month").options[$("month").selectedIndex].value));
		}
	}
	
	function valite(obj,rex,msg){
		console.log(obj.value);
		if(obj.value==""){
			obj.parentNode.lastChild.innerHTML="请输入"+msg;
		}else{
			var flag=rex.test(obj.value);
			console.log(obj.parentNode.lastChild);
			if(flag){
				obj.parentNode.lastChild.className="";
				obj.parentNode.lastChild.innerHTML="";
			}else{
				obj.parentNode.lastChild.className="error";
				obj.parentNode.lastChild.innerHTML="输入错误";
			}
		}
		return flag;
	}
	$("btn").onclick=function (){
		var checkName=valite($("name"),/^[0-9a-zA-Z\u4e00-\u9fa5_]{3,16}$/,"昵称");//可以为汉字、数字、字母（大小写）、下划线 3-16位
		var checkYx=valite($("yx"), /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/,"邮箱");//把邮箱地址分成“第一部分@第二部分”这样第一部分：由字母、数字、下划线、短线“-”、点号“.”组成，第二部分：为一个域名，域名由字母、数字、短线“-”、域名后缀组成，
		var checkPhone=valite($("phone"),/^0\d{2,3}-?\d{7,8}$/,"电话号码");//区号+号码，区号以0开头，3位或4位号码由7位或8位数字组成区号与号码之间可以无连接符，也可以“-”连接如01088888888,010-88888888,0955-7777777 
		var checkId=valite($("id"), /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/,"身份证号码");//身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X 
		var checkMobile=valite($("mobile"),/^1[3,5,8]\d{9}$/,"手机号码");// 只允许以13、15、18开头的号码11位
		var checkPass=valite($("pass"), /^[A-Za-z0-9]{6,20}$/,"密码");//密码规则：6-20位字母数字组合：
		//var checksame=$("pass")
		if($("pass2").value==""){
			$("pass2").parentNode.lastChild.className="";
			$("pass2").parentNode.lastChild.innerHTML="请再次确认密码";
			console.log(false);
		}else if($("pass2").value!=$("pass").value){
			$("pass2").parentNode.lastChild.className="error";
			$("pass2").parentNode.lastChild.innerHTML="两次密码不一致";
			console.log(false);
		}else if($("pass2").value==$("pass").value){
				$("pass2").parentNode.lastChild.innerHTML="";
				$("pass2").parentNode.lastChild.className="";
				if(checkPass&&checkName&&checkYx&&checkPhone&&checkMobile&&checkId){
				console.log(true);
			}
		}
		
	}
	function checkInput(){
		return false;
	}
	function getNum(){
	var str="asd.asd,eee;ttt";
	var newstr = str.replace(/[^0-9a-zA-z]/ig,""); //匹配字符串的字母数字
	var b=newstr.replace(/(.{3})/g,'$1,');
	var c=b.substr(0,b.length-1);
	alert(c);
	//alert(b+(Number(value) + Number(1)))
}
	getNum();
	
	
}