/**
类的继承

在面向对象中，所有的实体类默认的顶层父类都是Object类

String ------Object 
Integer-----Number-----Object  

还要是发生继承关系的类： 

成员变量和成员方法特点：

私有还是公有：　(private ,protected )私有的---即使有继承关系，子类不能直接使用父类的成员变量或者成员方法
                 公有的---子类直接使用父类的成员变量和成员方法

构造方法不能直接继承。

1  子类的空参的构造方法会默认调用父类空参构造方法，相当于程序默认执行了super()语句

2  子类的全参构造默认调用父类空参构造。

3  通过super语句可以强制调用父类的有参数的构造方法

super 关键字：

1  调用父类的构造方法

2  当父类和子类的成员变量或者成员方法相同时，强制的调用我父类的成员变量和成员方法

Object类：

直接继承：toString() hashCode() equals()


**/
class Demo1 extends Object 
{
	public static void main(String[] args) 
	{
		System.out.println("=============自定义的继承============");
//		System.out.println(new Demo1().equals(new Demo1()));
//		System.out.println(new Demo1().hashCode());
//		System.out.println(new Demo1());
//		System.out.println(new Integer("123").hashCode()); // 直接打印Integer对象的哈希码
        Person p1 = new Person();
		Person p2 = new Person("张三",10,false);
		
		System.out.println("=====student子类数据========");
		System.out.println("=======空参Student===========");
		Student stu1 = new Student();
		System.out.println("=======全参Student==========");
		Student stu2 = new Student("王五",20,true,0100,98.5);
//		System.out.println(stu1.name);
//		System.out.println(stu1.age);
//		System.out.println(stu1.gender);
        stu2.printString(stu2.getName());
		stu2.printInt(stu2.getAge());
		stu2.printBoolean(stu2.getGender());
        stu2.printInt(stu2.id);		
		System.out.println(stu2.getScore());
		System.out.println("======Academic子类数据=======");
//		System.out.println(a1.name);
//		System.out.println(a1.age);
//		System.out.println(a1.gender);
        Academic  a1 = new Academic();
		a1.printString(a1.getName());
		a1.printInt(a1.getAge());
		a1.printBoolean(a1.getGender());
		//System.out.println(a1.getScore());
	}
	public String toString()
	{
		return "demo instance ";
	}
}
class Person //继承结构中最上层父类的成员变量和成员方法定义为公有，打破类的封装
{
   public String name;
   public int age;
   public boolean gender;
   public Person()
   {
	   // 构造方法调用静态成员方法
	   printString("Person 空参");
   }
   public Person(String name,int age,boolean gender)
   { 
       // 构造方法没有静态和非静态之分，只要是成员方法都能使用
       this.name = name;
	   this.age = age;
	   this.gender = gender;
	   printString(name);
	   printInt(age);
	   printBoolean(gender);
	   printString("person 全参");
   }
   public static void printString(String name)
   {
      System.out.println(name);
   } 
   public void printInt(int age)
   {
	   System.out.println(age);
   }
   public void printBoolean(boolean gender)
   {
      System.out.println(gender);
   }
}
// Person类的一级子类
class Student extends Person
{
	private String name;
	private int age;
	private boolean gender;
    public int id;// 学生的学号 
	private double score;// 学生成绩
	public Student()
	{
		super(); // super 关键字第一种： 调用父类的构造方法
        super.printString("Student 空参");
	}
	public Student(String name,int age,boolean gender,int id,double score)
	{
		//super();// 默认会调用父类的空参构造
		// 通过super语句调用父类的全参构造
		super("刘高",50,false);
        this.name = super.name;
		this.age = super.age;
		this.gender = super.gender;
		this.id = id;
		this.score = score;
		// super关键字第二用法： 当父类和子类的成员变量或者方法相同的时候
		// 强制调用父类的成员变量和成员方法，用super.成员变量或者成员方法
		super.printString("Student 全参");
	}
	public double getScore()
	{
		return score;
	}
	public static void printString(String name)
	{
         System.out.println("..........."+name);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

    public int getAge()
	{
		return age;
	}
	public boolean getGender()
	{
		return gender;
	}
}
// Person类的二级子类
class Academic  extends Student
{
    private String grade; //本科生班级
}
class Master  extends Student
{
    private  String direction;// 研究生研究方向 
}

public boolean  a(){
	boolean btn=false;
	for (int i=0;i<100 ;i++ ) {
			if (i==5) {
				btn=true;
				break;
			}
	}
	return btn;
}