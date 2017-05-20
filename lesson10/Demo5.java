import java.util.*;
class Demo5 
{
	/**
	����Ĳ�ѯ��
	��һ�������в�ѯ����ĳһ��Ԫ�ء�
	���鹤����---Arrays-----���ַ���ѯ

	1  �������ж��ַ���ѯ---binarySearch(��ѯ��������,��ѯ��Ԫ��)
	���صĽ���ǲ�ѯ��Ԫ���������е��±꣬��һ��intֵ;
	ǰ������������Ԫ�ر�������������
    
	2  ���ַ���ѯ���㷨�� 

	   �㷨ԭ�� �������ܴ��ʱ���Ƚ���һ������һ��Ϊ����

	   ��ѯԪ���Ƿ���ǰ�벿�֣������ѯ��ǰ�벿�������У���ô��벿�����ݾͲ����м���

	   �ٴν����ݷֳ������֣���ѯԪ���Ƿ���ǰ����ߺ�벿�֡����ֶ���Ҫһֱ��
	   
	   Ԫ�ص�λ��Ϊֹ��

	**/
	public static void main(String[] args) 
	{
		int[] arr = {3,45,6,90,2,7,9};
		Arrays.sort(arr);
		printArray(arr);
        int index = Arrays.binarySearch(arr,9);
		System.out.println("��ѯ��Ԫ���������е�"+index+"��λ����");
        int index1 = searchTwo(arr,10);
		System.out.println("��ѯ��Ԫ���������е�"+index1+"��λ����");
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
	}
	/**
	���ַ����㷨

	@param int[] arr Ҫ��ѯ������
	@param int key   Ҫ��ѯ��Ԫ��
	**/
	public static int searchTwo(int[] arr,int key)
	{
        //1 Ҫ��ѯ������м�Ԫ��
		// low -----�������±�����λ
		// high ----�������±�����λ
		int low = 0,high = arr.length-1;
        
	    //2 3 6 7 9 45 90 
		// index ----Ҫ��ѯԪ�ص��±�
		int index = 0;
       
		while(low<=high)
		{
            index = (low+high)/2; 
			if(key<arr[index])
			{
                high = index-1; //����ѯ������С���м�λ�ã�ֻ��Ҫ��ǰ�벿�֣����λ��Ϊ�м�λ��-1
			}
			else if(key>arr[index])
			{
				//����ѯ�����ݴ����м�λ�ã���Ҫ��ѯ��벿�ֵ����ݣ����λ��Ϊ�м�λ��+1
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
