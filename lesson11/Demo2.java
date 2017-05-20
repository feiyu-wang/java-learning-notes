import java.util.*;
class Demo2 
{
	/**数组工具类： 填充，转换成字符串，元素的复制

	1 填充：数组元素的赋值，通过下标=赋值

	  一次性赋相同的值给数组。

	  fill(数组名，元素值);
	  fill(数组名，赋值的起始位置，赋值的末尾位置，元素值)；

	 2 转换成字符串：

	   将数组中的所有的元素连接成一长串字符打印输出

	   toString(数组名);

	 3 元素的复制：

	   Arrays工具类复制   copyOf(复制的数组名，复制的元素个数);

	                      copyOfRange(复制的数组名,复制的起始位置，复制的终点位置);

						  1 复制元素个数可以超过原数组的元素个数

						  2 复制后的新数组的长度由方法中复制个数参数决定，而不是你新数组开辟的内存空间决定

	   System类           arraycopy(源数组，源数组复制的起始位置，目标数组，目标数组的起始位置，复制个数)
                          
						  1  不能超过原数组的最大个数

						  2  目标数组的长度不能小于要赋值的元素的个数
	**/
	public static void main(String[] args) 
	{
		System.out.println("--------------元素填充-------------------");
		String[] str = new String[6]; // 空数组
		// 调用方法来打印空数组
		printArray(str); 
		// 通过转换字符串的方法打印数组
		System.out.println(Arrays.toString(str));
        Arrays.fill(str,"hello"); // 一次性全部赋值后的数组
        printArray(str);
		Arrays.fill(str,2,5,"skso"); // 从第2个位置到第4个位置赋值后的数组
		printArray(str);
		System.out.println(Arrays.hashCode(str)); // 数组的哈希码值
        
		System.out.println(str[0].equals(str[1]));
        String[] str2 = {"hello","wolrd","ol","ok","op"};
        System.out.println(Arrays.equals(str,str2));
        
		System.out.println("------------------元素复制----------------");

		int[] arr = {78,4,3,56,24,9,12,4,35,20};
		
	    System.out.println("copyof复制的结果："+Arrays.toString(expand1(arr)));

		System.out.println("copyofrange复制的结果："+Arrays.toString(expand2(arr)));

		System.out.println("arraycopy复制的结果是："+Arrays.toString(expand3(arr)));
	}
	/**
    打印字符串数组的方法
	**/
	public static void printArray(String[] str)
	{
        for(String str1:str)
		{
			System.out.print(str1+" ");
		}
		System.out.println();
	}

	/**
	Arrays的copyOf()方法
	数组的扩容： 经过重新赋值后的数组长度可以比之前的数组长度长很多
	**/
	public static int[] expand1(int[] arr)
	{
        int[] newArr = new int[arr.length*2]; // 新数组的长度是要复制数组的长度的2倍
		
		newArr = Arrays.copyOf(arr,22);// 将源数组中的10个元素复制到新数组中
        
		return newArr;
	}

	/**
	Arrays的copyOfRange()方法
	**/
	public static int[] expand2(int[] arr)
	{
		int[] newArr = new int[10];

		newArr = Arrays.copyOfRange(arr,3,21);

		return newArr;
	}
   
    /**
	System类的arraycopy()方法
	**/
	public static int[] expand3(int[] arr)
	{
       int[] newArr = new int[arr.length];

	   System.arraycopy(arr,3,newArr,0,arr.length-3);

	   return newArr;
	} 


}