class Demo1 
{
	static int max = 0;
	public static void main(String[] args) 
	{
	   /**
	   ��ӡ10�е��������ε��㷨
	   ***/
	   printTrigle(10); // �����ĵ���
	   /**
	   ��ӡ8�е���������
	   **/
	   printTrigle(8);
	   printTrigle(6);
	   
	   // main()�е���printRectangle()����
//	   printRectangle(10,5);
//	   printRectangle(7,9);
       String name = "����С"; // ʵ��;
	   System.out.println("code="+ getCode(name));
	   System.out.println("max="+ getMax(8,39,59));	  
	}
	/**
	�����Ķ���: printTrigle()��ӡ�̶������ĵ���������
	**/
    static void printTrigle(int row)
	{
        for(int i= 0; i<row;i++)
	    {
		   for(int j =0; j<row-i-1;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int j =0;j<2*i+1;j++)
		   {
			   System.out.print("��");
		   }
		   System.out.println();
	    }
		// �ڴ�ӡ�����εķ������е��ô�ӡ���εķ���
		printRectangle(10,3);
		printRectangle(6,8);
	}
    /***
	��ӡ�̶��У��̶��еľ��η���
	***/
	static void printRectangle(int row,int col)
	{
		for(int i= 0; i<row;i++)
		{
			for(int j = 0; j<col;j++)
			{
				System.out.print("��");
			}
			System.out.println();
		}
	}

	/**
	�Զ��巽�������巵���ַ�����ÿ���ַ������ı���
	**/
	public static int getCode(String name1) // �β�
	{
        char[] ch = name1.toCharArray();
        int code1 = ch[0];
		int code2 = ch[1];
		int code3 = ch[2];
		if(name1.length()==1)
		{
           return code1;
		}
		else if(name1.length()==2)
 		{
           return code2;
		}
		else
		{
		   return code3;
		}
	}   
}
