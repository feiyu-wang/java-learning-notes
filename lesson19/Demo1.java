/**
�ڲ��ࣺ ������ڲ�����һ���࣬�໥֮��ķ�������ͬʱ�������
**/
class Demo1 
{
	public static void main(String[] args) 
	{
	    Outer out = new Outer(); //ʵ�����ⲿ���ʵ������
		out.test();
    }
}
class Outer //�ⲿ��
{
	private int outer_i = 10; // �ⲿ��ĳ�Ա����
	public void test() // �ⲿ��ĳ�Ա����
	{
      System.out.println("test outer_i ="+outer_i);
	  Inner in = new Inner();
	  in.print();
	  // �ⲿ�಻��ֱ�ӷ����ڲ���ĳ�Ա�����ͳ�Ա����
	  // �����������ڲ����ʵ������ͨ���ڲ����ʵ������ȥ�����ڲ���ĳ�Ա����
	  // ����Ա����
	  System.out.println("inner_i="+in.inner_i);
	}
	class Inner // �ⲿ��ĳ�Ա�ڲ���
	{
		public int inner_i = 100; // �ڲ���ĳ�Ա����
		public void print()// �ڲ���ĳ�Ա����
		{
			test();
            System.out.println("print inner_i="+inner_i); // �ڲ���ֱ���Լ���Ա����
			System.out.println("print outer_i="+outer_i); // �ڲ������ֱ�ӷ����ⲿ��ĳ�Ա����		
		}		
	}	
}