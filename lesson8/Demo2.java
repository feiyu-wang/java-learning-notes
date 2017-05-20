
class Demo2 
{
	/**
	求三个整数的最大值，最小值，和，积，从小到大排序，从大到小排序
	**/
	static int max ; // 定义最大值的变量
	static double min ;// 定义最小值的变量	
	public static void main(String[] args) 
	{
		System.out.println("三个int的max="+getMax(8,30,53));
		System.out.println("三个double的min = "+ getMax(8.7,45.4,89.2));
	}
	/**
    求三个整数的最大值---三个int 
	**/
    public static int getMax(int a,int b,int c)
	{
//		if(a>b&&a>c)
//		{
//          max = a;
//		}
//		else if(b>a&&b>c)
//		{
//          max = b;
//		}
//		else
//		{
//		   max = c;
//		}	
//        max = a; //假设第一个数是最大的
//		if(b>max)
//		{
//           max = b; 
//		}
//		if(c>max)
//		{
//			max = c;
//		}
        // Math的max()方法比较俩个数中较的一个，俩个数必须是同一类型的数据
        max = Math.max(Math.max(a,b),c);
		return max;		
	}

    /**
	求三个double类型数据的最小值
	**/
	public static double getMax(double a,double b,double c)
	{
        min = a;
		if(b<min)
		{
           min = b;
		}
		if(c<min)
		{
			min = c;
		} 
		return c;
	}    
}

class Demo3
{
	static int temp; //三个int的最小值
	static int year;
	public static void main(String[] args)
	{
        getMax(23,30,34);
		
	}
	public static void getMax(int a,int b,int c)
	{
       if(a>b)//交换a和b的位置   
	   {
           temp = a;
	       a = b;
	       b = temp;               
	   }
	   if(a>c) //交换a和c的位置  
	   {
		   temp = a;
		   a = c;
		   c = temp;
	   }
	   if(b>c)  // 34 
	   {
		   temp = b;
		   b = c;
		   c = temp;
	   }
	   System.out.println("从小到大的排列顺序是："+a+"<"+b+"<"+c);
	}

    public 
			return false;
		}
	}
}
