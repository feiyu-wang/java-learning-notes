package com.jtb.cn;

import com.jtb.cn1.Student;

public class Demo1 
{

	/**
	 * @author jiatengbin
	 * @time 2017-6-1 10:17am
	 * @description 访问控制符
	 * @param args
	 */
	private int count = 100; // 私有的成员变量
	public static void main(String[] args) 
	{
		System.out.println("hello wolrd");
		Person p = new Person();
	    p.printStr("main person");
	    new Student().shout();
	    new Student().printStr("student str");	
	}
	/**
	 * @description private私有的访问： 只能在本类中访问
	 * @param person
	 * 私有的成员方法
	 * default访问修饰符：方法体前面不加任何访问,在同一包中都能访问
	 */
	public static void callPerson(Person person)
	{
		 person.printStr("Demo1 person");
	}

}
