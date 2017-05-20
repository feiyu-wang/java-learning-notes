import java.util.*;
class Demo3 
{
	/**
	多维数组： 一个维度实质就是一个一维数组。多维就是多个一维数组组成的矩阵
    仅限于二维数组 
	定义： 元素类型[][] 数组名 = new 元素类型[3][3];
    赋值： 数组名[0][1] = 1; 数组名[0][2] = 2

	         -x 
		   y ----------

		     0 1 2 3    arr[0] = {0,1,2,3};
 
			 4          arr[1] = {4};

			 5 9 8      arr[2] = {5,9,8};

			------------

    取值： 数组名[行][列] 

	       行数---一维数组的个数： arr.length

		   列数---每一个一维数组的长度： arr[i].length

	一次性全部取出二维数组中的所有的数据
	for(int i = 0;i<3;i++)
	{
		for(int j = 0; j<4;j++)
		{
			System.out.print(arr[i][j]);
		}
    }

	**/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] arr = new int[][]{{0,1,2,3},{4},{5,9,8}};
        printArray(arr);
        System.out.println("请输入数组的行数：如5");
		int m = input.nextInt();
		System.out.println("请输入数组的列数：如5");
		int n = input.nextInt();
		int[][] arr1 = new int[m][n];
		// 打印m行m列的空值
		printArray(arr1);
        // 将m-3行n-2列的数值改为100
		arr1[m-3][n-2] = 100;
        // 打印修改之后的二维数组
		printArray(arr1);

		// 一次性将所有的元素填充为10的方法
		fill(arr1);
		printArray(arr1);


	}
	/*
	将二维数组中的元素全部取出
	*/
	public static void printArray(int[][] arr)
	{
      for(int i = 0;i<arr.length;i++) // 打印第几个一维数组，换行
      {
		  for(int j = 0;j<arr[i].length;j++)//打印一维数组
		  {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
	}

	/**
	模拟fill()---给一维数组填充相同的元素
    给二维数组赋相同的元素
	**/
	public static void fill(int[][] arr1)
	{
        for(int i = 0; i<arr1.length;i++)
		{
           for(int j = 0; j<arr1[i].length;j++)
		   {
			    // Random类---产生随机数的类
				// nextInt()方法---产生2的32次方以内的一个数
                // nextInt(n)方法---产生n（不包括n）以内的随机的一个整数
                arr1[i][j] = new Random().nextInt(100);
		   }
		}
	}

}
