import java.util.*;
import java.math.*;
/**
类的定义和类的使用：

第一种：jdk封装好的类-----定义在jdk的src类库中---lib文件夹

        使用：System类-------java.lang.* -----直接使用
		      
			  Scanner类------import语句

第二种：自定义的类---------类中定义自己的成员变量和成员方法----实体类



第三种：执行类-------包含main()方法的类---能够真正的执行程序的类


**/
class Demo1// 执行类----jvm取加载main()中的类和对象数据
{
	public static void usePerson()
	{
		Person p1 = new Person(); // 生成Person类实例对象
		System.out.println(p1.name); // 实例对象的使用 实例对象名.成员变量
								     // 实例对象名.方法名()
		System.out.println(p1.age);
	}
	public static void main(String[] args) 
	{
		// 成员变量的获取
		System.out.println("Hello World!");
		System.out.println(Integer.MAX_VALUE); // jdk封装好的类
		usePerson();
		Person p2 = new Person();
		Person p3 = new Person();
		System.out.println("p2="+p2); // 直接打印实例对象的引用值
		System.out.println("p3="+p3);
		System.out.println(p2.gender);// 打印实例对象的成员变量---获取成员变量的值
		System.out.println(p2.bloodStyle); // 成员变量在未赋值的时候，计算机会赋数据类型的默认初始值

		System.out.println(p2.hobby);
        
		System.out.println("==================================");
		// 修改成员变量的值---通过赋值修改成员变量
		p2.gender = true;
		p2.bloodStyle = new String[]{"AB","A","B","O"};
		Hobby hobby = new Hobby(); // 生成Hobby类的实例对象
		hobby.type = "球类运动";
		hobby.level = 2; // 球类运动中的二级
		System.out.println(p2.gender);
		System.out.println(Arrays.toString(p2.bloodStyle));
		System.out.println(p2.bloodStyle[0]);
        System.out.println(hobby.type);
        
		System.out.println("====================================");
        // 使用成员方法
        p3.name = "张三";
		p3.sayHello();
        p3.runFast(1000);
		System.out.println("====================================");

		// 通过成员方法来进行赋值和取值
		System.out.println("p3 age = "+p3.age);// 获取成员变量age的值
		p3.setAge(100); // 通过成员方法setAge()给成员变量赋值
		System.out.println("p3 age = "+p3.age);
		System.out.println("p3 age = "+p3.getAge()); // 通过成员方法getAge()获取成员变量的值
		System.out.println("====================================");
		// 成员变量的非法值判断的控制-----程序员必须考虑的问题
		Person p4 = new Person();
		p4.age = -100;
		System.out.println("p4 age = "+ p4.age);
		p4.setAge(-100);
		System.out.println("p4 age = "+ p4.getAge());	
	}
}
/**
自定义一个用来描述人这一类事物的类--定义类
使用类中定义好的成员变量和成员方法--必须先生成实例对象
**/
class Person
{
    // 通过成员变量和成员方法来描述人这一类事物的静态属性和动态的方法

	// 定义成员变量---人这一类事物的什么特征
    public String name = "张三"; // 姓名-----对象类型的数据
	public int age; // 年龄-----基本数据类型
	public boolean gender ;// 性别
	public String[] bloodStyle; // 血型------数组类型的数据
	public Hobby hobby; // 描述人这一类事物的爱好

    // 定义动态成员方法----人这一类事物能够做什么...
	public void sayHello()
	{  
        String name = "王五"; // sayHello()成员访问的是局部变量
        System.out.println(name+"hello"); // name是sayHello()方法的形参
	}
	// 人可以跑的快
	public void runFast(int speed)
	{
        System.out.println(name+"可以跑"+speed+"快啊！"); // name是Person类的成员变量
	}

	// 通过成员方法来修改一个成员变量的值---赋值
	// 获取成员变量的值---通过方法来获取
	public void setAge(int newAge)
    {
		if(newAge<0||newAge>200)
		{
		    System.out.println("非法年龄，不能进行解析");			
		}
		else
		{
			 age = newAge;
		}
	}

	public int getAge()
	{
		if(age<0||age>200)
		{
			return -1;
		}
		else
		{
		   return age;
		}
	}
}
/**
自定义一个用来描述爱好这一类事物的类
**/
class Hobby
{
	// 成员变量
    public String type; // 爱好的类别
	public int level ;// 爱好的等级 
	// 成员方法
	public int getHobbyLevel()
	{
		return level;
	}
}

