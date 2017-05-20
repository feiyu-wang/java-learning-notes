import java.util.*;
class Demo5 
{
	/**
	  ���������� ������ݣ�2016 �����·�2 
      ����� 2016�������꣬2����29��
	**/
	static Scanner input = new Scanner(System.in);     	
	static int year = 0;
	static int month = 0;
	static int day = 0; // 28 29 30 31 -----month,year
	static boolean isLeapYear = false;
	public static void main(String[] args) 
	{
		while(true)
		{		
			// �ظ����벢���ж����		
            inputYear();
			if(isRightYear(year))
			{
               System.out.println("�������ݲ��Ϸ������������룺");
			   continue;
			}
		    // �ظ����벢���ж��·�
			inputMonth();
			if(isRightMonth(month))
			{
               System.out.println("������·ݲ��Ϸ������������룺");
			   continue;
			}		
			isLeapYear = (year%400==0)||(year%4==0&&year%100!=0); // �ж���������
           
		    System.out.println(year+"����"+(isLeapYear?"����":"ƽ��")+","+month+"����"+getDay(isLeapYear,month)+"��");
			System.out.println("������ĸa,ֹͣ��ѯ�������������");
			String ch = input.next();
			if(ch.equals("a"))
			{
			     System.out.println("bye-bye");
			     break;
			}
		}
	}
    public static void inputYear()
	{
		System.out.println("��������ݣ�");
		year = input.nextInt();
	}

	public static void inputMonth()
	{
        System.out.println("�������·ݣ�");
		month = input.nextInt();
	}
    // �ж�����Ƿ񲻺Ϸ��ķ���
	public static boolean isRightYear(int year)
	{
		if(year<1000||year>9999)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//�ж��·��Ƿ񲻺Ϸ��ķ���
	public static boolean isRightMonth(int month)
	{
		if(month<1||month>12)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
    // 12�µ��������г���			
	public static int getDay(boolean isLeapYear,int month)
	{
            switch(month)
			{
				case 4:
				case 6:
				case 9:
				case 11: day = 30;break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: day = 31;break;
				case 2:  day = isLeapYear?29:28;
			}
            return day;
	}
	

}
