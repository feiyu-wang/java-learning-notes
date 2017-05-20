import java.util.*;
class Demo1 
{
	/**
	自定义数组{1,2,3,4,5}

	最终打印输出{1,2,3,4,5,5,4,3,2,1}

	向数组中插入一个元素

	二维数组的对角线求和
	**/
	public static void main(String[] args) 
	{
       int[] arr = {1,2,3,4,5};
	   System.out.print(Arrays.toString(expand(arr)));
	   //printArray(expand(arr));

	   System.out.println();
	   System.out.println(Arrays.toString(insert(arr,2)));

	   int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
	   System.out.println("二维数组对角线求和的结果是："+getSum(arr1));
	}
	/**
	数组扩容
	**/
	public static int[] expand(int[] arr)
	{
       //int[] newArr = Arrays.copyOfRange(arr,0,arr.length);
	   int[] newArr = new int[arr.length*2];
	   System.arraycopy(arr,0,newArr,0,arr.length);
	   //sort(arr);
	   System.arraycopy(arr,0,newArr,arr.length,arr.length);
	   return newArr;  
	}
	/**
	反向遍历
	**/
	public static void printArray(int[] arr)
	{
       for(int i = arr.length-1;i>=0;i--)
	   {
		   System.out.print(arr[i]+" ");
	   }	  
	}
	/**
	降序排列
	**/
	public static void sort(int[] arr)
	{
	   for(int i = 0; i<arr.length-1;i++)
	   {
		   for(int j = i+1;j<=arr.length-1;j++)
		   {
			   if(arr[i]<arr[j])
			   {
				   int temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
			   }
		   }
	   }
	}
	/**
	插入一个元素，打印插入元素后的数组
	**/
	public static int[] insert(int[] arr,int pos)
	{
		// 1 2 10 3 4 5 
        int[] newArr = new int[arr.length+1];
		System.arraycopy(arr,0,newArr,0,pos);
		newArr[pos] = 10;
		System.arraycopy(arr,pos,newArr,pos+1,arr.length-pos);
		return newArr;
	}
	/**
	二维数组对角线求和

	1 2 3

	4 5 6

	7 8 9  
	
	1   i=j  2 i+j=2

	**/
	public static int getSum(int[][] arr)
	{
		int sum = 0; // 对角线元素之和
        for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				if(i==j||i+j==2)
				{
					System.out.print(arr[i][j]+" ");
					sum+=arr[i][j];
				}
			}
		}
		return sum;
	}	
}
