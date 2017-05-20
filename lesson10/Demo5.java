import java.util.*;
class Demo5 
{
	/**
	数组的查询：
	从一个数组中查询其中某一个元素。
	数组工具类---Arrays-----二分法查询

	1  工具类中二分法查询---binarySearch(查询的数组名,查询的元素)
	返回的结果是查询的元素在数组中的下标，是一个int值;
	前提条件：数组元素必须是升序排列
    
	2  二分法查询的算法： 

	   算法原理： 数据量很大的时候，先将这一堆数据一分为二，

	   查询元素是否在前半部分，如果查询在前半部分数据中，那么后半部分数据就不进行检索

	   再次将数据分成俩部分，查询元素是否在前半或者后半部分。这种二分要一直到
	   
	   元素的位置为止。

	**/
	public static void main(String[] args) 
	{
		int[] arr = {3,45,6,90,2,7,9};
		Arrays.sort(arr);
		printArray(arr);
        int index = Arrays.binarySearch(arr,9);
		System.out.println("查询的元素在数组中第"+index+"个位置上");
        int index1 = searchTwo(arr,10);
		System.out.println("查询的元素在数组中第"+index1+"个位置上");
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
	}
	/**
	二分法的算法

	@param int[] arr 要查询的数组
	@param int key   要查询的元素
	**/
	public static int searchTwo(int[] arr,int key)
	{
        //1 要查询数组的中间元素
		// low -----数组中下标的最低位
		// high ----数组中下标的最高位
		int low = 0,high = arr.length-1;
        
	    //2 3 6 7 9 45 90 
		// index ----要查询元素的下标
		int index = 0;
       
		while(low<=high)
		{
            index = (low+high)/2; 
			if(key<arr[index])
			{
                high = index-1; //当查询的数据小于中间位置，只需要查前半部分，最高位变为中间位置-1
			}
			else if(key>arr[index])
			{
				//当查询的数据大于中间位置，需要查询后半部分的数据，最低位变为中间位置+1
				low = index+1;
			}
			else
			{
               return index;
			}		
		}
		
		return -(index+1);
    }
}
