import java.util.*;
class Demo1 
{
	/**
	�Զ���һ���ַ������飬1���ַ��������г�������ַ���Ԫ��

	2 ����ַ����е����е���ĸ������ĸ��˳������֮���ӡ���

	3 ��ѯ�����а�����ĸb���ַ����������е�λ��
	**/
	static String max;
	public static void main(String[] args) 
	{
		String[] str = {"ahsiahsia","asa","ab","a","ashiahsiahsiahas"};

		String longMax = getLongMax(str);
		System.out.println("�ַ��������г������Ԫ���ǣ�"+longMax);

		String sortStr = sortString(longMax);
		System.out.println("����������ַ��������Ľ���ǣ�"+sortStr);

		String containB = getB(str);
		System.out.println("����b�ĵ����ǣ�"+containB);

		Arrays.sort(str); // �����ַ���������ֵ�˳������
        printArray(str);

		int index = Arrays.binarySearch(str,containB);
		System.out.println("��ѯ�İ���B�ĵ����������еĵ�"+index+"��λ����");


	}
	/**
	�Զ��巽�����ַ������������Ԫ��
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
	����ȡ�����ַ����������Ԫ�����е���ĸ������ĸ������
	**/
	public static String sortString(String str)
	{
        // 1 ���ַ�����ֳɵ�����ĸ
		//char[] ch = str.toCharArray();
		byte[] buf = str.getBytes();
		// 2 ������ĸ��˳�����о�����������
		// ��һ��д����Arrays.sort(buf);
		// �ڶ���д����ð������ ���ڵ�����Ԫ�����Ƚ�

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

        // ������д���� ѡ�����򣺵�һ��Ԫ�����������е�Ԫ�ؽ��бȽ�
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

		// 3 �����кõ���ĸ�����µ��ַ���
		return new String(buf);
	}

	/**
    ����b���ַ���
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
}
