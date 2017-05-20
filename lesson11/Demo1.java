import java.util.*;
class Demo1 
{
	/**
	自定义一个字符串数组，1求字符串数组中长度最长的字符串元素

	2 最长的字符串中的所有的字母按照字母表顺序排列之后打印输出

	3 查询数组中包含字母b的字符串在数组中的位置
	**/
	static String max;
	public static void main(String[] args) 
	{
		String[] str = {"ahsiahsia","asa","ab","a","ashiahsiahsiahas"};

		String longMax = getLongMax(str);
		System.out.println("字符串数组中长度最长的元素是："+longMax);

		String sortStr = sortString(longMax);
		System.out.println("将数组中最长字符串排序后的结果是："+sortStr);

		String containB = getB(str);
		System.out.println("包含b的单词是："+containB);

		Arrays.sort(str); // 根据字符串数组的字典顺序排列
        printArray(str);

		int index = Arrays.binarySearch(str,containB);
		System.out.println("查询的包含B的单词在数组中的第"+index+"个位置上");


	}
	/**
	自定义方法求字符串数组中最长的元素
	**/
	public static String getLongMax(String[] arr)
	{
		max = arr[0];
        for(String str:arr)
		{
            if(max.length()<str.length())
			{
				max = str;
			}
		}
		return max;
	}

	/**
	将获取到的字符串长度最长的元素所有的字母按照字母表排序
	**/
	public static String sortString(String str)
	{
        // 1 将字符串拆分成单个字母
		//char[] ch = str.toCharArray();
		byte[] buf = str.getBytes();
		// 2 按照字母表顺序排列就是升序排列
		// 第一种写法：Arrays.sort(buf);
		// 第二种写法：冒泡排序： 相邻的俩个元素做比较

//		for(int i = 0; i<buf.length-1;i++)
//		{
//			for(int j = 0;j<buf.length-i-1;j++)
//			{
//				if(buf[j]>buf[j+1])
//				{
//                 byte temp = buf[j];
//				   buf[j] = buf[j+1];
//				   buf[j+1] = temp;
//				}
//			}
//		}

        // 第三种写法： 选择排序：第一个元素与其他所有的元素进行比较
        for(int i = 0;i<buf.length-1;i++)
		{
			for(int j = i+1;j<=buf.length-1;j++)
			{
				if(buf[i]>buf[j])
				{
                   byte temp = buf[i];
				   buf[i] = buf[j];
			       buf[j] = temp;
				}
			}
		}

		// 3 将排列好的字母生成新的字符串
		return new String(buf);
	}

	/**
    包含b的字符串
	**/
	public static String getB(String[] str)
	{
		String con_str = "";
        for(String str1 : str)
		{
			if(str1.contains("b"))
			{
				con_str = str1;
			}		
		}
	    return con_str;
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
}
