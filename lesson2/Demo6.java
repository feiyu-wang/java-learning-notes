class Demo6 
{
	/**
	变量的作用域：

	全局变量和局部变量
	**/   
    // static 关键字修饰的方法只能访问static修饰的全局变量
    static String name ; // 定义字符串类型的变量，并且赋值为张三
	static int age ; // 定义整数类型的全局变量age,age的值放了10 
	static boolean gender; 
	{
		 // 独立代码块---独立的数据空间
		 int y = 30;
	}
	public static void main(String[] args) 
	{
		// 局部变量: 定义在方法体内部。使用范围就是在方法体内部使用，
		//出了方法体不能使用
		int x = 10 ; 
		System.out.println("x="+x);			
		// 在main()中使用get()方法
		get();
		//System.out.println("name = "+name);        
		int age = 20; // 定义了一个局部变量age,全局变量和局部变量同名，
		// 方法体中访问的是局部变量
		System.out.println("age = "+ age);
        // main()方法加一个独立代码块
		{
			// main()方法定义的局部变量可以进入独立代码块中
            x = 30;
			System.out.println("x =" +x); 
			int j = x+10; // 独立代码块中定义的变量不能在代码块外部使用
		}

		//System.out.println("j="+j); 
		
	}
    public static void get()
	{
		//System.out.println("x="+x);
		//String name = "王五"; // get方法中的局部变量
		//name = "李四"; 将成员变量的值修改为李四
		System.out.println("get name = "+ name);
		System.out.println("get age = "+ age);
		System.out.println("get gender  = "+ gender);
	}

}
