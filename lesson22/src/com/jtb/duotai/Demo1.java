/**  
* @Title:  Demo1.java
* @Package com.jtb.duotai
* @Description: TODO(用一句话描述该文件做什么)
* @author 牛迁迁
* @date  2017-6-2 上午09:14:38
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.jtb.duotai;

import com.jtb.bao.Student;


/**
 * @ClassName: Demo1
 * @Description:复习昨天讲解知识
 * @author jiatengbin
 * @date 2017-6-2 上午09:14:38
 * =======================================================
 * Myeclipse开发注意事项：
 * 
 * 1 一个java源文件中可以定义多个class,但是只能有一个public修饰的类
 * 
 * 2 同一个包名下不能重复定义相同的类
 * 
 * 3 实际的项目开发过程，一个原文件定义一个类 
 * ==================================================
 * 访问控制符
 * 
 * 同一个项目中： 访问权限最大-----public------任何一个地方都能够使用
 * 
 *            protected修饰的方法 -------子类能够访问，通过子类对象去调用
 *            
 *            default-----默认访问修饰----同一个包名，出了包就不能用了
 *            
 *            
 *            private----同一个类中
 *            
 *====================================================
 * 多态
 *====================================================
 *Object类---所有实体类的顶层父类，基类，超类，所有实体类都默认继承了Object类的方法
 *
 *在内存中判断俩个对象是否是同一个对象？
 *
 * 首先判断hashCode()是否相同
 * 
 * ---不相同，不再做比较
 * ---相同的话，再去比较equals()方法----必须要覆盖掉Object类提供的
 *
 *1 java堆内存中存放对象类型的数据都有一个哈希散列值-----哈希码
 * 
 *  每一个实体类对象都会根据内存地址自动生成哈希散列值---固定的算法
 *  
 *  第一种： Object类型的数据----根据内存地址生成
 *  
 *  第二种： String类型的数据---存储在字符串缓冲区中--根据字符串字母的整数值进行运算去生成哈希散列值
 *  
 *  第三种： Integer类型的数据---根据包装类的整数值作为哈希码
 *  
 *2 根据实体类对象的成员变量的值去生成哈希码-生成算法改变
 *
 *  必须要覆盖掉Object类中的hashCode()方法
 *  
 *            
 *            
 */
public class Demo1
{
   public static void main(String[] args)
   {
	   System.out.println(new Student());
	   new Person().show();
	   Object object1 = new Object();
	   Object object2 = new Object();
	   System.out.println(object1.hashCode());
	   System.out.println(object2.hashCode());
	   // 根据Person对象的首地址自动生成哈希散列值
	   Person p1 = new Person();
	   Person p2 = new Person("张三",20);
	   Person p3 = new Person("zhangsan",50);
	   Person p4 = new Person("zhangsan",50);
	   
	   System.out.println("p1 hashcode = "+p1.hashCode());
	   System.out.println("p2 hashcode = "+p2.hashCode());
	   System.out.println("p3 hashcode = "+p3.hashCode());
	   System.out.println("p4 hashcode = "+p4.hashCode());
	   //String类型的数据根据字符串字母的整数值自动生成哈希码
	   String str1 = "aa";
	   String str2 = "bb";
	   String str3 = "aa";	   
	   System.out.println("str1 hashcode = "+ str1.hashCode());
	   System.out.println("str2 hashcode = "+ str2.hashCode());
	   System.out.println("str3 hashcode = "+ str3.hashCode());
	   //Integer类型的数据根据放置的整数值为哈希码
	   Integer i1 = new Integer(100);
	   Integer i2 = new Integer(200);
	   Integer i3 = new Integer(300);
	   System.out.println("i1 hashcode = "+i1.hashCode());
	   System.out.println("i2 hashcode = "+i2.hashCode());
	   System.out.println("i3 hashcode = "+i3.hashCode());
	   // 直接比较俩个Person对象是否相等，使用的是Object类提供的equals()方法
	   // 在Person类中覆盖掉Object类提供的equals()
	   if(p3.equals(p4)) 
	   {
		   System.out.println("equals");
	   }
	   else
	   {
		   System.out.println("not equals");
	   }	   
   }
}
