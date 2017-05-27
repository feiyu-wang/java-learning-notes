/**
方法的覆盖： 有继承关系的俩个类中，子类定义与父类相同的方法
方法名，参数相同，方法中实现肯定是不一样的

方法的重载：同一个类中，方法名相同，但是参数个数，参数类型，参数定义的位置
不同。

final关键字

1 final 用于修饰变量----最终常量

2 final 用于修饰方法 --- 子类无法覆盖父类

3 final 用于修饰类 ----- 最终类不能被继承

垃圾回收机制

jvm会自动清理堆内存中的垃圾--内存不够

程序员自己写finalize() 方法，控制jvm去处理内存垃圾

**/
class Demo2 extends Object
{
	//1 覆盖掉Object；类中finalize()方法
	public void finalize()
	{
       System.out.println("正在消除实例对象");
	}
	public Demo2()
	{
		System.out.println("正在生成实例对象");
	}
	public static void main(String[] args) 
	{
		System.out.println("==============================");
		Animal a = new Animal(); 
		a.show();
		Dog d = new Dog();
		d.show();
		Dog d1 = new Dog("二汪");
		//d1.printString();
        System.out.println("==============================");
		Animal a1 = new Dog();
		a1.show();

		System.out.println("==========final===========");

		a.printString(a.name);

		System.out.println("========垃圾回收机制===========");
		new Demo2();
		new Demo2();
		new Demo2();
		new Demo2(); // 创建的实例对象称为垃圾
		System.gc(); // 调用jvm去运行垃圾回收器，系统会自动调用finalize()方法

	}
}
class Animal
{
	public String name = "zhangsan";
	static
	{
		printString("<<Animal>>");
	}
	public Animal()
	{
		printString(" Animal ");
	}
	public Animal(String name)
	{
       this.name = name;
	   printString(name);
	   printString("Animal name");
	}
	public static void printString(String name)
	{
       System.out.println("Animal print "+name);
	}

	public void show()
    {
		System.out.println("Animal show........");
	}
}

class Dog extends Animal
{
	private String name; 
	static
	{
        printString("<<Dog>>");
	}
	public Dog()
	{
         printString("Dog");
	}
	public Dog(String name)
	{
		super("小辉"); // super(参数)调用父类的有参构造方法
        this.name = name; // 强制调用父类同名变量
		printString(super.name);
		printString("Dog name");
	}
	// 1 静态覆盖静态
	public static  void printString(String name)
	{
	   // super和this关键字不能在static修饰的方法或者代码块中使用	   
	   // 强制调用父类的成员方法
       System.out.println("Dog print "+name);
	}
	// 子类覆盖的方法权限大于或者等于父类方法权限
    public void show()
	{ 
        //super.show();
		System.out.println("Dog show.......");
	}
}