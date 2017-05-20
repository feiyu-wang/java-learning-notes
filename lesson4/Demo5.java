class Demo5 
{
	/****
	关系运算符 > < >= <= == != 

	比较数据相等： ==  equals()方法
	***/
	public static void main(String[] args) 
	{
		int a = 10; // 0100
		int b = 10;

		boolean re1 = a>=b; //a如果b成立的话，布尔表达式的结果就是true,相反的话就是false
		
		System.out.println("re1="+re1);

		boolean re2 = a<=b; // 成立，表达式的结果就是true

		System.out.println("re2="+re2);

		boolean re3 = (a==b);// 变量a和变量的b的值相等的，表达式就是true

		System.out.println("re3="+re3);
		boolean re4 = (a!=b);
		System.out.println("re4="+re4);

        String str1 = "hello world"; // 定义一个字符串类型的数据
		String str2 = new String("hello world"); // 第二种定义字符串数据的方法
		String str3 = new String("hello world");
        // str1和str2在计算机内存中存储数据的地方不同，= 赋值，字符串缓存区中--0200
		// str2的定义，new关键字一定会堆内存中开了一个首地址
		// str3的定义，new关键字在堆内存中开辟一个首地址
		System.out.println(str1==str2); // false
		System.out.println(str1==str3); // false
		System.out.println(str2==str3); // false
		System.out.println(a==b);
		// 比较字符串的内容是否是相同的---equals()方法
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));

		//System.out.println((a++)<=(b--));

		if((a++)<(b--)|(str1!=null)|(str2==null))
		{
           System.out.println("逻辑或成立");
		}
		else
		{
			System.out.println("逻辑或不成立");
		}

		System.out.println(!(str1==str2));

		boolean flag = true;

		boolean result = (!flag)&&(a++>b);

		System.out.println("reault = "+result);

		System.out.println("a="+a);

		boolean result1 = (flag)||(a++<b);

		System.out.println("result ="+result1);
		System.out.println("a="+a);


	}
}
