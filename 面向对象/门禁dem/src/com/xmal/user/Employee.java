package com.xmal.user;

import java.util.Scanner;


/*Employee（员工父类）*/
public class Employee  {
	private String name;
	private String type;
	public Employee [] employee=new Employee[10];
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

    //构造方法
    public Employee() {
       
    }
    public Employee(String name) {
       this.name=name;

    }

}