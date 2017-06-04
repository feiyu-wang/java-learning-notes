package com.imooc;
//1.定义一个类
public class Telphone {
	//2.属性(成员变量) 有什么
	float screen;
	float cpu;
	float mem;
	int var = 30;
	//3.方法 干什么
	void call(){
		/*
		int var = 40;
		System.out.println("var:"+var);
		int localVar = 10;//局部变量
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		*/
		System.out.println("Telphone有打电话的功能!");
	}
	void sendMessage(){
		int localVar  = 20;//局部变量
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		System.out.println("screen:"+screen+" cpu:"+cpu+" mem:"+ mem +" Telphone有发短信的功能!");
	}
	
	public Telphone(){
		System.out.println("构造方法执行了!");
	}
	public Telphone(float newScreen,float newCpu,float newMem){
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
		System.out.println("有参的构造方法执行了!");
	}
}
