class Demo4 
{
	/**
	数组排序：一组进行排序，排序规则，由小到大--升序

	由大到小---降序

    排序方法一： 官方sort()方法。

	优点：java工具类提供的排序方法是效率最高

	缺点： 只能升序

	排序方法二：经典冒泡排序（面试高频点）
	
    冒泡排序算法：降序排列 ---前面位置的数大于后面位数上的数

    原理：根据排序规则，将相邻的俩个元素做比较，如果符合排序规则，
	不许用改变元素的位置，如果不符合排序规则，将相连俩个元素的位置互换。

	冒泡排序的优化版：不会再有元素的交换的时候，也就是说顺序已经排好的时候，不要

	不会重复打印排好的序的数组。解决思路：在元素的发生交换的地方加一个标识符
   
    排序方法三： 选择排序

	算法原理：第一个元素与其他所有的元素做比较，符合排序规则，交换位置

	**/
	public static void main(String[] args) 
	{
		int[] arr = {3,1,2,7,5,2198,34,78,99,121,0,56,2,45,23,756,49,99,20,66,88,188,8};  

        System.out.println("===========普通冒泡排序==============");
        long start =  System.currentTimeMillis();// 冒泡排序的开始时间
        bubbleSort(arr);
		long end = System.currentTimeMillis();// 冒泡排序的结束时间
		System.out.println("普通冒泡排序耗时："+(end-start)+"ms");  
		
		System.out.println("=========优化版冒泡排序=============");
        start = System.currentTimeMillis();// 优化冒泡排序的开始时间
	   	arr = new int[]{3,1,2,7,5,2198,34,78,99,121,0,56,2,45,23,756,49,99,20,66,88,188,8};  
        bubbleSuperSort(arr);
        end = System.currentTimeMillis(); // 优化冒泡排序的结束时间
	    System.out.println("优化冒泡排序耗时："+(end-start)+"ms");

        arr = new int[]{3,1,2,7,5,2198,34,78,99,121,0,56,2,45,23,756,49,99,20,66,88,188,8};  
		System.out.println("=============选择排序==============");
		start = System.currentTimeMillis();// 选择排序的开始时间
		selectSort(arr);
		end = System.currentTimeMillis(); // 选择排序的结束时间
		System.out.println("选择排序耗时："+(end-start)+"ms");
    }
    
	/**
	冒泡排序
	**/
	public static void  bubbleSort(int[] arr)
	{
		// 3 1 2 7 5 
		//第一次比较：  3 2 7 5 1   

		//第二次比较：  3 7 5 2 1 

		//第三次比较：  7 5 3 2 1 
      
		//最多比较4次出来结果
        for(int i = 0; i<arr.length-1;i++)//得到最后的排序结果，最多执行几次比较
		{
			for(int j = 0;j<arr.length-i-1;j++)
			{
               //内循环：每一次比较，先去判断排序规则，如果满足，元素交换位置 
               if(arr[j]<arr[j+1])
			   {
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = temp;
			   }
			}
			for(int m = 0; m<arr.length;m++)
			{
				System.out.print(arr[m]+" ");
			}
			System.out.println();
		}
	}

	/**
　　优化版冒泡
	**/
    public static void bubbleSuperSort(int[] arr)
	{
		// 是否进行元素交换的标识符。
		boolean flag; // 如果排序过程中不发生交换那么就是true,发生交换就是false
        for(int i = 0; i<arr.length-1;i++)
		{
			flag = true; // 第一次比较，但是没有进入判断，所以没有发生交换
			for(int j = 0; j<arr.length-i-1;j++)
			{
               if(arr[j]>arr[j+1])
			   {
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = temp;
				   flag = false;
			   }
			}
			if(flag)
			{
			   //比较之后，不再有值得交换，那么就让外循环停止 
               break;
			}
			for(int m = 0;m<arr.length;m++)
			{
				System.out.print(arr[m]+" ");
			}
			System.out.println();
		}
	}

	/**
	选择排序
	**/
	public static void selectSort(int[] arr)
	{
        // 3,1,2,7,5---选择排序---降序
		
		// 第 i ---比较次数   j ---  比较元素

		// i = 0  7 1 2 3 5  j = 12017/5/17

		// i = 1  7 5 1 2 3  j = 2 

		// i = 2  7 5 3 1 2  j = 3

		// i = 3  7 5 3 2 1  j = 4
        // 比较次数
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
			for(int m = 0; m<=arr.length-1;m++)
			{
				System.out.print(arr[m]+" ");
			}
			System.out.println();
		}	
	}
}
