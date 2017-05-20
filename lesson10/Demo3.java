import java.util.*;
class Demo3 
{
	/**
	从键盘输入字符串，字符串长度从小到到比较
	**/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		  //获得字符串的长度数组
          int[] arr_int =  getInputInt(getInputStr());
		  // 字符串的长度数组由小到大排序
		  Arrays.sort(arr_int);
		  // 打印排序后的数组
          printArray(arr_int);
	}
	/**
	*从键盘循环输入字符串
	**/
	public static String[] getInputStr()
	{
		String[] arr = new String[5];
		// 循环输入5次
		for(int i = 0; i<5;i++)
		{
		   System.out.println("请输入字符串；");
           arr[i] = input.next();
		   System.out.println(arr[i]);
		}
		return arr;
	}

	/**
	获得字符串数组的长度数组
	**/
	public static int[] getInputInt(String[] arr)
	{
	   int[] arr_int = new int[5]; 
       for(int i = 0; i<arr_int.length;i++)
	   {
		   arr_int[i] = arr[i].length();
	   }
	   return arr_int;
	}

	/**
	打印长度数组
	**/
	public static void printArray(int[] arr)
	{
       for(int i: arr)
	   {
		   System.out.print(i+" ");
	   }
	}

	
}
