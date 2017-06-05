package com.xmal.test;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

import com.xmal.sys.ControlSystem;
import com.xmal.sys.Door;
import com.xmal.user.Admin;
import com.xmal.user.Employee;
import com.xmal.user.Guest;
public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a = new Admin();
   	 	ControlSystem computer = new ControlSystem();
   	 while(true){
   		System.out.println("===================================");
		System.out.println("=======1.用户登录 2.访客  3.退出==========");
		System.out.println("===================================");
		int keyNum=new Scanner(System.in).nextInt();
		while(true){
			if (keyNum==1) {
				System.out.println("====================================");
				System.out.println("=======1.管理员登录 2.员工 3.退出==========");
				System.out.println("====================================");
			}else if (keyNum==1) {
				Guest guest = new Guest("李四");
		        Door door = new Door();
		        while(true){
					guest.pressRing(door);   //按门铃
		            boolean bn = a.work(door, guest);    //管理员监听门铃
		            if(bn){
		            	door.setState("开启电子门");                       // 开启电子门
		                System.out.println("管理员 打开了电子门");
		                door.setState("关闭电子门"); 
		                break;
		            }else { //验证没通过
		                System.out.println("拒绝访客进入！");
		            }
		        }
			}else{
				break;
			}
		}
   	 }
		
		
		
		
		/*while(true){
			if (keyNum==1) {
			System.out.println("请输入您的姓名：");
			String strName=new Scanner(System.in).next();
			System.out.println(a.checkEmployee(strName));
			if (a.checkEmployee(strName)) {
			System.out.println("请选择身份验证类型：1.密码，2.胸卡，3.指纹");
			int type=new Scanner(System.in).nextInt();
	        Door door = new Door();
	        while(true){
	        	System.out.println("请输入您的验证密码：");
	    		String input = new Scanner(System.in).next();//员工输入身份验证
	            boolean bn = computer.validate(input,type);//根据输入的内容，验证身份
	            if (bn) //验证通过
	            {
	            	door.setState("开启电子门");
	                System.out.println("<身份验证成功， " +Employee.employee[Employee.index].getName() + " 通过电子门>");
	                door.setState("关闭电子门");
	                break;
	            } else { //验证没通过
	                System.out.println("身份验证失败！");
	            }
	        }
			}else{
	        	System.out.println("对不起，您不是本公司员工");
	        }
				
			}*/
		}
	}


