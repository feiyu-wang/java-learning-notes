/**
内部类： 在类的内部定义一个类，相互之间的方法可以同时互相调用
**/
class Demo1 
{
	public static void main(String[] args) 
	{
	    Outer out = new Outer(); //实例化外部类的实例对象
		out.test();
    }
}
class Outer //外部类
{
	private int outer_i = 10; // 外部类的成员变量
	public void test() // 外部类的成员方法
	{
      System.out.println("test outer_i ="+outer_i);
	  Inner in = new Inner();
	  in.print();
	  // 外部类不能直接访问内部类的成员变量和成员方法
	  // 必须先生成内部类的实例对象，通过内部类的实例对象去调用内部类的成员变量
	  // 及成员方法
	  System.out.println("inner_i="+in.inner_i);
	}
	class Inner // 外部类的成员内部类
	{
		public int inner_i = 100; // 内部类的成员变量
		public void print()// 内部类的成员方法
		{
			test();
            System.out.println("print inner_i="+inner_i); // 内部类直接自己成员变量
			System.out.println("print outer_i="+outer_i); // 内部类可以直接访问外部类的成员变量		
		}		
	}	
}