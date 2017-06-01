package com.jtb.cn;

public class Triger extends Object
{

	/**
	 * @author jiatengbin
	 * @param args
	 * @time 2017-6-1 14:57pm
	 * @description Object���ʹ��
	 * 
	 * 1 ������ķ�װ�����һ��
	 * 
	 */
	private String location;// ����
	private int age;// ����
	public Triger()
	{
		super();
	}
	public Triger(String location,int age)
	{
		this.location = location;
		this.age = age;
	}
	//���ǵ�Object��hashCode();
	public int hashCode()
	{
		 // ����Trigerʵ����Ĺ�ϣɢ��ֵ
		 // �����ϣ��̶�ϵ��ֵ
		 final int prime = 31; 
		 int result = 1; // ���ɵĹ�ϣ��ֵ
		 result = result * prime + age; //�Ƚ���Ա�����е�����ֵ���й�ϣ������
		 result = result * prime + (location==null?0:location.hashCode());
		 return result;
	}
	//hashCode()��ͬ������Object���equals()����
	// ���ǱȽ�Object���󣬶��ǱȽ�����Triger����
	public boolean equals(Object obj)
	{
		// ��һ���� �ǿ��ж�
		if(obj==null)
		{
			return false;
		}
		//�ڶ����� �����ж�
		if(obj instanceof Triger)
		{
			// �����жϳ����Ļ�������Ҫ����ǿת
			Triger triger = (Triger)obj;
			// ������������Triger����Ĳ�����������ȣ��������ܱ�֤������������ͬһ������
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
	    Triger t1 = new Triger("������",20);	
	    Triger t2 = new Triger("���ϻ�",25);
	    Triger t5 = new Triger("���ϻ�",25);
	    Triger t3 = new Triger();
	    Triger t4 = new Triger();
	    System.out.println("t1�Ĺ�ϣ�� = "+t1.hashCode());
	    System.out.println("t2�Ĺ�ϣ�� = "+t2.hashCode());
	    System.out.println("t3�Ĺ�ϣ�� = "+t3.hashCode());
	    System.out.println("t4�Ĺ�ϣ�� = "+t4.hashCode());
	    System.out.println("t5�Ĺ�ϣ�� = "+t5.hashCode());
	    System.out.println(new Object().hashCode());
	    System.out.println(new Object().hashCode());
	    System.out.println(t1.equals(t2));
	    System.out.println(t1.equals(t5));
	    System.out.println(t2.equals(t5));
	}

}
