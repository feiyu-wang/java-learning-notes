package com.imooc;

    public class Animal extends Object{
	public int age = 10 ;
	public String name;
	public void eat(){
		System.out.println("������гԶ���������");
	}
	public Animal(){
		System.out.println("Animal�๹�췽��ִ����");
	}
	public Animal(int age){
		this.age = age;
	}
}
