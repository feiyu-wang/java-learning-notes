import java.util.*;
class Demo2 
{
	/**���鹤���ࣺ ��䣬ת�����ַ�����Ԫ�صĸ���

	1 ��䣺����Ԫ�صĸ�ֵ��ͨ���±�=��ֵ

	  һ���Ը���ͬ��ֵ�����顣

	  fill(��������Ԫ��ֵ);
	  fill(����������ֵ����ʼλ�ã���ֵ��ĩβλ�ã�Ԫ��ֵ)��

	 2 ת�����ַ�����

	   �������е����е�Ԫ�����ӳ�һ�����ַ���ӡ���

	   toString(������);

	 3 Ԫ�صĸ��ƣ�

	   Arrays�����ิ��   copyOf(���Ƶ������������Ƶ�Ԫ�ظ���);

	                      copyOfRange(���Ƶ�������,���Ƶ���ʼλ�ã����Ƶ��յ�λ��);

						  1 ����Ԫ�ظ������Գ���ԭ�����Ԫ�ظ���

						  2 ���ƺ��������ĳ����ɷ����и��Ƹ��������������������������鿪�ٵ��ڴ�ռ����

	   System��           arraycopy(Դ���飬Դ���鸴�Ƶ���ʼλ�ã�Ŀ�����飬Ŀ���������ʼλ�ã����Ƹ���)
                          
						  1  ���ܳ���ԭ�����������

						  2  Ŀ������ĳ��Ȳ���С��Ҫ��ֵ��Ԫ�صĸ���
	**/
	public static void main(String[] args) 
	{
		System.out.println("--------------Ԫ�����-------------------");
		String[] str = new String[6]; // ������
		// ���÷�������ӡ������
		printArray(str); 
		// ͨ��ת���ַ����ķ�����ӡ����
		System.out.println(Arrays.toString(str));
        Arrays.fill(str,"hello"); // һ����ȫ����ֵ�������
        printArray(str);
		Arrays.fill(str,2,5,"skso"); // �ӵ�2��λ�õ���4��λ�ø�ֵ�������
		printArray(str);
		System.out.println(Arrays.hashCode(str)); // ����Ĺ�ϣ��ֵ
        
		System.out.println(str[0].equals(str[1]));
        String[] str2 = {"hello","wolrd","ol","ok","op"};
        System.out.println(Arrays.equals(str,str2));
        
		System.out.println("------------------Ԫ�ظ���----------------");

		int[] arr = {78,4,3,56,24,9,12,4,35,20};
		
	    System.out.println("copyof���ƵĽ����"+Arrays.toString(expand1(arr)));

		System.out.println("copyofrange���ƵĽ����"+Arrays.toString(expand2(arr)));

		System.out.println("arraycopy���ƵĽ���ǣ�"+Arrays.toString(expand3(arr)));
	}
	/**
    ��ӡ�ַ�������ķ���
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
	Arrays��copyOf()����
	��������ݣ� �������¸�ֵ������鳤�ȿ��Ա�֮ǰ�����鳤�ȳ��ܶ�
	**/
	public static int[] expand1(int[] arr)
	{
        int[] newArr = new int[arr.length*2]; // ������ĳ�����Ҫ��������ĳ��ȵ�2��
		
		newArr = Arrays.copyOf(arr,22);// ��Դ�����е�10��Ԫ�ظ��Ƶ���������
        
		return newArr;
	}

	/**
	Arrays��copyOfRange()����
	**/
	public static int[] expand2(int[] arr)
	{
		int[] newArr = new int[10];

		newArr = Arrays.copyOfRange(arr,3,21);

		return newArr;
	}
   
    /**
	System���arraycopy()����
	**/
	public static int[] expand3(int[] arr)
	{
       int[] newArr = new int[arr.length];

	   System.arraycopy(arr,3,newArr,0,arr.length-3);

	   return newArr;
	} 


}