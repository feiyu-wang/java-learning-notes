class Demo2 
{
	/**
	  常量数据
	**/
	public static void main(String[] args) 
	{
		System.out.println(-20);
		// 整数的二进制表示方式---负数的二进制表示以1开头
		// 正数的二进制表示以0开头
		// 整数的二进制字符串文本的表示方式打印输出
		// Integer -------------整数类中的toBinaryString()方法将-20 转换成二进制文本

		System.out.println(Integer.toBinaryString(-20)); //11111111111111111111111111101100 
         
		System.out.println(020);// 整数的八进制表示会直接转换成十进制，在内存中转换成二进制

		System.out.println(0x20); //整数的十六进制表示，以0x开头
		
		System.out.println(0xd); // 13 字母的大写和小写没有区别

		System.out.println(8.9798127f); // 单精度浮点型常量

		System.out.println(132.0218390183902183); // 双精度浮点型常量

		System.out.println(100000000000000000L); // 长整型类型的数据，以9开头，19位整数
         
		System.out.println(Long.MAX_VALUE);//9223372036854775807 长整型数据的最大值范围


		System.out.println(Long.MIN_VALUE);//-9223372036854775808 长整型数据的最小值范围


        char ch = 65; // char 表示字符型数据 
		System.out.println('A'); // 字符数据
        
		System.out.println(ch); //字符数据
        
        // 布尔类型的数据多用于判定条件
		// 其他类型的数据不能跟布尔值进行转换------布尔表达式------表达式的结果最终还是true或者false
		if(10==20)// ------false 
		{
			System.out.println("真的");
		}
		else
		{
			System.out.println("假的");
		}
	}
}
