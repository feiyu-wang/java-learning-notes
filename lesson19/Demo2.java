/**
成员内部类中成员变量和成员方法的使用
**/
class Demo2 
{
	public static void main(String[] args) 
	{
		//生成外部类的内部类的实例对象
		Outer.Inner in = new Outer().new Inner();
		in.print();
		// 生成外部类的内部类的内部类的实例对象
		Outer.Inner.Inner1 in1 = new Outer().new Inner().new Inner1();
		in1.test();
	}
}
class Outer
{
	public int age = 10; // 外部类的成员变量
	private void test()// 外部类的成员方法
	{
		System.out.println("Outer test");
		// 调用外部类的内部类的成员变量
		Inner in = new Inner();
		System.out.println("outer test age = "+in.age);
	}
	class Inner//外部类的成员内部类
	{
		public int age = 20; // 外部类的内部类的成员变量
		public void print() //外部类的内部类的成员方法	
		{
           int age = 30; //内部类的成员方法中的局部变量 
		   // 外部类的成员变量与内部类成员变量和内部类中方法体中的
		   //成员变量重名的时候，方法体直接访问变量名访问的是
		   //方法体中的局部变量
		   System.out.println("print age="+age);
		   // 第一种： 生成内部类的实例对象
		   Inner in = new Inner();
		   System.out.println("inner age = "+in.age); //内部类的成员变量
           //第二种： 通过this关键字表示当前的实例对象
		   // 通过this.成员变量来访问内部类的成员变量		   
		   System.out.println("inner age = "+ this.age);
		   // 第一种： 生成外部类的实例对象
		   Outer out = new Outer();
		   System.out.println("outer age = "+out.age);
		   // 第二种：通过外部类类名来访问外部类的成员变量
		   System.out.println("outer age = "+Outer.this.age);
		   // 内部类的方法体中直接调用内部类的成员方法
		   test();
		   this.test();// 直接调用方法用this和不用this效果是相同的
		   // 内部类中调用外部类的同名方法
		   Outer.this.test();
		}
		//内部类的成员方法与外部类的成员方法重名
		public void test()
		{
		   //内部类的成员方法调用外部类的同名成员方法
		   Outer.this.test();
           System.out.println("Inner test");
		   System.out.println("Inner test outer age = "+Outer.this.age);
		}
		class Inner1
		{
			void test()
			{
				System.out.println("Inner1 test");
			}
		}
	}
}
