class Demo1 
{
	/***
    ���̿��Ƹ�ϰ
	****/
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		if(a>b)
		{
			System.out.println("a����b");
		}
		else 
		{
			System.out.println("aС��b");
		}
		// �򵥷�֧�ṹ��ѡ������ֻ��һ��------��������� ? : (��Ŀ�����)
		System.out.println((a>b)?"a����b":"aС��b");

		//System.out.println(null);
        
		//System.out.println((a>b)?System.out.println("a����b"):System.out.println("aС��b"));

        //�����������?ǰ��д�ж����� �������Ǽ򵥵ı������������

		System.out.println(a>b?a:b);

		System.out.println("a��b����ż���ǣ�"+((a%2==0&&b%2==0)?"ż��":"����"));


		int m = 4;

		getValue(m);

   
	}

	public static int getValue(int h)
	{
          int j = 0;
		  switch(h)
		  {
			  case 1:j++;
			  case 2:j++;
			  case 3:j++;
			  case 4:j++;
			  case 5:j++;
			  case 6:j++;break;
			  case 7:j++;
			  case 8:j++;
			  case 9:j++;
			  default:++j;
		  }
		  return h+j;
	}

}
