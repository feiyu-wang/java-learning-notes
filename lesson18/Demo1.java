/**
��ļ̳�

����������У����е�ʵ����Ĭ�ϵĶ��㸸�඼��Object��

String ------Object 
Integer-----Number-----Object  

��Ҫ�Ƿ����̳й�ϵ���ࣺ 

��Ա�����ͳ�Ա�����ص㣺

˽�л��ǹ��У���(private ,protected )˽�е�---��ʹ�м̳й�ϵ�����಻��ֱ��ʹ�ø���ĳ�Ա�������߳�Ա����
                 ���е�---����ֱ��ʹ�ø���ĳ�Ա�����ͳ�Ա����

���췽������ֱ�Ӽ̳С�

1  ����ĿղεĹ��췽����Ĭ�ϵ��ø���ղι��췽�����൱�ڳ���Ĭ��ִ����super()���

2  �����ȫ�ι���Ĭ�ϵ��ø���ղι��졣

3  ͨ��super������ǿ�Ƶ��ø�����в����Ĺ��췽��

super �ؼ��֣�

1  ���ø���Ĺ��췽��

2  �����������ĳ�Ա�������߳�Ա������ͬʱ��ǿ�Ƶĵ����Ҹ���ĳ�Ա�����ͳ�Ա����

Object�ࣺ

ֱ�Ӽ̳У�toString() hashCode() equals()


**/
class Demo1 extends Object 
{
	public static void main(String[] args) 
	{
		System.out.println("=============�Զ���ļ̳�============");
//		System.out.println(new Demo1().equals(new Demo1()));
//		System.out.println(new Demo1().hashCode());
//		System.out.println(new Demo1());
//		System.out.println(new Integer("123").hashCode()); // ֱ�Ӵ�ӡInteger����Ĺ�ϣ��
        Person p1 = new Person();
		Person p2 = new Person("����",10,false);
		
		System.out.println("=====student��������========");
		System.out.println("=======�ղ�Student===========");
		Student stu1 = new Student();
		System.out.println("=======ȫ��Student==========");
		Student stu2 = new Student("����",20,true,0100,98.5);
//		System.out.println(stu1.name);
//		System.out.println(stu1.age);
//		System.out.println(stu1.gender);
        stu2.printString(stu2.getName());
		stu2.printInt(stu2.getAge());
		stu2.printBoolean(stu2.getGender());
        stu2.printInt(stu2.id);		
		System.out.println(stu2.getScore());
		System.out.println("======Academic��������=======");
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
class Person //�̳нṹ�����ϲ㸸��ĳ�Ա�����ͳ�Ա��������Ϊ���У�������ķ�װ
{
   public String name;
   public int age;
   public boolean gender;
   public Person()
   {
	   // ���췽�����þ�̬��Ա����
	   printString("Person �ղ�");
   }
   public Person(String name,int age,boolean gender)
   { 
       // ���췽��û�о�̬�ͷǾ�̬֮�֣�ֻҪ�ǳ�Ա��������ʹ��
       this.name = name;
	   this.age = age;
	   this.gender = gender;
	   printString(name);
	   printInt(age);
	   printBoolean(gender);
	   printString("person ȫ��");
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
// Person���һ������
class Student extends Person
{
	private String name;
	private int age;
	private boolean gender;
    public int id;// ѧ����ѧ�� 
	private double score;// ѧ���ɼ�
	public Student()
	{
		super(); // super �ؼ��ֵ�һ�֣� ���ø���Ĺ��췽��
        super.printString("Student �ղ�");
	}
	public Student(String name,int age,boolean gender,int id,double score)
	{
		//super();// Ĭ�ϻ���ø���Ŀղι���
		// ͨ��super�����ø����ȫ�ι���
		super("����",50,false);
        this.name = super.name;
		this.age = super.age;
		this.gender = super.gender;
		this.id = id;
		this.score = score;
		// super�ؼ��ֵڶ��÷��� �����������ĳ�Ա�������߷�����ͬ��ʱ��
		// ǿ�Ƶ��ø���ĳ�Ա�����ͳ�Ա��������super.��Ա�������߳�Ա����
		super.printString("Student ȫ��");
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
// Person��Ķ�������
class Academic  extends Student
{
    private String grade; //�������༶
}
class Master  extends Student
{
    private  String direction;// �о����о����� 
}

