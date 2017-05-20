class Demo2 
{
	/**
	数组的定义和声明，初始化。
	**/
	public static void main(String[] args) 
	{
		// 数组的声明，告诉计算机在堆中开辟一块地具体的首地址
		int[] a; // 计算机开辟一块能够放置整型数据的地址0100
		// 数组的定义：通过new关键字在栈中开辟一块内存空间，放置具体数目的元素
		a = new int[5]; // 在0100首地址上放进去5个整型数据元素；
		// 数组的初始化：开辟的内存中放入具体的元素
		// 数组的元素操作,从整型数据的0下标开始
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
        // 数组长度一旦定义，不能再改变
		// 数组声明和定义一次写
		// 定义放入8个double类型数据的数组
		double[] d = new double[8]; //一定要定义元素个数
		// 第一种初始化方法：默认初始化
		// 将数组中元素一次性全部取出----数组元素的遍历---遍历方法：下标遍历法
		// 数组的长度---属性-----length----数组中元素的个数---数组名.length
		// 字符串的长度---方法---length()
		// 正向取出元素
		for(int i = 0;i<=d.length-1;i++)
		{
			System.out.print(d[i]+" ，");
		}

		// 第二种初始化方法： 动态初始化 ： 开辟内存空间与赋值操作分隔开来
        // 1 指定元素的个数,String数组的长度是10
		String[] strArr = new String[10];
		// 2 通过下标对元素赋值
		strArr[0] = "hello";
		strArr[1] = "ashia";
		strArr[2] = "wolrd";
		// 3 将数组中元素遍历反向取出
		for(int i = strArr.length-1;i>=0;i--)
		{
			System.out.println(strArr[i]);
		}
        // 2 不指定元素个数，通过元素数值确定的元素个数
		String[] strArr1 = new String[]{"h","ashias","wajsji","ashgiasa"};

		// 第三种初始化方法：静态初始化： 开辟内存并且赋值

		char[] chArr = {'9','d','g','r','7','0'};// 定义一个char类型的数组，放入静态的数据

		chArr = new char[]{'e','m','w','y','h','6','4','9'}; // 数组重新赋值，数组的扩容

		for(int i = 0; i<=chArr.length-1;i++)
		{
            System.out.println(chArr[i]);
		}
		
		/**
		遍历数组中元素： 第一种：下标遍历法
		                 第二种：超级for循环---不从数组中小标来获取元素
						 // 只能正向获取数组中的元素
		**/

		for(char ch : chArr)
		{
			System.out.println(ch); // 打印数组中每一个元素
		}

	}
}
