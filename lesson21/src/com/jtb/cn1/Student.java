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
	// student���า��Peson���callCar()����
	public  static void callCar(Car car)
	{
		car.fun2();
	}
	// student���า��Person���fun1()����
	public  static void fun1()
	{
		printStr("Student fun1");
	}	
	// student������еķ���shout()����
	public void shout()
	{		
		printStr("Student shout");
	}	
}
