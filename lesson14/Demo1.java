import java.util.*;
import java.math.*;
/**
��Ķ�������ʹ�ã�

��һ�֣�jdk��װ�õ���-----������jdk��src�����---lib�ļ���

        ʹ�ã�System��-------java.lang.* -----ֱ��ʹ��
		      
			  Scanner��------import���

�ڶ��֣��Զ������---------���ж����Լ��ĳ�Ա�����ͳ�Ա����----ʵ����



�����֣�ִ����-------����main()��������---�ܹ�������ִ�г������


**/
class Demo1// ִ����----jvmȡ����main()�е���Ͷ�������
{
	public static void usePerson()
	{
		Person p1 = new Person(); // ����Person��ʵ������
		System.out.println(p1.name); // ʵ�������ʹ�� ʵ��������.��Ա����
								     // ʵ��������.������()
		System.out.println(p1.age);
	}
	public static void main(String[] args) 
	{
		// ��Ա�����Ļ�ȡ
		System.out.println("Hello World!");
		System.out.println(Integer.MAX_VALUE); // jdk��װ�õ���
		usePerson();
		Person p2 = new Person();
		Person p3 = new Person();
		System.out.println("p2="+p2); // ֱ�Ӵ�ӡʵ�����������ֵ
		System.out.println("p3="+p3);
		System.out.println(p2.gender);// ��ӡʵ������ĳ�Ա����---��ȡ��Ա������ֵ
		System.out.println(p2.bloodStyle); // ��Ա������δ��ֵ��ʱ�򣬼�����ḳ�������͵�Ĭ�ϳ�ʼֵ

		System.out.println(p2.hobby);
        
		System.out.println("==================================");
		// �޸ĳ�Ա������ֵ---ͨ����ֵ�޸ĳ�Ա����
		p2.gender = true;
		p2.bloodStyle = new String[]{"AB","A","B","O"};
		Hobby hobby = new Hobby(); // ����Hobby���ʵ������
		hobby.type = "�����˶�";
		hobby.level = 2; // �����˶��еĶ���
		System.out.println(p2.gender);
		System.out.println(Arrays.toString(p2.bloodStyle));
		System.out.println(p2.bloodStyle[0]);
        System.out.println(hobby.type);
        
		System.out.println("====================================");
        // ʹ�ó�Ա����
        p3.name = "����";
		p3.sayHello();
        p3.runFast(1000);
		System.out.println("====================================");

		// ͨ����Ա���������и�ֵ��ȡֵ
		System.out.println("p3 age = "+p3.age);// ��ȡ��Ա����age��ֵ
		p3.setAge(100); // ͨ����Ա����setAge()����Ա������ֵ
		System.out.println("p3 age = "+p3.age);
		System.out.println("p3 age = "+p3.getAge()); // ͨ����Ա����getAge()��ȡ��Ա������ֵ
		System.out.println("====================================");
		// ��Ա�����ķǷ�ֵ�жϵĿ���-----����Ա���뿼�ǵ�����
		Person p4 = new Person();
		p4.age = -100;
		System.out.println("p4 age = "+ p4.age);
		p4.setAge(-100);
		System.out.println("p4 age = "+ p4.getAge());	
	}
}
/**
�Զ���һ��������������һ���������--������
ʹ�����ж���õĳ�Ա�����ͳ�Ա����--����������ʵ������
**/
class Person
{
    // ͨ����Ա�����ͳ�Ա��������������һ������ľ�̬���ԺͶ�̬�ķ���

	// �����Ա����---����һ�������ʲô����
    public String name = "����"; // ����-----�������͵�����
	public int age; // ����-----������������
	public boolean gender ;// �Ա�
	public String[] bloodStyle; // Ѫ��------�������͵�����
	public Hobby hobby; // ��������һ������İ���

    // ���嶯̬��Ա����----����һ�������ܹ���ʲô...
	public void sayHello()
	{  
        String name = "����"; // sayHello()��Ա���ʵ��Ǿֲ�����
        System.out.println(name+"hello"); // name��sayHello()�������β�
	}
	// �˿����ܵĿ�
	public void runFast(int speed)
	{
        System.out.println(name+"������"+speed+"�찡��"); // name��Person��ĳ�Ա����
	}

	// ͨ����Ա�������޸�һ����Ա������ֵ---��ֵ
	// ��ȡ��Ա������ֵ---ͨ����������ȡ
	public void setAge(int newAge)
    {
		if(newAge<0||newAge>200)
		{
		    System.out.println("�Ƿ����䣬���ܽ��н���");			
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
�Զ���һ����������������һ���������
**/
class Hobby
{
	// ��Ա����
    public String type; // ���õ����
	public int level ;// ���õĵȼ� 
	// ��Ա����
	public int getHobbyLevel()
	{
		return level;
	}
}

