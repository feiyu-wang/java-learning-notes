import java.util.*;
class Demo1 
{
	static Scanner  input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		while(true)
		{
		System.out.println("请输入a的值");
		int a = input.nextInt();
		System.out.println("请输入n的值");
		int n = input.nextInt();
		/**
		第一种： a = 1  n = 4

		1+11+111+1111 

		i = 1     t = 1 

		i = 2     t = 1*10+1

		i = 3     t = 11*10+1

		i = 4     t = 111*10+1

		**/
//		    long sum = 0;       
//			long t = 0;
//			for(int i = 1;i<=n;i++)
//			{
//				t = t*10+a;
//				sum+=t;
//				System.out.println("sum="+sum);
//			}
			//System.out.println("t="+t);
			/*
			第二种算法：

			1+11+111+1111   -----10的系数

			i = 1     最高位数 1000 *1 

			i = 2     最高位数 100 *2 

			i= 3       最高位数  10*3

			i = 4      最高位数  1*4 
			*/
		   int sum = 0;
           for(int i = 1;i<=n;i++)
		   {
			   int w = 1;
			   for(int j = n-i;j>0;j--)
			   {
			      w = w*10;  
			   }
			   sum+= a*w*i;
			   System.out.println("sum="+sum);
		   }	
			
		}

	}
}
