package com.imooc;

    public class Animal extends Object{
	public int age = 10 ;
	public String name;
	public void eat(){
		System.out.println("动物具有吃东西的能力");
	}
	public Animal(){
		System.out.println("Animal类构造方法执行了");
	}
	public Animal(int age){
		this.age = age;
	}
}
