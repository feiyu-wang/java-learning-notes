package com.jtb.cn;

import com.jtb.cn1.Car;

public class Man extends Person 
{
   private String beard;//���� 
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
   //man���า�ǵ�Person���е�callCar()����
   public static void callCar(Car car)
   {
	    //car.fun1();
	    printStr("Man callcar");
   }
   // man���า�ǵ�Person����fun1()����
   public static void fun1()
   {
	   printStr("Man fun1");
   }
   
   // man������еķ���
   public void makeMoney()
   {
	  printStr("Man make monkey ");
   }
}
