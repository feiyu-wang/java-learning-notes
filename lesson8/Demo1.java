class Demo1 
{
	static int max = 0;
	public static void main(String[] args) 
	{
	   /**
	   打印10行等腰三角形的算法
	   ***/
	   printTrigle(10); // 方法的调用
	   /**
	   打印8行等腰三角形
	   **/
	   printTrigle(8);
	   printTrigle(6);
	   
	   // main()中调用printRectangle()方法
//	   printRectangle(10,5);
//	   printRectangle(7,9);
       String name = "王二小"; // 实参;
	   System.out.println("code="+ getCode(name));
	   System.out.println("max="+ getMax(8,39,59));	  
	}
	/**
	方法的定义: printTrigle()打印固定行数的等腰三角形
	**/
    static void printTrigle(int row)
	{
        for(int i= 0; i<row;i++)
	    {
		   for(int j =0; j<row-i-1;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int j =0;j<2*i+1;j++)
		   {
			   System.out.print("★");
		   }
		   System.out.println();
	    }
		// 在打印三角形的方法体中调用打印矩形的方法
		printRectangle(10,3);
		printRectangle(6,8);
	}
    /***
	打印固定行，固定列的矩形方法
	***/
	static void printRectangle(int row,int col)
	{
		for(int i= 0; i<row;i++)
		{
			for(int j = 0; j<col;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}

	/**
	自定义方法，定义返回字符串的每个字符的中文编码
	**/
	public static int getCode(String name1) // 形参
	{
        char[] ch = name1.toCharArray();
        int code1 = ch[0];
		int code2 = ch[1];
		int code3 = ch[2];
		if(name1.length()==1)
		{
           return code1;
		}
		else if(name1.length()==2)
 		{
           return code2;
		}
		else
		{
		   return code3;
		}
	}   
}
