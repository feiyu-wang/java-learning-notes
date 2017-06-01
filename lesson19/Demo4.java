/**
局部内部类：

内部类的定义放在方法体内部相当于一个局部变量

外部类的方法体中实例化内部类对象

**/
class Demo4 
{
	public static void main(String[] args) 
	{
		// 能不能定义外部类的方法体中内部类的实例对象？不能
		Outer outer = new Outer();
		outer.test();
	}
}
class Outer
{
	public int age = 10; // 外部类的成员变量
	public void test()// 外部类的成员方法
	{
		 // 方法体中定义局部变量不能有访问修饰符及其他的关键字
		 final int age = 20;// 方法体中局部变量
         class Inner // 外部类的局部内部类
         {
             int age = 30; // 局部内部类的成员变量
			 void test()// 局部内部类的成员方法
			 {
			    int age= 40;
			    System.out.println("test age = "+age); // 内部类的方法体中局部变量
				System.out.println("inner age ="+this.age); // 局部内部类的成员变量
                System.out.println("outer age ="+Outer.this.age); // 外部类的成员变量
			 }
         }
        Inner in = new Inner();
        in.test();
	}
}
