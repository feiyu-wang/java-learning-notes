class Demo2 
{
	/*****
	100���ڵ�����ż������͡�
	*****/
	public static void main(String[] args) 
	{
		/****
		��һ�֣�whileѭ��
		****/
		int i = 1;
		int sum = 0;
		while(i<=100)
		{
            sum+=i; // ѭ��ִ�е����
			i+=2;
			System.out.println("sum="+sum);// 2550
		}

		System.out.println("======================================");
		/**
		�ڶ��֣�do-whileѭ��
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
		�����֣� whileѭ����
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
		�����֣�whileѭ����
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
			  break; // ѭ�����е�break��䣬��������ѭ��������ִ����������
		   }
		}

		System.out.println("====================================");

		/***
		�����֣� forѭ��һ
		***/
		sum = 0;
		for(int j= 0;j<=100;j+=2)
		{
			sum+=j;
			System.out.println("sum="+sum);
		}
		System.out.println("====================================");

		/***
		�����֣� forѭ����
		***/
		sum = 0;
		for(int j= 100;j>0;j-=2)
		{
			sum+=j;
			System.out.println("sum="+sum);
		}
        System.out.println("====================================");

		/***
		�����֣�forѭ���� ��ż���ĺ�
		***/
		sum = 0;
		for(int j = 100;j>0;j--)
		{
			if(j%2!=0)
			{
               continue; // ��������ѭ��continue�������ִ�У�������һ��ѭ��
			}
			sum+=j;
			System.out.println("sum="+sum);
		}
		System.out.println("====================================");

		/**
		�ڰ��֣� forѭ����
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
