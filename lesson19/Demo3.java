/**
��Ա�ڲ����еľ�̬�ڲ���------static�ؼ���

static ��Ա����-----���Ա
static ��Ա����-----���Ա����
static �����-------��̬����

static ��----��̬��----��̬�ڲ���

1 ����ʵ��������

2 ��̬�ڲ���ĳ�Ա�����ͳ�Ա����Ĭ�϶��Ǿ�̬��

  ���Զ��岻����
  
  ��̬�ڲ����еķ�������ֱ�ӷ����ⲿ��ķǾ�̬�ĳ�Ա�����ͷǾ�̬��Ա����

**/
class Demo3 
{
	public static void main(String[] args) 
	{
		//�����ⲿ��ľ�̬�ڲ����ʵ������
        Outer.Inner in  = new Outer.Inner(); 
		in.test();
	}
}
class Outer
{
	public static int age = 10; //�ⲿ��ľ�̬��Ա����
	public String name = "zhangsan";// �ⲿ��ķǾ�̬��Ա����
	public static  void test() // �ⲿ��ĳ�Ա����
	{
        System.out.println("Outer test");
		// �ⲿ���з����ڲ��������
		Inner in = new Inner();
		System.out.println("outer test age = "+in.age);
	}
    static class Inner// �ⲿ��ľ�̬�ڲ���
    {
	    int age = 20;// ��̬�ڲ���ĳ�Ա����
		public void test()
		{
			int age = 30; // ��̬�ڲ���ľֲ�����
			// ֱ�ӷ��ʱ��������ʵ��Ǿ�̬�ڲ���ľֲ�����
			System.out.println("Inner test age = "+age);
			// ���ʾ�̬�ڲ���ĳ�Ա���� this---�Ǿ�̬��
			Inner in = new Inner();
            System.out.println("inner age = "+in.age);
            // �����ⲿ��ĳ�Ա����---����ʹ���ⲿ���
			System.out.println("Outer age = "+Outer.age);
			// ��̬�ڲ��಻��ֱ�ӷ��ʷǾ�̬�ĳ�Ա����
			Outer out = new Outer();
			System.out.println(out.age);
			System.out.println("Outer name = "+out.name);
			// �ڲ�������ⲿ��ĳ�Ա����
            Outer.test();
		}
    }

}
