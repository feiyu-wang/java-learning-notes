package com.xmal.user;

import java.util.Scanner;


/*Employee（员工父类）*/
public class Employee  {
	private String name;
	private String type;
	public static Employee [] employee=new Employee[10];
	public static int index;
	public static int count;
	public Employee(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//@Override
	public String toString() {
		return "Employee [name=" + name + ", type=" + type + "]";
	}
    //构造方法
    public Employee() {
       
    }
    public Employee(String name) {
       this.name=name;

    }

}