/**
�������������,��������ʵ����ķ�װ
**/
class Demo1 // ִ����
{	
	public static void main(String[] args) 
	{
		System.out.println("==========================��Ա�����ͳ�Ա������ʹ��=====================");
		Student stu1 = new Student();
    	stu1.setName("����");
		stu1.setAge(22);
		stu1.isGender(true);
        stu1.setGrowp("��һ");
		System.out.println("ѧ�������ǣ�"+stu1.getName()+" �����ǣ�"+stu1.getAge()
		+" �Ա��ǣ�"+stu1.getGender()+"ѧ���ǣ�"+stu1.getGrowp());
	    stu1.study();
        
		System.out.println("=====================�����Ϊ����=============================");
		// ���ɵ�ʵ�����������������
		Student stu2 = new Student();
        // ʵ�����������ָ��Ϊnull;
		System.out.println("stu2="+stu2);
		//stu2 = null;	
		//stu2.study();
		//System.out.println("stu2 ="+stu2);
		// ʵ������ĸ�ֵΪnull
		Student stu3 = new Student();
		System.out.println("stu3 ="+stu3);
		stu3 = stu2;
        System.out.println("stu3 ="+stu3);
		stu3.study();
		System.out.println("=================��������Ķ���=================");
		// �������󡣲�����������ƣ�ֱ���ڶ�����������ʹ�ó�Ա�����ͳ�Ա����
		new Student().setName("����"); // ÿһ�������������Լ�����Ķ��ڴ��ַ
		System.out.println(new Student());
		new Student().setMajor("��������");
		System.out.println(new Student());
		new Student().study();

		System.out.println("===================�������󴫲�=============");
        // ����������Ϊ����������
		// ��ӡ���ػ����������Ķ���ĸ�ֵ
        System.out.println(getStudent(new Student()).getName());
        System.out.println(getStudent(new Student()).getMajor());
	}

	public static Student getStudent(Student stu)
	{
         stu.setName("����һ");
		 stu.setMajor("��֯");
		 stu.study();
		 return stu;
	}

}
/**
�Զ�������ѧ����Ϣ����-----ʵ����---���ж����ʵ���඼������з�װ
**/
class Student
{
	// ��Ա����
	private String name; // ����
	private int age; // ����
	private boolean gender;// �Ա�
	private String major; //רҵ
	private String education; // ѧ��
	// ��Ա����
	public void study()
	{
       System.out.println(name+"��ѧ��רҵ�ǣ�"+major);
	}
    // �ɳ�
	public String getGrowp()
	{
		return education;
	}
	// �ɳ���ѧ������һ��
	public void setGrowp(String newEducation)
	{
		education = newEducation;
   	}

	// ���е�set��get���������г�Ա������ȡֵ�͸�ֵ

    public void setName(String newName)
	{
         if(newName==null)
		 { 
			 System.out.println("��������Ϊ��");
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
           System.out.println("�Ƿ�������");
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

