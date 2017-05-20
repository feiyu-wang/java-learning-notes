class Demo1 
{
	/***
    流程控制复习
	****/
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		if(a>b)
		{
			System.out.println("a大于b");
		}
		else 
		{
			System.out.println("a小于b");
		}
		// 简单分支结构：选择条件只有一个------条件运算符 ? : (三目运算符)
		System.out.println((a>b)?"a大于b":"a小于b");

		//System.out.println(null);
        
		//System.out.println((a>b)?System.out.println("a大于b"):System.out.println("a小于b"));

        //条件运算符：?前面写判定条件 ：必须是简单的变量不能是语句

		System.out.println(a>b?a:b);

		System.out.println("a和b的奇偶性是："+((a%2==0&&b%2==0)?"偶数":"奇数"));


		int m = 4;

		getValue(m);

   
	}

	public static int getValue(int h)
	{
          int j = 0;
		  switch(h)
		  {
			  case 1:j++;
			  case 2:j++;
			  case 3:j++;
			  case 4:j++;
			  case 5:j++;
			  case 6:j++;break;
			  case 7:j++;
			  case 8:j++;
			  case 9:j++;
			  default:++j;
		  }
		  return h+j;
	}

}
