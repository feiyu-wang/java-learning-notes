import java.util.*;
class Demo2 
{
	/**
    数组元素操作的方法----数组工具类-----Arrays---java.util.Arrays

	求最值方法：

	1 最大，最小值---一组数据的最大值或者最小值
    
	2 将数组按照升序排列-----第0个下标-最小值，第length-1个下标--最大值
	
	**/

    static int max ;
	static int min;
	static int sum;
	
	public static void main(String[] args) 
	{
		int[] arr = {3,5,9,264,2,46,23,100,76};
        
		getMax(arr); // 求得数组中的最大值，最小值，求和的结果

		print(); // 将上面求得的结果打印输出

	    //对原数组进行排序，使用数组工具类
        
		Arrays.sort(arr); // sort()方法---负责升序排序

        printArray(arr);// 打印升序排列之后的数组

		System.out.println("数组中的最大值是："+arr[arr.length-1]);
		System.out.println("数组中的最小值是："+arr[0]); 	
	}

	/**
	自定义一个方法，求最大值,求最小值
	**/
	public static void getMax(int[] arr)
	{
         max = arr[0]; //假设第一个元素就是最大值
		 min = arr[0];
		 // 将最大值与其他的所有的元素做比较
		 for(int i = 0; i<arr.length;i++)
		 {
             if(max<arr[i])
			 {
				 max = arr[i];
			 }
			 if(min>arr[i])
			 {
				 min = arr[i];
			 }
			 sum+=arr[i];
		 }
	}
	/**
	自定义一个方法，专门负责打印
	**/
	public static void print()
	{
		System.out.println("数组的最大值是："+max);
		System.out.println("数组的最小值是："+min);
		System.out.println("数组的求和值是："+sum);
	}

	/**
	打印数组
	**/
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
           System.out.print(i+" ");
		}
		System.out.println();
	}
}
