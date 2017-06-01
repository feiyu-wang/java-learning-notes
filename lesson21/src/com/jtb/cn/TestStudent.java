package com.jtb.cn;

import com.jtb.cn1.Car;
import com.jtb.cn1.Student;

public class TestStudent 
{

	/**
	 * @param args
	 * @author jiaterngbin
	 * @description 多态的发生
	 * 
	 * 1 多态发生的前提： 
	 * 
	 * 2 多态发生的特征：
	 * 
	 * 3发生多态的子类不能调用独有方法的解决办法？
	 * 	
	 * 4满足了多态发生的前提，但是不一定会发生多态。
	 * 
	 * 什么发生多态？ 什么时候不会发生多态?
	 * 
	 */
	public static void main(String[] args)
	{
		Person person = new Person();
		person.callCar(new Car());
		person.fun1();
		person.fun2();
		person.printStr("没有发生多态");
		Student student = new Student();
		student.callCar(new Car());
		student.fun1();
		student.fun2();
		student.printStr("子类也没有发生多态");
		
		System.out.println("=======发生多态的情况=============");
		// 父类的引用指向子类的实例对象
		// 子类独有的方法不能被使用
		// 发生多态： 编译看左，运行看右 
		Person person2 = new Student();
		//Student  student2 = new Person();
		person2.callCar(new Car());
		person2.fun1();
		person2.fun2();
		
		System.out.println("========类型检测强转=================");
		// 由于发生多态，子类对象独有的方法不能被调用？ 
		//person2.shout();
		// 解决思路： 程序员明确告诉计算机虽然对象名看上去像是父类的对象，实际上堆内存创建的
		// 实例对象是子类对象，将父类对象强转为子类的对象名，为了调用子类独有的方法
		// instaceof语句主要是用于对象类型数据判断
		// 一旦判断成功就要进行数据类型的强转
		if(person2 instanceof Student)
		{
			// 类型检测结果是true,那就说明person2是一个Student子类对象
			// 通过强转将person2转换成Student对象，调用Student的方法
			Student student2 = (Student)person2;
			student2.callCar(new Car());
			student2.fun1();
			student2.fun2();
			// 通过强转能够调用子类独有的方法
			student2.shout();			
		}
		else
		{
		   //类型检测的结果是false,person2不是Student子类对象
		   // 不能通过强转
			student.printStr("person2 不是student子类对象");
		}	
		
		System.out.println("=================是否会发生多态=====================");
		//虽然满足了多态的俩个前提，但是方法的调用过程中没有发生多态
		//这俩种覆盖区别：发生多态覆盖，非静态成员方法被覆盖
		//静态成员方法被覆盖的话，编译和运行都是看左，不会发生多态
		//静态的成员方法的使用跟实例对象没有关系。只跟编译器加载的类有关。
		Person person3 = new Man();
		Person.callCar(new Car());
		Person.fun1();
		person3.fun2();
		//person3.makeMoney();
	}

}
