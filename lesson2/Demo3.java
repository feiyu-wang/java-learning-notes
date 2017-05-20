class Demo3 
{
	public static void main(String[] args)
	{
		/**
         变量的定义
		 变量的赋值
		 变量的取值
         在同一个方法体中不能重复的定义变量
		 // 定义一个整数类型的变量
        //将getValue()的数值从内存中取出，放入到ｍ变量
		**/
		int i = 10; // 计算机开辟内存空间 0200
	
		System.out.println("i = "+ i); // 将变量i的值从内存中取出并打印输出
	    i = 15; //重新赋值 
		System.out.println("i = "+ i); // 第二次给变量i的值从内存中取出并打印输出

		int j ; // 计算机重新开辟一个地，这个内存空间地址 0300 
   
		j = i+100; // 将计算机i变量内存中存放的值取出，
		// 将i的值与数值100做相加运算，运算的结果放入到0300也就是j所在的内存中
		System.out.println("j = "+ j); 

		int a,b = 10,c = 20; // 同一种数据类型的变量,只定义一个数据类型就可以

		a = b+c; // 变量a的值由变量b和变量c从内存中取出的值相加求和获得

		System.out.println("a="+ a);
		System.out.println("b="+ b);
		System.out.println("c="+ c);
       
		int m = getValue();

		System.out.println("m="+m);
	
	}
    /**
    getValue()返回一个整数10 
	**/
	public static int getValue()
	{
		return 10;
	}
}
