class Demo1 
{
	/**
	 ����ĸ�ϰ��ϰ1
	**/
	public static void main(String[] args) 
	{
		 // ����-����-��ʼ��		 
		 int[] arr = {10,65,3,5,7,9};
		 printArray(arr);
		 arr = new int[]{2,5,4};
         printArray(arr);
		 int[] arr1 = new int[]{4,3,89,2};        
		 // ��һ�֣���ָ���쳣----NullPointerException
		 String str = "hello,woerld,ashasjaoi,hehdi";
		 System.out.println("�ַ����ĳ���"+str.length());
		 //�ڶ��֣� �����±�Խ���쳣----ArraysIndexOutOfBoundsException
         String[] strArr ;
		 strArr = str.split(","); 
		 printStrArray(strArr);// ��ӡ�ָ����ַ�������		 
		 System.out.println("�ַ�������ĳ���"+strArr.length);		 
		 System.out.println(strArr[3]);
		 char[] ch = new char[5];
		 ch[0] = '3';
		 ch[1] = '4';
		 System.out.println(ch[4]);		 
	}

	/**
	����һ���������������е�Ԫ�ض�����ȡ��
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
	����һ�����������ַ��������е�Ԫ�ض�ȡ��
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
