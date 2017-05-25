import java.util.*;
/**
static关键字 ： 

static修饰成员变量---类成员变量

static修饰成员方法---类成员方法

**/
class Demo3 
{
	public static void main(String[] args) 
	{
		Car[] car = new Car[5];
	    car[0] = new Car("宝马",4,"白色",250,20);
		car[1] = new Car("奔驰",4,"灰色",276,30);
	    car[2] = new Car("大众",4,"白色",200,10);
	    car[3] = new Car("吉利",4,"灰色",300,40);
	    car[4] = new Car("帕萨特",4,"红色",280,8);

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
			c6 = new Car("宝马",4,"白色",250,20);
		} 
		// 第一次count1变量定义普通的成员变量，普通的成员变量属于单个的实例对象
		// 第二次count变量定义类成员变量，类成员变量不属于实例对象，而是属于类
		// 中所有的实例对象共有的数据
		//System.out.println("count1="+car1.count1);  // 1 
		System.out.println("count2="+car2.count2);  // 10 对象名.类成员变量

		System.out.println("count2="+Car.count2); // 10  类名.类成员变量的方式
		
        c6.priceArray(car); // 对象名.类成员方法
		c6.priceArray(car); // 类名.类成员方法直接来使用成员方法
	}
}
class Car
{
	// 定义的普通的成员变量
	private static String brand; // 汽车品牌
	private int seats; // 汽车座位
	private String color; // 车身颜色
	private int weight; // 载重 吨
	private static int price; // 价格 万

	public int count1 = 0; // 普通的成员变量-----单个实例对象
	public static int count2 = 0; // 类成员变量

	// 定义空参构造方法
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
    // 定义普通的成员方法
	public void run(int speed)
	{
		System.out.println(getBrand()+"的马力是"+speed+"公里/小时");
	}
	// 定义普通的成员方法---车的价钱由低到高排序
	// 非静态方法可以调用静态的方法
	// 非静态方法可以调用非静态的方法
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
	// 静态的方法不能访问非静态的成员变量
	// 静态的方法只能访问静态的成员变量
	// 静态的方法调用静态的方法
	public int getPrice() // 改成类成员方法
	{
		getBrand();
		return price;
	}
	public static String getBrand()
	{
		return brand;
	}
}
class Demo4 // 执行类和实体类
{
	// 静态的缓存区可以定义非静态缓存区，非静态缓存区不能定义静态的缓存区
	private static int count = 0;
	private int age = 100;
	{
		// 非静态代码块执行----依赖于实例对象的生成
		System.out.println("age="+age);
		System.out.println(count+"非静态代码块1");
	}
	static
	{
		// 静态缓存区在类被加载的时候就已经存在
		// jvm运行时候直接去缓存区中取数据
		// 静态缓存区与实例对象的生成没有关系
		// 静态缓存区只能加载静态的资源，不能加载非静态的资源
		// System.out.println("age="+age);
		count = 100;
		System.out.println(count+"静态代码块1");
	}
	public Demo4()
	{
       count++;
	   System.out.println(count+"创建对象的构造方法");
	}
    {		
		count++;
		System.out.println(count+"非静态代码块2");
	}
	static
	{
		{
			System.out.println(count+"非静态代码块4");
		}
		System.out.println(count+"静态代码块2");
	}
	public void fun()
	{
		{
			count++;
			System.out.println("非静态代码块3");
		}
		System.out.println("fun");
	}
	public static void main(String[] args)
	{
       System.out.println("count="+count);
	   // 当实例对象生成的时候非静态代码块就会被执行
	   new Demo4().fun();
	   System.out.println("count="+count);
	   // 执行顺序
	   // 1 静态代码块
	   // 2 非静态代码块
	   // 3 构造方法
	}
}
