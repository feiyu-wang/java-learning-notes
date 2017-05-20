class Demo1 
{
	/**
	 数组的复习练习1
	**/
	public static void main(String[] args) 
	{
		 // 声明-定义-初始化		 
		 int[] arr = {10,65,3,5,7,9};
		 printArray(arr);
		 arr = new int[]{2,5,4};
         printArray(arr);
		 int[] arr1 = new int[]{4,3,89,2};        
		 // 第一种：空指针异常----NullPointerException
		 String str = "hello,woerld,ashasjaoi,hehdi";
		 System.out.println("字符串的长度"+str.length());
		 //第二种： 数组下标越界异常----ArraysIndexOutOfBoundsException
         String[] strArr ;
		 strArr = str.split(","); 
		 printStrArray(strArr);// 打印分割后的字符串数组		 
		 System.out.println("字符串数组的长度"+strArr.length);		 
		 System.out.println(strArr[3]);
		 char[] ch = new char[5];
		 ch[0] = '3';
		 ch[1] = '4';
		 System.out.println(ch[4]);		 
	}

	/**
	定义一个方法，将数组中的元素都遍历取出
	**/
	public static void  printArray(int[] arr)
	{
        for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	/**
	定义一个方法。将字符串数组中的元素都取出
	**/
	public static void printStrArray(String[] string)
	{
		for(String str1 : string)
		{
			System.out.print(str1+" ");
		}
		System.out.println();
	}

}
