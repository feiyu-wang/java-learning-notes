/**
�ֲ��ڲ��ࣺ

�ڲ���Ķ�����ڷ������ڲ��൱��һ���ֲ�����

�ⲿ��ķ�������ʵ�����ڲ������

**/
class Demo4 
{
	public static void main(String[] args) 
	{
		// �ܲ��ܶ����ⲿ��ķ��������ڲ����ʵ�����󣿲���
		Outer outer = new Outer();
		outer.test();
	}
}
class Outer
{
	public int age = 10; // �ⲿ��ĳ�Ա����
	public void test()// �ⲿ��ĳ�Ա����
	{
		 // �������ж���ֲ����������з������η��������Ĺؼ���
		 final int age = 20;// �������оֲ�����
         class Inner // �ⲿ��ľֲ��ڲ���
         {
             int age = 30; // �ֲ��ڲ���ĳ�Ա����
			 void test()// �ֲ��ڲ���ĳ�Ա����
			 {
			    int age= 40;
			    System.out.println("test age = "+age); // �ڲ���ķ������оֲ�����
				System.out.println("inner age ="+this.age); // �ֲ��ڲ���ĳ�Ա����
                System.out.println("outer age ="+Outer.this.age); // �ⲿ��ĳ�Ա����
			 }
         }
        Inner in = new Inner();
        in.test();
	}
}
