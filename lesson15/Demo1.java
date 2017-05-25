/**
对象的生命周期,匿名对象，实体类的封装
**/
class Demo1 // 执行类
{	
	public static void main(String[] args) 
	{
		System.out.println("==========================成员变量和成员方法的使用=====================");
		Student stu1 = new Student();
    	stu1.setName("张三");
		stu1.setAge(22);
		stu1.isGender(true);
        stu1.setGrowp("大一");
		System.out.println("学生姓名是："+stu1.getName()+" 年龄是："+stu1.getAge()
		+" 性别是："+stu1.getGender()+"学籍是："+stu1.getGrowp());
	    stu1.study();
        
		System.out.println("=====================对象成为垃圾=============================");
		// 生成的实例对象是垃圾的情况
		Student stu2 = new Student();
        // 实例对象的引用指向为null;
		System.out.println("stu2="+stu2);
		//stu2 = null;	
		//stu2.study();
		//System.out.println("stu2 ="+stu2);
		// 实例对象的赋值为null
		Student stu3 = new Student();
		System.out.println("stu3 ="+stu3);
		stu3 = stu2;
        System.out.println("stu3 ="+stu3);
		stu3.study();
		System.out.println("=================匿名对象的定义=================");
		// 匿名对象。不定义对象名称，直接在堆中数据区中使用成员变量和成员方法
		new Student().setName("王五"); // 每一个匿名对象都有自己对象的堆内存地址
		System.out.println(new Student());
		new Student().setMajor("电子商务");
		System.out.println(new Student());
		new Student().study();

		System.out.println("===================匿名对象传参=============");
        // 匿名对象做为参数来传递
		// 打印返回回来的匿名的对象的赋值
        System.out.println(getStudent(new Student()).getName());
        System.out.println(getStudent(new Student()).getMajor());
	}

	public static Student getStudent(Student stu)
	{
         stu.setName("王五一");
		 stu.setMajor("纺织");
		 stu.study();
		 return stu;
	}

}
/**
自定义描述学生信息的类-----实体类---所有定义的实体类都必须进行封装
**/
class Student
{
	// 成员变量
	private String name; // 姓名
	private int age; // 年龄
	private boolean gender;// 性别
	private String major; //专业
	private String education; // 学籍
	// 成员方法
	public void study()
	{
       System.out.println(name+"所学的专业是："+major);
	}
    // 成长
	public String getGrowp()
	{
		return education;
	}
	// 成长的学籍是哪一个
	public void setGrowp(String newEducation)
	{
		education = newEducation;
   	}

	// 公有的set和get方法来进行成员变量的取值和赋值

    public void setName(String newName)
	{
         if(newName==null)
		 { 
			 System.out.println("姓名不能为空");
		 }
		 else
		 {
			 name = newName;
		 }
	}
	public String getName()
	{
		if(name==null)
		{
			return null;
		}
		else
		{
		    return name;
		}
	}

	public void setAge(int newAge)
	{
       if(newAge<0||newAge>200)
	   {
           System.out.println("非法的年龄");
	   }
	   else
	   {
		   age= newAge;
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

	public void isGender(boolean newGender)
	{
        gender = newGender;
	}

	public boolean getGender()
	{
		return gender;
	}

	public void setMajor(String newMajor)
	{
       major = newMajor;
	}
	public String getMajor()
	{
		return major;
	}
}

