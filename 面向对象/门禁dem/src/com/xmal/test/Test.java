package com.xmal.test;

import java.util.Scanner;

import com.xmal.sys.ControlSystem;
import com.xmal.sys.Door;
import com.xmal.user.Admin;
import com.xmal.user.Employee;
import com.xmal.user.Guest;


public class Test {

    //main方法
	static int key;
	static int type;
    public static void main(String[] args) {
    	 Admin admin1 = new Admin();
    	 Employee e = new Employee();
    	System.out.println("请输入您的身份：0.员工1.访客 2.管理员 ");
		key=new Scanner(System.in).nextInt();
		if (key==0) {
		System.out.println("请选择身份验证类型：1.密码，2.胸卡，3.指纹");
		type=new Scanner(System.in).nextInt();
      
       // Employee e = new Employee("员工a");
		System.out.println("请输入您的姓名：");
		String strName=new Scanner(System.in).next();
		if (admin1.checkEmployee(strName)) {
        ControlSystem computer = new ControlSystem();
        Door door = new Door();
        while(true){
        	System.out.println("请输入您的验证密码：");
    		String input = new Scanner(System.in).next();//员工输入身份验证
            boolean bn = computer.validate(input,type);//根据输入的内容，验证身份
            if (bn) //验证通过
            {
            	door.setState("开启电子门");
                System.out.println("<身份验证成功， " + e.employee[admin1.index].getName() + " 通过电子门>");
                door.setState("关闭电子门");
                break;
            } else { //验证没通过
                System.out.println("身份验证失败！");
            }
        }
		}else{
        	System.out.println("对不起，您不是本公司员工");
        }
		}else if(key==1){
			Guest guest = new Guest("李四");
	        Admin admin = new Admin("王五");
	        Door door = new Door();
	        while(true){
				guest.pressRing(door);   //按门铃
	            boolean bn = admin.work(door, guest);    //管理员监听门铃
	            if(bn){
	            	door.setState("开启电子门");                       // 开启电子门
	                System.out.println("管理员 " + admin.getName() + " 打开了电子门");
	                door.setState("关闭电子门"); 
	                break;
	            }else { //验证没通过
	                System.out.println("拒绝访客进入！");
	            }
	        }
		}else{
			 Admin admin = new Admin("张三");
		     Door door = new Door();
		     while(true){
		            boolean bn = admin.work(door); 
		            if(bn){
		            	door.setState("开启电子门");                    // 开启电子门
		                System.out.println("管理员 " + admin.getName() + " 开启了电子门");
		                door.setState("关闭电子门"); 
		                break;
		            }
		        }
		}
    }

}