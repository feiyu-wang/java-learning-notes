/**
�����ĸ��ǣ� �м̳й�ϵ���������У����ඨ���븸����ͬ�ķ���
��������������ͬ��������ʵ�ֿ϶��ǲ�һ����

���������أ�ͬһ�����У���������ͬ�����ǲ����������������ͣ����������λ��
��ͬ��

final�ؼ���

1 final �������α���----���ճ���

2 final �������η��� --- �����޷����Ǹ���

3 final ���������� ----- �����಻�ܱ��̳�

�������ջ���

jvm���Զ�������ڴ��е�����--�ڴ治��

����Ա�Լ�дfinalize() ����������jvmȥ�����ڴ�����

**/
class Demo2 extends Object
{
	//1 ���ǵ�Object������finalize()����
	public void finalize()
	{
       System.out.println("��������ʵ������");
	}
	public Demo2()
	{
		System.out.println("��������ʵ������");
	}
	public static void main(String[] args) 
	{
		System.out.println("==============================");
		Animal a = new Animal(); 
		a.show();
		Dog d = new Dog();
		d.show();
		Dog d1 = new Dog("����");
		//d1.printString();
        System.out.println("==============================");
		Animal a1 = new Dog();
		a1.show();

		System.out.println("==========final===========");

		a.printString(a.name);

		System.out.println("========�������ջ���===========");
		new Demo2();
		new Demo2();
		new Demo2();
		new Demo2(); // ������ʵ�������Ϊ����
		System.gc(); // ����jvmȥ����������������ϵͳ���Զ�����finalize()����

	}
}
class Animal
{
	public String name = "zhangsan";
	static
	{
		printString("<<Animal>>");
	}
	public Animal()
	{
		printString(" Animal ");
	}
	public Animal(String name)
	{
       this.name = name;
	   printString(name);
	   printString("Animal name");
	}
	public static void printString(String name)
	{
       System.out.println("Animal print "+name);
	}

	public void show()
    {
		System.out.println("Animal show........");
	}
}

class Dog extends Animal
{
	private String name; 
	static
	{
        printString("<<Dog>>");
	}
	public Dog()
	{
         printString("Dog");
	}
	public Dog(String name)
	{
		super("С��"); // super(����)���ø�����вι��췽��
        this.name = name; // ǿ�Ƶ��ø���ͬ������
		printString(super.name);
		printString("Dog name");
	}
	// 1 ��̬���Ǿ�̬
	public static  void printString(String name)
	{
	   // super��this�ؼ��ֲ�����static���εķ������ߴ������ʹ��	   
	   // ǿ�Ƶ��ø���ĳ�Ա����
       System.out.println("Dog print "+name);
	}
	// ���า�ǵķ���Ȩ�޴��ڻ��ߵ��ڸ��෽��Ȩ��
    public void show()
	{ 
        //super.show();
		System.out.println("Dog show.......");
	}
}