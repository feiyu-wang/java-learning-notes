package com.xmal.test;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

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
    	Admin a = new Admin();
    	 ControlSystem computer = new ControlSystem();
		 System.out.println("1.管理员添加员工 2.查询员工信息 3.来访人员");
    	
		 //增加员工信息
		for (int i = 0; i < 2; i++) {
			 a.addEmpInfo();
	    	 computer.addPass();
		}
		System.out.println("请输入员工姓名：");
		System.out.println(Admin.search);
		String searName= new Scanner(System.in).next();
		 a.showInfo(searName,computer);
		/* a.addEmpInfo();
    	 computer.addPass();
    	 System.out.println(Arrays.toString(Employee.employee));
    	 System.out.println(Arrays.toString(computer.cards));*/
    	
    	 
    	 System.out.println("请输入您的身份：0.员工1.访客 2.管理员 ");
		
    	key=new Scanner(System.in).nextInt();
		if (key==0) {
			
       // Employee e = new Employee("员工a");
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