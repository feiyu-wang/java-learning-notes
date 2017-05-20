class Demo2 
{
	/***
     java基本类型，关键字，数据范围

	****/
	public static void main(String[] args) 
	{
		 // 定义byte类型类型的变量。放入一个byte数据,byte的数据范围 【-128  127】
		byte b = -128; // Byte是byte类型数据的包装类
		System.out.println("b="+b);
		System.out.println("byte的最大值："+Byte.MAX_VALUE);  // 127
		System.out.println("byte的最小值："+Byte.MIN_VALUE);  // -128

		// 定义short类型的变量
		short s = 10000;
		System.out.println("s =" + s);
		System.out.println("short的最大值" + Short.MAX_VALUE);
		System.out.println("short的最小值" + Short.MIN_VALUE);

		//定义一个整型的变量

		int value = 21379878; // Integer 是int类型数据的包装类
        
		String str = "hello";
	    System.out.println("value =" +value);
		System.out.println("int的最大值"+ Integer.MAX_VALUE);//int的最大值2147483647
	    System.out.println("int的最小值"+ Integer.MIN_VALUE); //int的最小值-2147483648
    	// 定义一个长整型的变量 

		long l = 1723901878L;

		//System.out.println("value的二进制表示："+Integer.toBinaryString(l));

		System.out.println("l = "+ l);
		System.out.println("long的最大值："+Long.MAX_VALUE);//long的最大值：9223372036854775807

		System.out.println("long的最小值："+Long.MIN_VALUE); //long的最小值：-9223372036854775808
       
	    // 定义一个单精度类型的变量
        //  整数部分不占内存,小数点后8位可见，再多的数据就直接省略掉
		//  整数部分占内存，小数点后6位可见
		float f = 11.6182689664f; // 不加f的浮点型数据就默认是double类型的数据

		System.out.println("f="+f);
		System.out.println("float的最大值："+Float.MAX_VALUE); //3.4028235E38
		System.out.println("float的最小值："+Float.MIN_VALUE); //float的最小值：1.4E-45
		 
		double d = 0.21738973298745662; //最多是17位可见

		System.out.println("d = "+d);
		System.out.println("double的最大值："+Double.MAX_VALUE);
		System.out.println("double的最小值："+Double.MIN_VALUE);

		// 定义一个char类型的变量

		char ch = 'k'; // 每一个字母都对应一个整数

		char ch1 = 65 ; // 根据字母的askii码定义字符变量

		System.out.println("ch1 =" +ch1); // A
		System.out.println("ch =" + ch); // 回车键

		char ch2 = '\u0051';

		System.out.println("ch2 ="+ch2);

		String str1 = "hello";

        int code1 = str1.charAt(0); // 'h'的askii码

        System.out.println("hello的第一个字母的askii码是："+code1);

        // 定义boolean类型的变量
		boolean isTrue = false;
		System.out.println("isTrue = "+isTrue);
       
	}
}
