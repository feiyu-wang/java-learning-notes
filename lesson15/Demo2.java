import java.util.*;
/**
构造方法的定义,使用,作用,重载,this关键字的用法.
**/
class Demo2
{
	public static void main(String[] args) 
	{
		System.out.println("===空参构造方法====");
		Animal a1 = new Animal(); // 实例化对象的过程，默认调用空参构造方法
		// 会成员变量全部赋初始值
		// 构造方法的作用---进行不同的初始化赋值操作---构造方法的重载
        System.out.println(a1.getType());
        System.out.println(a1.getAge());
        System.out.println(a1.getCharacter());
        System.out.println(a1.getCountry());
		System.out.println("=====有一个参数的构造方法=====");
		Animal a2 = new Animal("老虎");// 不同的实例化对象会调用不同的构造方法
		// 完成了成员变量的赋值

		System.out.println("=====有俩个参数的构造方法=====");
		Animal a3 = new Animal("华南虎",10); // 调用有俩个参数的构造方法
        
		System.out.println("=====全参构造方法==========");
		Animal a4 = new Animal("东北虎",7,"凶猛",new String[]{"中国东北","越南"});
        
		//System.out.println(this.getType());
		// this关键字的第一种用法：表示当前对象
		a4.run();

	}
}
class Animal
{
	// 实体类： 成员变量,成员方法,成员变量的get和set,空参构造方法和全参的构造方法
	//成员变量
	private String type; // 品种
	private int age; // 年龄
	private String character; // 性格
	private String[] country; // 国籍
    
	// 定义一个空参的构造方法
	public Animal()
	{
		System.out.println("Animal类的空参构造方法");
	}
	// 定义一个有一个参数的构造方法
	public Animal(String type)
	{
		 //this(); // 调用空参的构造方法
         this.type = type;
		 System.out.println("type =" +type);
		 System.out.println("Animal类的一个参数的构造方法");
	}
    // 定义一个有俩个参数的构造方法
	public Animal(String type,int age)
	{
		//this("东北虎",20,"特别凶猛",new String[]{"老挝","新加坡"});
		//this("老虎");// 调用有一个参数的构造方法
		this(type);
        this.type = type;
		this.age = age;
		System.out.println("type = "+type);
		System.out.println("age = "+age);
		System.out.println("Animal类的俩个参数的构造方法");
	}
	// 定义全参的构造方法----所有的成员变量都进行赋值
	public Animal(String type,int age,String chracter,String[] country)
	{ 
		//this(); // this关键字调用构造方法必须写在构造器的第一句
		//this("华南虎",20); // 调用有俩个参数的构造方法
        this.type = type;
		this.age = age;
		this.character = character;
		this.country = country;
        System.out.println("type = "+type);
		System.out.println("age = "+age);
		System.out.println("character ="+character);
		System.out.println("country ="+Arrays.toString(country));
		System.out.println("Animal类的全参构造方法");
	}

	// 成员方法

	public void run()
	{
		System.out.println(this.getType());
		System.out.println("animal run......");
	}
	public void jump()
	{
		System.out.println("animal jump......");
	}
    // 成员变量的赋值和取值
	public void setType(String newType)
	{
         type = newType;
	}
	public String getType()
	{
		return type;
	}
	public void setAge(int newAge)
	{
       age = newAge;
	}
	public int getAge()
	{
		return age;
	}
	public void setCharacter(String newCh)
	{
		character = newCh;
	}
	public String getCharacter()
	{
		return character;
	}
	public void setCountry(String[] newCou)
	{
       country = newCou;
	}
	public String[] getCountry()
	{
		return country;
	}
}