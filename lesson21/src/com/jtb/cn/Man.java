package com.jtb.cn;

import com.jtb.cn1.Car;

public class Man extends Person 
{
   private String beard;//胡须 
   private int height;
   public Man()
   {
	  super();   
   }
   public Man(String beard,int height,String name,int age)
   {
	   super(name,age);
	   this.beard = beard;
	   this.height = height;
   }
   //man子类覆盖掉Person类中的callCar()方法
   public static void callCar(Car car)
   {
	    //car.fun1();
	    printStr("Man callcar");
   }
   // man子类覆盖掉Person类中fun1()方法
   public static void fun1()
   {
	   printStr("Man fun1");
   }
   
   // man子类独有的方法
   public void makeMoney()
   {
	  printStr("Man make monkey ");
   }
}
