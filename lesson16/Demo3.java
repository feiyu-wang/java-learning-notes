import java.util.*;
/**
static�ؼ��� �� 

static���γ�Ա����---���Ա����

static���γ�Ա����---���Ա����

**/
class Demo3 
{
	public static void main(String[] args) 
	{
		Car[] car = new Car[5];
	    car[0] = new Car("����",4,"��ɫ",250,20);
		car[1] = new Car("����",4,"��ɫ",276,30);
	    car[2] = new Car("����",4,"��ɫ",200,10);
	    car[3] = new Car("����",4,"��ɫ",300,40);
	    car[4] = new Car("������",4,"��ɫ",280,8);

		System.out.println("count2="+Car.count2); // 5

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

		System.out.println("count1="+car1.count1); // 1
         		
        Car c6 = null;
		for(int i = 0; i<5;i++)
		{
			c6 = new Car("����",4,"��ɫ",250,20);
		} 
		// ��һ��count1����������ͨ�ĳ�Ա��������ͨ�ĳ�Ա�������ڵ�����ʵ������
		// �ڶ���count�����������Ա���������Ա����������ʵ�����󣬶���������
		// �����е�ʵ�������е�����
		//System.out.println("count1="+car1.count1);  // 1 
		System.out.println("count2="+car2.count2);  // 10 ������.���Ա����

		System.out.println("count2="+Car.count2); // 10  ����.���Ա�����ķ�ʽ
		
        c6.priceArray(car); // ������.���Ա����
		c6.priceArray(car); // ����.���Ա����ֱ����ʹ�ó�Ա����
	}
}
class Car
{
	// �������ͨ�ĳ�Ա����
	private static String brand; // ����Ʒ��
	private int seats; // ������λ
	private String color; // ������ɫ
	private int weight; // ���� ��
	private static int price; // �۸� ��

	public int count1 = 0; // ��ͨ�ĳ�Ա����-----����ʵ������
	public static int count2 = 0; // ���Ա����

	// ����ղι��췽��
    public Car()
	{
       count1++;
       brand = null;
	   seats = 0;
	   color = null;
	   weight= 0;
	   price = 0;
	}
    public Car(String brand,int seats,String color,int weight,int price)
	{
		count2++;
		this.brand = brand;
		this.seats = seats;
		this.color = color;
		this.weight = weight;
		this.price = price;
	}
    // ������ͨ�ĳ�Ա����
	public void run(int speed)
	{
		System.out.println(getBrand()+"��������"+speed+"����/Сʱ");
	}
	// ������ͨ�ĳ�Ա����---���ļ�Ǯ�ɵ͵�������
	// �Ǿ�̬�������Ե��þ�̬�ķ���
	// �Ǿ�̬�������Ե��÷Ǿ�̬�ķ���
	public static void priceArray(Car[] car)
	{ 
		int[] arr = new int[car.length];
		for(int i= 0;i<car.length;i++)
		{
			// car[i].setPrice(200);
		}
		for(int i = 0; i<car.length;i++)
		{
          arr[i] = car[i].getPrice();		  
		}
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));	

		//getPrice();
	}
    public void setPrice(int price)
	{
       this.price = price;
	}
	// ��̬�ķ������ܷ��ʷǾ�̬�ĳ�Ա����
	// ��̬�ķ���ֻ�ܷ��ʾ�̬�ĳ�Ա����
	// ��̬�ķ������þ�̬�ķ���
	public int getPrice() // �ĳ����Ա����
	{
		getBrand();
		return price;
	}
	public static String getBrand()
	{
		return brand;
	}
}
class Demo4 // ִ�����ʵ����
{
	// ��̬�Ļ��������Զ���Ǿ�̬���������Ǿ�̬���������ܶ��徲̬�Ļ�����
	private static int count = 0;
	private int age = 100;
	{
		// �Ǿ�̬�����ִ��----������ʵ�����������
		System.out.println("age="+age);
		System.out.println(count+"�Ǿ�̬�����1");
	}
	static
	{
		// ��̬���������౻���ص�ʱ����Ѿ�����
		// jvm����ʱ��ֱ��ȥ��������ȡ����
		// ��̬��������ʵ�����������û�й�ϵ
		// ��̬������ֻ�ܼ��ؾ�̬����Դ�����ܼ��طǾ�̬����Դ
		// System.out.println("age="+age);
		count = 100;
		System.out.println(count+"��̬�����1");
	}
	public Demo4()
	{
       count++;
	   System.out.println(count+"��������Ĺ��췽��");
	}
    {		
		count++;
		System.out.println(count+"�Ǿ�̬�����2");
	}
	static
	{
		{
			System.out.println(count+"�Ǿ�̬�����4");
		}
		System.out.println(count+"��̬�����2");
	}
	public void fun()
	{
		{
			count++;
			System.out.println("�Ǿ�̬�����3");
		}
		System.out.println("fun");
	}
	public static void main(String[] args)
	{
       System.out.println("count="+count);
	   // ��ʵ���������ɵ�ʱ��Ǿ�̬�����ͻᱻִ��
	   new Demo4().fun();
	   System.out.println("count="+count);
	   // ִ��˳��
	   // 1 ��̬�����
	   // 2 �Ǿ�̬�����
	   // 3 ���췽��
	}
}
