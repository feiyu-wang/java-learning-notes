/**  
* @Title:  Demo1.java
* @Package com.jtb.duotai
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ţǨǨ
* @date  2017-6-2 ����09:14:38
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
 * @Description:��ϰ���콲��֪ʶ
 * @author jiatengbin
 * @date 2017-6-2 ����09:14:38
 * =======================================================
 * Myeclipse����ע�����
 * 
 * 1 һ��javaԴ�ļ��п��Զ�����class,����ֻ����һ��public���ε���
 * 
 * 2 ͬһ�������²����ظ�������ͬ����
 * 
 * 3 ʵ�ʵ���Ŀ�������̣�һ��ԭ�ļ�����һ���� 
 * ==================================================
 * ���ʿ��Ʒ�
 * 
 * ͬһ����Ŀ�У� ����Ȩ�����-----public------�κ�һ���ط����ܹ�ʹ��
 * 
 *            protected���εķ��� -------�����ܹ����ʣ�ͨ���������ȥ����
 *            
 *            default-----Ĭ�Ϸ�������----ͬһ�����������˰��Ͳ�������
 *            
 *            
 *            private----ͬһ������
 *            
 *====================================================
 * ��̬
 *====================================================
 *Object��---����ʵ����Ķ��㸸�࣬���࣬���࣬����ʵ���඼Ĭ�ϼ̳���Object��ķ���
 *
 *���ڴ����ж����������Ƿ���ͬһ������
 *
 * �����ж�hashCode()�Ƿ���ͬ
 * 
 * ---����ͬ���������Ƚ�
 * ---��ͬ�Ļ�����ȥ�Ƚ�equals()����----����Ҫ���ǵ�Object���ṩ��
 *
 *1 java���ڴ��д�Ŷ������͵����ݶ���һ����ϣɢ��ֵ-----��ϣ��
 * 
 *  ÿһ��ʵ������󶼻�����ڴ��ַ�Զ����ɹ�ϣɢ��ֵ---�̶����㷨
 *  
 *  ��һ�֣� Object���͵�����----�����ڴ��ַ����
 *  
 *  �ڶ��֣� String���͵�����---�洢���ַ�����������--�����ַ�����ĸ������ֵ��������ȥ���ɹ�ϣɢ��ֵ
 *  
 *  �����֣� Integer���͵�����---���ݰ�װ�������ֵ��Ϊ��ϣ��
 *  
 *2 ����ʵ�������ĳ�Ա������ֵȥ���ɹ�ϣ��-�����㷨�ı�
 *
 *  ����Ҫ���ǵ�Object���е�hashCode()����
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
	   // ����Person������׵�ַ�Զ����ɹ�ϣɢ��ֵ
	   Person p1 = new Person();
	   Person p2 = new Person("����",20);
	   Person p3 = new Person("zhangsan",50);
	   Person p4 = new Person("zhangsan",50);
	   
	   System.out.println("p1 hashcode = "+p1.hashCode());
	   System.out.println("p2 hashcode = "+p2.hashCode());
	   System.out.println("p3 hashcode = "+p3.hashCode());
	   System.out.println("p4 hashcode = "+p4.hashCode());
	   //String���͵����ݸ����ַ�����ĸ������ֵ�Զ����ɹ�ϣ��
	   String str1 = "aa";
	   String str2 = "bb";
	   String str3 = "aa";	   
	   System.out.println("str1 hashcode = "+ str1.hashCode());
	   System.out.println("str2 hashcode = "+ str2.hashCode());
	   System.out.println("str3 hashcode = "+ str3.hashCode());
	   //Integer���͵����ݸ��ݷ��õ�����ֵΪ��ϣ��
	   Integer i1 = new Integer(100);
	   Integer i2 = new Integer(200);
	   Integer i3 = new Integer(300);
	   System.out.println("i1 hashcode = "+i1.hashCode());
	   System.out.println("i2 hashcode = "+i2.hashCode());
	   System.out.println("i3 hashcode = "+i3.hashCode());
	   // ֱ�ӱȽ�����Person�����Ƿ���ȣ�ʹ�õ���Object���ṩ��equals()����
	   // ��Person���и��ǵ�Object���ṩ��equals()
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
