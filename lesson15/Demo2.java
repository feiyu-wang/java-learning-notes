import java.util.*;
/**
���췽���Ķ���,ʹ��,����,����,this�ؼ��ֵ��÷�.
**/
class Demo2
{
	public static void main(String[] args) 
	{
		System.out.println("===�ղι��췽��====");
		Animal a1 = new Animal(); // ʵ��������Ĺ��̣�Ĭ�ϵ��ÿղι��췽��
		// ���Ա����ȫ������ʼֵ
		// ���췽��������---���в�ͬ�ĳ�ʼ����ֵ����---���췽��������
        System.out.println(a1.getType());
        System.out.println(a1.getAge());
        System.out.println(a1.getCharacter());
        System.out.println(a1.getCountry());
		System.out.println("=====��һ�������Ĺ��췽��=====");
		Animal a2 = new Animal("�ϻ�");// ��ͬ��ʵ�����������ò�ͬ�Ĺ��췽��
		// ����˳�Ա�����ĸ�ֵ

		System.out.println("=====�����������Ĺ��췽��=====");
		Animal a3 = new Animal("���ϻ�",10); // ���������������Ĺ��췽��
        
		System.out.println("=====ȫ�ι��췽��==========");
		Animal a4 = new Animal("������",7,"����",new String[]{"�й�����","Խ��"});
        
		//System.out.println(this.getType());
		// this�ؼ��ֵĵ�һ���÷�����ʾ��ǰ����
		a4.run();

	}
}
class Animal
{
	// ʵ���ࣺ ��Ա����,��Ա����,��Ա������get��set,�ղι��췽����ȫ�εĹ��췽��
	//��Ա����
	private String type; // Ʒ��
	private int age; // ����
	private String character; // �Ը�
	private String[] country; // ����
    
	// ����һ���ղεĹ��췽��
	public Animal()
	{
		System.out.println("Animal��Ŀղι��췽��");
	}
	// ����һ����һ�������Ĺ��췽��
	public Animal(String type)
	{
		 //this(); // ���ÿղεĹ��췽��
         this.type = type;
		 System.out.println("type =" +type);
		 System.out.println("Animal���һ�������Ĺ��췽��");
	}
    // ����һ�������������Ĺ��췽��
	public Animal(String type,int age)
	{
		//this("������",20,"�ر�����",new String[]{"����","�¼���"});
		//this("�ϻ�");// ������һ�������Ĺ��췽��
		this(type);
        this.type = type;
		this.age = age;
		System.out.println("type = "+type);
		System.out.println("age = "+age);
		System.out.println("Animal������������Ĺ��췽��");
	}
	// ����ȫ�εĹ��췽��----���еĳ�Ա���������и�ֵ
	public Animal(String type,int age,String chracter,String[] country)
	{ 
		//this(); // this�ؼ��ֵ��ù��췽������д�ڹ������ĵ�һ��
		//this("���ϻ�",20); // ���������������Ĺ��췽��
        this.type = type;
		this.age = age;
		this.character = character;
		this.country = country;
        System.out.println("type = "+type);
		System.out.println("age = "+age);
		System.out.println("character ="+character);
		System.out.println("country ="+Arrays.toString(country));
		System.out.println("Animal���ȫ�ι��췽��");
	}

	// ��Ա����

	public void run()
	{
		System.out.println(this.getType());
		System.out.println("animal run......");
	}
	public void jump()
	{
		System.out.println("animal jump......");
	}
    // ��Ա�����ĸ�ֵ��ȡֵ
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