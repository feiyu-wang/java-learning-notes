import java.util.*;
class Demo2 
{
	/**
    ����Ԫ�ز����ķ���----���鹤����-----Arrays---java.util.Arrays

	����ֵ������

	1 �����Сֵ---һ�����ݵ����ֵ������Сֵ
    
	2 �����鰴����������-----��0���±�-��Сֵ����length-1���±�--���ֵ
	
	**/

    static int max ;
	static int min;
	static int sum;
	
	public static void main(String[] args) 
	{
		int[] arr = {3,5,9,264,2,46,23,100,76};
        
		getMax(arr); // ��������е����ֵ����Сֵ����͵Ľ��

		print(); // ��������õĽ����ӡ���

	    //��ԭ�����������ʹ�����鹤����
        
		Arrays.sort(arr); // sort()����---������������

        printArray(arr);// ��ӡ��������֮�������

		System.out.println("�����е����ֵ�ǣ�"+arr[arr.length-1]);
		System.out.println("�����е���Сֵ�ǣ�"+arr[0]); 	
	}

	/**
	�Զ���һ�������������ֵ,����Сֵ
	**/
	public static void getMax(int[] arr)
	{
         max = arr[0]; //�����һ��Ԫ�ؾ������ֵ
		 min = arr[0];
		 // �����ֵ�����������е�Ԫ�����Ƚ�
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
	�Զ���һ��������ר�Ÿ����ӡ
	**/
	public static void print()
	{
		System.out.println("��������ֵ�ǣ�"+max);
		System.out.println("�������Сֵ�ǣ�"+min);
		System.out.println("��������ֵ�ǣ�"+sum);
	}

	/**
	��ӡ����
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
