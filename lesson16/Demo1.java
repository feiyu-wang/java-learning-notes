/**
定义一个Student类，成员变量 姓名，年龄，性别，英语，语文，java三门课成绩

1 要完成Student类的封装

2 必须定义空参，有一个参数，有俩个参数，全参的构造方法

3 生成3个学生对象，打印输出三门课成绩总分最高的学生对象的所有信息
**/
class Demo1 
{
	public static void main(String[] args) 
	{
		// 第一种成员变量赋值的方法，调用set方法
		Student stu1 = new Student();
		stu1.setName("郭德纲");
		stu1.setAge(27);
		stu1.isGender(true);
		stu1.setEnglish(90.4);
		stu1.setChinese(95.6);
		stu1.setJava(92.3);
		// 第二种成员变量赋值的方法，直接调用全参构造方法
		Student stu2 = new Student("于谦",20,true,89.5,97.4,96.0);
		Student stu3 = new Student("岳云鹏",22,true,83.5,96.4,97.3);
		stu1.printMaxStudent(stu1,stu2,stu3);

		
	}
}
class Student
{
	private String name;
	private int age;
	private boolean gender;
	private double english;
	private double chinese;
	private double java;
	public Student()
	{
		name = null;
		age = -1;
		gender = false;
		english = 0.0;
		chinese = 0.0;
		java = 0.0;
	}
	public Student(String name,int age,boolean gender,double english,double chinese,double java)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.english = english;
		this.chinese = chinese;
		this.java = java;
	}
    public void setName(String name)
	{
        if(name==null)
		{
			System.out.println("非法值");
		}
		else
		{
			this.name = name;
		}
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
       if(age<0||age>200)
	   {
		   System.out.println("非法值");
	   }
	   else
	   {
		   this.age = age;
	   }
	}
	public int getAge()
	{
		return age;
	}
	public void isGender(boolean gender)
	{
        this.gender = gender;
	}
	public boolean getGender()
	{
		return gender;
	}
	public void setEnglish(double english)
	{
		this.english = english;
	}
	public double getEnglish()
	{
		return english;
	}
	public void setChinese(double chinese)
	{
        this.chinese = chinese;
	}
	public double getChinese()
	{
		return chinese;
	}
	public void setJava(double java)
	{
		this.java = java;
	}
	public double getJava()
	{
		return java;
	}
	// 打印学生信息的方法
	public void printStudent()
	{
        System.out.println("学生的姓名是："+getName()+"，年龄是："+getAge()
		+"，性别是："+(getGender()?"男":"女")+",英语课的成绩是："+getEnglish()
		+"，语文课的成绩是："+getChinese()+"，java课的成绩是："+getJava());
	}
    private double sum = 0.0;
	// 求三门课成绩总和的方法
	public double getSum()
	{
	   sum = getEnglish()+getChinese()+getJava();
	   return sum;
	}    
	// 求三个学生三门课成绩的总和最高分，打印输出这个最高分学生的信息
	public void printMaxStudent(Student stu1,Student stu2,Student stu3)
	{
//        stu1.getSum()-----学生1的三门课的总和
//		  stu2.getSum()-----学生2的三门课的总和
//		  stu3.getSum()-----学生3的三门课的总和
        if(stu1.getSum()>stu2.getSum()&&stu1.getSum()>stu3.getSum())
		{
			stu1.printStudent();
		}
		else if()
		{

		}
		else
		{

		}
	}
}
