class Demo3 
{
	/**
	��ӡ10��10������
	��ӡ9*9�˷���
	1*1 = 1
	1*2 = 2 2*2 = 4
    1*3 = 3 2*3 = 6 3*3 = 9
	1*4 = 4 2*4 = 8 3*4 = 12 4*4 = 16

	**/
	public static void main(String[] args) 
	{
		/***
        ��
		���
		����
		�����
        ������
		�����
		����
		���
		��
		***/
		for(int j = 0; j<10;j++)//��ѭ��������ѭ����ִ�д���
		{
			if(j<5)
			{
				for(int i = 0;i<j;i++)
				{
					System.out.print("��");
				}
			}
			else
			{
				for(int i = j;i<10;i++)
				{
					System.out.print("��");
				}
			}
			System.out.println();
		}
	}
}
