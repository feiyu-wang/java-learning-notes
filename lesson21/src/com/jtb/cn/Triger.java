package com.jtb.cn;

public class Triger extends Object
{

	/**
	 * @author jiatengbin
	 * @param args
	 * @time 2017-6-1 14:57pm
	 * @description Object类的使用
	 * 
	 * 1 完整类的封装的最后一步
	 * 
	 */
	private String location;// 产地
	private int age;// 国籍
	public Triger()
	{
		super();
	}
	public Triger(String location,int age)
	{
		this.location = location;
		this.age = age;
	}
	//覆盖掉Object的hashCode();
	public int hashCode()
	{
		 // 生成Triger实体类的哈希散列值
		 // 定义哈希码固定系数值
		 final int prime = 31; 
		 int result = 1; // 生成的哈希码值
		 result = result * prime + age; //先将成员变量中的整数值进行哈希码的相加
		 result = result * prime + (location==null?0:location.hashCode());
		 return result;
	}
	//hashCode()相同，覆盖Object类的equals()方法
	// 不是比较Object对象，而是比较俩个Triger对象
	public boolean equals(Object obj)
	{
		// 第一步： 非空判断
		if(obj==null)
		{
			return false;
		}
		//第二步： 类型判断
		if(obj instanceof Triger)
		{
			// 类型判断成立的话，必须要进行强转
			Triger triger = (Triger)obj;
			// 第三步：俩个Triger对象的参数都必须相等，这样才能保证这俩个对象是同一个对象
			if(triger.location.equals(location)&&triger.age==age)
			{
				return true;
			}
			else
			{
			  return false;	
			}
		}
		else
		{
		  return false;	
		}
		
	}	
	public static void main(String[] args) 
	{
	    Triger t1 = new Triger("东北虎",20);	
	    Triger t2 = new Triger("华南虎",25);
	    Triger t5 = new Triger("华南虎",25);
	    Triger t3 = new Triger();
	    Triger t4 = new Triger();
	    System.out.println("t1的哈希吗 = "+t1.hashCode());
	    System.out.println("t2的哈希吗 = "+t2.hashCode());
	    System.out.println("t3的哈希吗 = "+t3.hashCode());
	    System.out.println("t4的哈希吗 = "+t4.hashCode());
	    System.out.println("t5的哈希吗 = "+t5.hashCode());
	    System.out.println(new Object().hashCode());
	    System.out.println(new Object().hashCode());
	    System.out.println(t1.equals(t2));
	    System.out.println(t1.equals(t5));
	    System.out.println(t2.equals(t5));
	}

}
