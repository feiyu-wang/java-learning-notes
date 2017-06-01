package com.jtb.cn1;

import com.jtb.cn.Demo1;
import com.jtb.cn.Person;

public class Student extends Person
{
	private String nameString;
	private int age;
	private int id ;
	private double score;
	public Student()
	{
		super();
	}
	// student子类覆盖Peson类的callCar()方法
	public  static void callCar(Car car)
	{
		car.fun2();
	}
	// student子类覆盖Person类的fun1()方法
	public  static void fun1()
	{
		printStr("Student fun1");
	}	
	// student子类独有的方法shout()方法
	public void shout()
	{		
		printStr("Student shout");
	}	
}
