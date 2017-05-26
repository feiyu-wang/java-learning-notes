/**
单态设计模式： 6种写法

将实体类设计为单态------改类在外部使用时只能有一个实例对象产生

实例对象在内存中是唯一的
**/
class Demo1 
{
	public static void main(String[] args) 
	{
		Single1 s1 = Single1.getSingle() ; // 生成Single1类的实例对象1
		Single1 s2 = Single1.getSingle(); // 生成Single1类的实例对象2
		Single1 s3 = Single1.getSingle(); // 生成Single1类的实例对象3
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		Single2 s_1 = Single2.getSingle();
		Single2 s_2 = Single2.getSingle();
		Single2 s_3 = Single2.getSingle();
		Single2 s_4 = Single2.getSingle();

		System.out.println(s_1);
		System.out.println(s_2);
		System.out.println(s_3);
		System.out.println(s_4);

		Single6 s6_1 = Single6.getSingle();
		Single6 s6_2 = Single6.getSingle();
		Single6 s6_3 = Single6.getSingle();
		Single6 s6_4 = Single6.getSingle();
		System.out.println(s6_1);
		System.out.println(s6_2);
		System.out.println(s6_3);
		System.out.println(s6_4);
	}
}
// 懒汉式---单态
// 问题：进程安全问题  
class Single1
{
    // 实现类的单态
	int age ;
	String name;
	// 第一步：私有化构造方法
	private Single1(){};
	private Single1(int age,String name)
	{
		this.age= age;
		this.name= name;
	};
	// 第二步：实现可以在外部获得一个single1的对象，自定义一个Single1的对象

	private static Single1 single1 = null;

    // 第三步：公有的方法获得single1实例并且可以实例对象返回给外部
	public static Single1 getSingle()
	{
	   if(single1==null)
	   {
		  // 线程A 进来
		  // 线程B 进来
          single1 = new Single1(20,"王刚");
	   }
       return single1;
	}
	public void setAge(int age)
	{
       this.age = age;
	}
	public int getAge()
	{
		return age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return this.name +"======="+this.age;
	}
}

// 懒汉式变种
// 唯一的区别就是解决了多线程的安全问题--
// synchronized----同步关键字----cpu开销很大
class Single2
{
	private Single2(){};
	private static Single2 single2 = null;
	public static synchronized Single2 getSingle()
	{
		if(single2==null)
		{
			// 线程A ---锁定数据
			// 线程B 
			single2 = new Single2();
		}
	    return single2;
	}
}

// 饿汉式
// 相比于懒汉式省去了线程的安全隐患
class Single3
{
	private Single3(){};
	private static Single3 single3 = new Single3();
	public static Single3 getSingle()
	{
        return single3;
	}
}

// 饿汉式-变种
//实例化对象的过程在静态缓存区中实现
class  Single4
{
	private Single4(){};
	private static Single4 single4 = null;
	static 
	{
		single4 = new Single4();
	}
	public static Single4 getSingle4()
	{
		return single4;
	}
}
// 第五种： 静态内部类

class Single5
{
	private Single5(){};
	private static class Inner
	{
       private static final Single5 INSTANCE =  new Single5();
	}
	public static Single5 getSingle()
	{
		return Inner.INSTANCE;
	}
}

// 第六种 ： 双重校验锁 

// 延迟性的懒汉式----解决懒汉式的线程安全问题

class Single6
{
	private Single6(){};
	private static volatile Single6 single6;
	public static Single6 getSingle()
	{
        if(single6==null)
		{
			synchronized(Single6.class)
			{
				if(single6==null)
				{
					single6 = new Single6();
				}
			}
		}
		return single6;
	}
}