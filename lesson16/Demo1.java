/**
����һ��Student�࣬��Ա���� ���������䣬�Ա�Ӣ����ģ�java���ſγɼ�

1 Ҫ���Student��ķ�װ

2 ���붨��ղΣ���һ��������������������ȫ�εĹ��췽��

3 ����3��ѧ�����󣬴�ӡ������ſγɼ��ܷ���ߵ�ѧ�������������Ϣ
**/
class Demo1 
{
	public static void main(String[] args) 
	{
		// ��һ�ֳ�Ա������ֵ�ķ���������set����
		Student stu1 = new Student();
		stu1.setName("���¸�");
		stu1.setAge(27);
		stu1.isGender(true);
		stu1.setEnglish(90.4);
		stu1.setChinese(95.6);
		stu1.setJava(92.3);
		// �ڶ��ֳ�Ա������ֵ�ķ�����ֱ�ӵ���ȫ�ι��췽��
		Student stu2 = new Student("��ǫ",20,true,89.5,97.4,96.0);
		Student stu3 = new Student("������",22,true,83.5,96.4,97.3);
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
			System.out.println("�Ƿ�ֵ");
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
		   System.out.println("�Ƿ�ֵ");
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
	// ��ӡѧ����Ϣ�ķ���
	public void printStudent()
	{
        System.out.println("ѧ���������ǣ�"+getName()+"�������ǣ�"+getAge()
		+"���Ա��ǣ�"+(getGender()?"��":"Ů")+",Ӣ��εĳɼ��ǣ�"+getEnglish()
		+"�����Ŀεĳɼ��ǣ�"+getChinese()+"��java�εĳɼ��ǣ�"+getJava());
	}
    private double sum = 0.0;
	// �����ſγɼ��ܺ͵ķ���
	public double getSum()
	{
	   sum = getEnglish()+getChinese()+getJava();
	   return sum;
	}    
	// ������ѧ�����ſγɼ����ܺ���߷֣���ӡ��������߷�ѧ������Ϣ
	public void printMaxStudent(Student stu1,Student stu2,Student stu3)
	{
//        stu1.getSum()-----ѧ��1�����ſε��ܺ�
//		  stu2.getSum()-----ѧ��2�����ſε��ܺ�
//		  stu3.getSum()-----ѧ��3�����ſε��ܺ�
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
