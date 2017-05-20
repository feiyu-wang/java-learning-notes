class Demo9 
{
	/***
	循环结构： 1+2+3+4+......+100 = 
	***/
	public static void main(String[] args) 
	{
		/**
        循环体 ： +

		循环初始值 :i = 1    sum = 1  

		            i = 2    sum = sum(i=1)+2

					i = 3    sum = sum(i=2)+3 


					i = 99   sum = sum(i=98)+99
					
					i = 100  sum = sum(i=99)+100
        循环的变化：i++;
		循环的结束：i=100		
		**/
		/**
		while循环
		**/

        int i = 1;//计算器的初始值
		int sum = 0; // 求和的初始值
		while(i<=100)
		{
            sum = sum + i; // i = 1  sum = 1
            i++;      // i = 2 sum = 1+2	
			System.out.println("1+2+3+......+100="+sum);
		}

		/**
		do-while
		**/
        int x = -20;
		do
	    {
           System.out.println("x++="+x++);
		}
		while (x>0);
		
	}
}
