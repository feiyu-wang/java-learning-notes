/**
成员内部类中的静态内部类------static关键字

static 成员变量-----类成员
static 成员方法-----类成员方法
static 代码块-------静态工厂

static 类----静态类----静态内部类

1 创建实例化对象

2 静态内部类的成员变量和成员方法默认都是静态的

  所以定义不定义
  
  静态内部类中的方法不能直接访问外部类的非静态的成员变量和非静态成员方法

**/
class Demo3 
{
	public static void main(String[] args) 
	{
		//创建外部类的静态内部类的实例对象
        Outer.Inner in  = new Outer.Inner(); 
		in.test();
	}
}
class Outer
{
	public static int age = 10; //外部类的静态成员变量
	public String name = "zhangsan";// 外部类的非静态成员变量
	public static  void test() // 外部类的成员方法
	{
        System.out.println("Outer test");
		// 外部类中访问内部类的数据
		Inner in = new Inner();
		System.out.println("outer test age = "+in.age);
	}
    static class Inner// 外部类的静态内部类
    {
	    int age = 20;// 静态内部类的成员变量
		public void test()
		{
			int age = 30; // 静态内部类的局部变量
			// 直接访问变量名访问的是静态内部类的局部变量
			System.out.println("Inner test age = "+age);
			// 访问静态内部类的成员变量 this---非静态的
			Inner in = new Inner();
            System.out.println("inner age = "+in.age);
            // 访问外部类的成员变量---不能使用外部类的
			System.out.println("Outer age = "+Outer.age);
			// 静态内部类不能直接访问非静态的成员变量
			Outer out = new Outer();
			System.out.println(out.age);
			System.out.println("Outer name = "+out.name);
			// 内部类调用外部类的成员方法
            Outer.test();
		}
    }

}
