package com.imooc;
//1.����һ����
public class Telphone {
	//2.����(��Ա����) ��ʲô
	float screen;
	float cpu;
	float mem;
	int var = 30;
	//3.���� ��ʲô
	void call(){
		/*
		int var = 40;
		System.out.println("var:"+var);
		int localVar = 10;//�ֲ�����
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		*/
		System.out.println("Telphone�д�绰�Ĺ���!");
	}
	void sendMessage(){
		int localVar  = 20;//�ֲ�����
		System.out.println("localVar:"+localVar);
		System.out.println("var:"+var);
		System.out.println("screen:"+screen+" cpu:"+cpu+" mem:"+ mem +" Telphone�з����ŵĹ���!");
	}
	
	public Telphone(){
		System.out.println("���췽��ִ����!");
	}
	public Telphone(float newScreen,float newCpu,float newMem){
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
		System.out.println("�вεĹ��췽��ִ����!");
	}
}
