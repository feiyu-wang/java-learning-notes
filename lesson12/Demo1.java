import java.util.*;
class Demo1 
{
	/**
	�Զ�������{1,2,3,4,5}

	���մ�ӡ���{1,2,3,4,5,5,4,3,2,1}

	�������в���һ��Ԫ��

	��ά����ĶԽ������
	**/
	public static void main(String[] args) 
	{
       int[] arr = {1,2,3,4,5};
	   System.out.print(Arrays.toString(expand(arr)));
	   //printArray(expand(arr));

	   System.out.println();
	   System.out.println(Arrays.toString(insert(arr,2)));

	   int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
	   System.out.println("��ά����Խ�����͵Ľ���ǣ�"+getSum(arr1));
	}
	/**
	��������
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
	�������
	**/
	public static void printArray(int[] arr)
	{
       for(int i = arr.length-1;i>=0;i--)
	   {
		   System.out.print(arr[i]+" ");
	   }	  
	}
	/**
	��������
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
	����һ��Ԫ�أ���ӡ����Ԫ�غ������
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
	��ά����Խ������

	1 2 3

	4 5 6

	7 8 9  
	
	1   i=j  2 i+j=2

	**/
	public static int getSum(int[][] arr)
	{
		int sum = 0; // �Խ���Ԫ��֮��
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
