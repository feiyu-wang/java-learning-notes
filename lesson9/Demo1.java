import java.util.*;
class Demo1 
{
	static Scanner  input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		while(true)
		{
		System.out.println("������a��ֵ");
		int a = input.nextInt();
		System.out.println("������n��ֵ");
		int n = input.nextInt();
		/**
		��һ�֣� a = 1  n = 4

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
			�ڶ����㷨��

			1+11+111+1111   -----10��ϵ��

			i = 1     ���λ�� 1000 *1 

			i = 2     ���λ�� 100 *2 

			i= 3       ���λ��  10*3

			i = 4      ���λ��  1*4 
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
