class Demo2 
{
	/*****
	100以内的所有偶数的求和。
	*****/
	public static void main(String[] args) 
	{
		/****
		第一种：while循环
		****/
		int i = 1;
		int sum = 0;
		while(i<=100)
		{
            sum+=i; // 循环执行的语句
			i+=2;
			System.out.println("sum="+sum);// 2550
		}

		System.out.println("======================================");
		/**
		第二种：do-while循环
		**/
		i = 0;
		sum = 0;
		do
		{
			sum+=i;
			i+=2;
			System.out.println("sum="+sum); 
			// i = 0 sum = 0  
			// i = 2 sum = 2
			// i = 4 sum = 6 
			// i = 6 sum = 12 
		}
		while (i<=100);
        System.out.println("======================================");
		/**
		第三种： while循环二
		**/
		i = 0;
		sum = 0;
		while(i<=100)
		{
			if(i%2==0)
			{
				sum+=i;
				System.out.println("sum="+sum);
			}
			i++;
		}
        System.out.println("======================================");

		/***
		第四种：while循环三
		***/
        i = 0;
		sum =0;
		while(true)
		{
           if(i<=100)
		   {
              if(i%2==0)
			  {
				  sum+=i;
				  System.out.println("sum="+sum);
			  }
			  i++;
		   }
		   else
		   {
			  break; // 循环体中的break语句，结束整个循环，继续执行下面的语句
		   }
		}

		System.out.println("====================================");

		/***
		第五种： for循环一
		***/
		sum = 0;
		for(int j= 0;j<=100;j+=2)
		{
			sum+=j;
			System.out.println("sum="+sum);
		}
		System.out.println("====================================");

		/***
		第六种： for循环二
		***/
		sum = 0;
		for(int j= 100;j>0;j-=2)
		{
			sum+=j;
			System.out.println("sum="+sum);
		}
        System.out.println("====================================");

		/***
		第七种：for循环三 求偶数的和
		***/
		sum = 0;
		for(int j = 100;j>0;j--)
		{
			if(j%2!=0)
			{
               continue; // 跳过本次循环continue语句后面的执行，进入下一次循环
			}
			sum+=j;
			System.out.println("sum="+sum);
		}
		System.out.println("====================================");

		/**
		第八种： for循环四
		**/

		sum = 0;
        int j = 0;
		for(;;)
		{
           if(j<=100)
		   {
               if(j%2==0)
			   {
				   sum+=j;
				   System.out.println("sum="+sum);
			   }
			   j+=2;
		   }
		   else
		   {
			   break;
		   }
		}		
	}
}
