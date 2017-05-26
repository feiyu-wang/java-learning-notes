/**
��̬���ģʽ�� 6��д��

��ʵ�������Ϊ��̬------�������ⲿʹ��ʱֻ����һ��ʵ���������

ʵ���������ڴ�����Ψһ��
**/
class Demo1 
{
	public static void main(String[] args) 
	{
		Single1 s1 = Single1.getSingle() ; // ����Single1���ʵ������1
		Single1 s2 = Single1.getSingle(); // ����Single1���ʵ������2
		Single1 s3 = Single1.getSingle(); // ����Single1���ʵ������3
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
// ����ʽ---��̬
// ���⣺���̰�ȫ����  
class Single1
{
    // ʵ����ĵ�̬
	int age ;
	String name;
	// ��һ����˽�л����췽��
	private Single1(){};
	private Single1(int age,String name)
	{
		this.age= age;
		this.name= name;
	};
	// �ڶ�����ʵ�ֿ������ⲿ���һ��single1�Ķ����Զ���һ��Single1�Ķ���

	private static Single1 single1 = null;

    // �����������еķ������single1ʵ�����ҿ���ʵ�����󷵻ظ��ⲿ
	public static Single1 getSingle()
	{
	   if(single1==null)
	   {
		  // �߳�A ����
		  // �߳�B ����
          single1 = new Single1(20,"����");
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

// ����ʽ����
// Ψһ��������ǽ���˶��̵߳İ�ȫ����--
// synchronized----ͬ���ؼ���----cpu�����ܴ�
class Single2
{
	private Single2(){};
	private static Single2 single2 = null;
	public static synchronized Single2 getSingle()
	{
		if(single2==null)
		{
			// �߳�A ---��������
			// �߳�B 
			single2 = new Single2();
		}
	    return single2;
	}
}

// ����ʽ
// ���������ʽʡȥ���̵߳İ�ȫ����
class Single3
{
	private Single3(){};
	private static Single3 single3 = new Single3();
	public static Single3 getSingle()
	{
        return single3;
	}
}

// ����ʽ-����
//ʵ��������Ĺ����ھ�̬��������ʵ��
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
// �����֣� ��̬�ڲ���

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

// ������ �� ˫��У���� 

// �ӳ��Ե�����ʽ----�������ʽ���̰߳�ȫ����

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