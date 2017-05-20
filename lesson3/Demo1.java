class Demo1 
{
	static int age;  // 定义一个全局变量age，没有初始化，
	public static void main(String[] args) 
	{
		System.out.println(0x18); // 十六进制的整数放入计算机内存中 72 
        System.out.println(18290183291268618L); //长整型数据 后缀L
		System.out.println(Long.MAX_VALUE);        
		int m,n,x = 10,y = 20,z = 30; // 变量的定义,main()方法的局部变量
        
		m = 100; // 变量的第一种赋值，直接赋数值

		n = m + 90; // 第二种赋值，是表达式
		m = x+y+z; 		
		System.out.println("m="+m);        
		int i = getValue();  // 100  变量的值是方法返回值
		System.out.println("i="+i);

		String name ="s:hksaa:ok:hello"; // 变量赋值为null ,引发程序的NullPointerException 

		int length = name.length(); 

		System.out.println(length); // 字符串类型的数据才有的length()获取name字符串的长度是一个整数值
        
		if(i==100) // 比较的结果就是布尔值，true,false 
		{
			int age = 20; // main()方法中的if{} 中的局部变量
			//全局变量和局部变量重名的时候，访问的是局部变量
		    String[] str = name.split(":"); // split() 方法将一长串字符串根据（）分割成几个短字符串

            System.out.println("str = " +str); // 首地址
			System.out.println(str[0]);
			System.out.println(str[1]);
			System.out.println(str[2]);
			System.out.println(str[3]);
			System.out.println("if age="+age);
		}
		else
		{
           System.out.println("x ="+ x);
		   System.out.println("y ="+ y);
		}
		System.out.println(" main age = "+ age);
		// 在main()方法中使用circleArea()方法
		circleArea(8.979878f);   

	}
	// 自定义getValue()方法，
	public static int getValue()
	{
		System.out.println("getValue age = "+ age );
		return 100;
	}
    
	// 求圆的面积和周长
    // 圆周率 最终常量 Math.PI --- 代表了具体的数值
	// 半径 
	public static void circleArea(float radius)
	{
		double  area  =  Math.PI * radius * radius;
		double  circulate = 2 * Math.PI * radius;
		System.out.println("圆周率是："+Math.PI);		
		System.out.println("圆的面积是："+ area);
		System.out.println("圆的周长是："+ circulate);
	}

}
