/**
��Ա�ڲ����г�Ա�����ͳ�Ա������ʹ��
**/
class Demo2 
{
	public static void main(String[] args) 
	{
		//�����ⲿ����ڲ����ʵ������
		Outer.Inner in = new Outer().new Inner();
		in.print();
		// �����ⲿ����ڲ�����ڲ����ʵ������
		Outer.Inner.Inner1 in1 = new Outer().new Inner().new Inner1();
		in1.test();
	}
}
class Outer
{
	public int age = 10; // �ⲿ��ĳ�Ա����
	private void test()// �ⲿ��ĳ�Ա����
	{
		System.out.println("Outer test");
		// �����ⲿ����ڲ���ĳ�Ա����
		Inner in = new Inner();
		System.out.println("outer test age = "+in.age);
	}
	class Inner//�ⲿ��ĳ�Ա�ڲ���
	{
		public int age = 20; // �ⲿ����ڲ���ĳ�Ա����
		public void print() //�ⲿ����ڲ���ĳ�Ա����	
		{
           int age = 30; //�ڲ���ĳ�Ա�����еľֲ����� 
		   // �ⲿ��ĳ�Ա�������ڲ����Ա�������ڲ����з������е�
		   //��Ա����������ʱ�򣬷�����ֱ�ӷ��ʱ��������ʵ���
		   //�������еľֲ�����
		   System.out.println("print age="+age);
		   // ��һ�֣� �����ڲ����ʵ������
		   Inner in = new Inner();
		   System.out.println("inner age = "+in.age); //�ڲ���ĳ�Ա����
           //�ڶ��֣� ͨ��this�ؼ��ֱ�ʾ��ǰ��ʵ������
		   // ͨ��this.��Ա�����������ڲ���ĳ�Ա����		   
		   System.out.println("inner age = "+ this.age);
		   // ��һ�֣� �����ⲿ���ʵ������
		   Outer out = new Outer();
		   System.out.println("outer age = "+out.age);
		   // �ڶ��֣�ͨ���ⲿ�������������ⲿ��ĳ�Ա����
		   System.out.println("outer age = "+Outer.this.age);
		   // �ڲ���ķ�������ֱ�ӵ����ڲ���ĳ�Ա����
		   test();
		   this.test();// ֱ�ӵ��÷�����this�Ͳ���thisЧ������ͬ��
		   // �ڲ����е����ⲿ���ͬ������
		   Outer.this.test();
		}
		//�ڲ���ĳ�Ա�������ⲿ��ĳ�Ա��������
		public void test()
		{
		   //�ڲ���ĳ�Ա���������ⲿ���ͬ����Ա����
		   Outer.this.test();
           System.out.println("Inner test");
		   System.out.println("Inner test outer age = "+Outer.this.age);
		}
		class Inner1
		{
			void test()
			{
				System.out.println("Inner1 test");
			}
		}
	}
}
