class Demo9 
{
	/***
	ѭ���ṹ�� 1+2+3+4+......+100 = 
	***/
	public static void main(String[] args) 
	{
		/**
        ѭ���� �� +

		ѭ����ʼֵ :i = 1    sum = 1  

		            i = 2    sum = sum(i=1)+2

					i = 3    sum = sum(i=2)+3 


					i = 99   sum = sum(i=98)+99
					
					i = 100  sum = sum(i=99)+100
        ѭ���ı仯��i++;
		ѭ���Ľ�����i=100		
		**/
		/**
		whileѭ��
		**/

        int i = 1;//�������ĳ�ʼֵ
		int sum = 0; // ��͵ĳ�ʼֵ
		while(i<=100)
		{
            sum = sum + i; // i = 1  sum = 1
            i++;      // i = 2 sum = 1+2	
			System.out.println("1+2+3+......+100="+sum);
		}

		/**
		do-while
		**/
        int x = -20;
		do
	    {
           System.out.println("x++="+x++);
		}
		while (x>0);
		
	}
}
