import java.util.*;
class Demo3 
{
	/**
	�Ӽ��������ַ������ַ������ȴ�С�����Ƚ�
	**/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		  //����ַ����ĳ�������
          int[] arr_int =  getInputInt(getInputStr());
		  // �ַ����ĳ���������С��������
		  Arrays.sort(arr_int);
		  // ��ӡ����������
          printArray(arr_int);
	}
	/**
	*�Ӽ���ѭ�������ַ���
	**/
	public static String[] getInputStr()
	{
		String[] arr = new String[5];
		// ѭ������5��
		for(int i = 0; i<5;i++)
		{
		   System.out.println("�������ַ�����");
           arr[i] = input.next();
		   System.out.println(arr[i]);
		}
		return arr;
	}

	/**
	����ַ�������ĳ�������
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
	��ӡ��������
	**/
	public static void printArray(int[] arr)
	{
       for(int i: arr)
	   {
		   System.out.print(i+" ");
	   }
	}

	
}
