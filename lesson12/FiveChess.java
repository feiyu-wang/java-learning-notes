class FiveChess 
{
	/**
	��������Ŀʵս

	1 ������ ----16��16�е��ַ�������

	2 ������������к�----�ı��0�е�0�еĶ�ά����Ԫ�صĸ�ֵ

	  1 ~9 A ~ F 

	**/
	static char[][] boards = new char[16][16];
	static int rows = boards.length;// ���̵�����---16
	static int cols = boards[0].length; // ���̵�����---16
	public static void main(String[] ar1gs) 
	{
		System.out.println("============����������=============");
		System.out.println();
		System.out.println();
		drawBoards();
		printBoards();
	}
	/**
	����ά���鸳һ����ͬ��ֵ��������
	// +  �������뷨 v9 ---��ҳ�����һҳ��----�Ʊ��----ռ������ĸ��λ��
	**/
	public static void drawBoards()
	{
		char ch1 = '1'; // �����ĳ�ʼֵ
		for(int i = 0; i<rows;i++)
		{
			for(int j = 0; j<cols;j++)
			{	
				if(i==0&&j>0) // ��0�в��Ҳ��ǵ�0��
				{
					boards[i][j] = ch1;
					ch1++;//����������1ת�䵽����9�󣬴ӡ�������ת����ĸA 
					if(ch1=='9'+1)
					{
						ch1 = 'A';
					}
				}
				else
				{
				    boards[i][j] = '��';
			    }
			}
		}
	}
    /**
    ���������̴�ӡ�ķ���
	**/
	public static void printBoards()
	{
		for(int i = 0; i<rows;i++)
		{
			for(int j = 0; j<cols;j++)
			{
				if(i==0&&j>0)
				{
				  System.out.print(boards[i][j]+" ");
				}
				else
				{
				  System.out.print(boards[i][j]);
				}
			}
			System.out.println();
		}
	}
}

