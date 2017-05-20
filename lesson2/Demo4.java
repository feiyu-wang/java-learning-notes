class Demo4 
{
	/**
	定义俩个整数类型的变量分别赋值，第一次赋值打印输出，

	变量的值互换，再将互换后的值打印输出。
	**/
	public static void main(String[] args) 
	{
		int m = 10;
		int n = 20;
		System.out.println("交换前m的值："+m);
		System.out.println("交换前n的值："+n);

//		m = n; 
//		n = m;
        int temp  = m; // 将变量m的值取出，放入到中间值内存

        m = n ; //将变量n的值取出，放入到变量m
		
        n = temp;  // 将中间值内存中值取出，放入到变量n中
          
		System.out.println("temp="+temp);
		System.out.println("m="+m);
		System.out.println("n="+n);

	}
}
