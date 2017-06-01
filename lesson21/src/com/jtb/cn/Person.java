package com.jtb.cn;

import com.jtb.cn1.Car;

/**
 * 
 * @author jiatengbin
 * @time 2017-6-1 10:39am
 * @description person实体类
 *
 */
public class Person
{
   private String nameString;
   private int age;
   public Person()
   {
	   super();   
   }
   public Person(String nameString,int age)
   {
	  super();
	  this.nameString = nameString;
	  this.age = age;
	  printStr("Person");
   }
   /**
    * @description protected访问修饰
    * @param str    * 
    * 子类对象能否调用方法
    */
   protected static void printStr(String str)
   {	   
	   System.out.println(str);
   }
   public static void callCar(Car car)
   {
	   car.fun1();
	   printStr("Person callCar");
   }
   public static void fun1()
   {
	  printStr("Person fun1");   
   }
   public void fun2()
   {
	   printStr("Person fun2");
   }   
//   public static void main(String[] args)
//   {
//	   Demo1.callPerson(new Person("zangsan",20));
//   }
   
}
