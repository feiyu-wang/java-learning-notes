package com.jtb.cn;

import com.jtb.cn1.Student;

public class Demo1 
{

	/**
	 * @author jiatengbin
	 * @time 2017-6-1 10:17am
	 * @description ���ʿ��Ʒ�
	 * @param args
	 */
	private int count = 100; // ˽�еĳ�Ա����
	public static void main(String[] args) 
	{
		System.out.println("hello wolrd");
		Person p = new Person();
	    p.printStr("main person");
	    new Student().shout();
	    new Student().printStr("student str");	
	}
	/**
	 * @description private˽�еķ��ʣ� ֻ���ڱ����з���
	 * @param person
	 * ˽�еĳ�Ա����
	 * default�������η���������ǰ�治���κη���,��ͬһ���ж��ܷ���
	 */
	public static void callPerson(Person person)
	{
		 person.printStr("Demo1 person");
	}

}
