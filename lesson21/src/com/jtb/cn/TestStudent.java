package com.jtb.cn;

import com.jtb.cn1.Car;
import com.jtb.cn1.Student;

public class TestStudent 
{

	/**
	 * @param args
	 * @author jiaterngbin
	 * @description ��̬�ķ���
	 * 
	 * 1 ��̬������ǰ�᣺ 
	 * 
	 * 2 ��̬������������
	 * 
	 * 3������̬�����಻�ܵ��ö��з����Ľ���취��
	 * 	
	 * 4�����˶�̬������ǰ�ᣬ���ǲ�һ���ᷢ����̬��
	 * 
	 * ʲô������̬�� ʲôʱ�򲻻ᷢ����̬?
	 * 
	 */
	public static void main(String[] args)
	{
		Person person = new Person();
		person.callCar(new Car());
		person.fun1();
		person.fun2();
		person.printStr("û�з�����̬");
		Student student = new Student();
		student.callCar(new Car());
		student.fun1();
		student.fun2();
		student.printStr("����Ҳû�з�����̬");
		
		System.out.println("=======������̬�����=============");
		// ���������ָ�������ʵ������
		// ������еķ������ܱ�ʹ��
		// ������̬�� ���뿴�����п��� 
		Person person2 = new Student();
		//Student  student2 = new Person();
		person2.callCar(new Car());
		person2.fun1();
		person2.fun2();
		
		System.out.println("========���ͼ��ǿת=================");
		// ���ڷ�����̬�����������еķ������ܱ����ã� 
		//person2.shout();
		// ���˼·�� ����Ա��ȷ���߼������Ȼ����������ȥ���Ǹ���Ķ���ʵ���϶��ڴ洴����
		// ʵ��������������󣬽��������ǿתΪ����Ķ�������Ϊ�˵���������еķ���
		// instaceof�����Ҫ�����ڶ������������ж�
		// һ���жϳɹ���Ҫ�����������͵�ǿת
		if(person2 instanceof Student)
		{
			// ���ͼ������true,�Ǿ�˵��person2��һ��Student�������
			// ͨ��ǿת��person2ת����Student���󣬵���Student�ķ���
			Student student2 = (Student)person2;
			student2.callCar(new Car());
			student2.fun1();
			student2.fun2();
			// ͨ��ǿת�ܹ�����������еķ���
			student2.shout();			
		}
		else
		{
		   //���ͼ��Ľ����false,person2����Student�������
		   // ����ͨ��ǿת
			student.printStr("person2 ����student�������");
		}	
		
		System.out.println("=================�Ƿ�ᷢ����̬=====================");
		//��Ȼ�����˶�̬������ǰ�ᣬ���Ƿ����ĵ��ù�����û�з�����̬
		//�����ָ������𣺷�����̬���ǣ��Ǿ�̬��Ա����������
		//��̬��Ա���������ǵĻ�����������ж��ǿ��󣬲��ᷢ����̬
		//��̬�ĳ�Ա������ʹ�ø�ʵ������û�й�ϵ��ֻ�����������ص����йء�
		Person person3 = new Man();
		Person.callCar(new Car());
		Person.fun1();
		person3.fun2();
		//person3.makeMoney();
	}

}
