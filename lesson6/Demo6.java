import java.util.*;
class Demo6
{
	/**
	 switchѡ���֧��֧�� char byte int short
	 case������������ͱ�����keyֵ����������һ�»��ߵ���keyֵ�þ���
	**/
	public static void main(String[] args) 
	{
		// �����о���ֵ�ñ���
        final int NUM = 4;//���ձ���
		final int key = 2; // keyֵ
		final int NUM_1 = 2;
		System.out.println("������һ������0������");
		short num = new Scanner(System.in).nextShort();
		if(num>0)
		{
			switch(num)
			{
				case 1: System.out.println("one");break;
				case key: System.out.println("two");break;
				case 3: System.out.println("three");break;
				case key+NUM_1: System.out.println("four");break;
				case 5: System.out.println("five");break;
				case 6: System.out.println("six");break;
				case 7: System.out.println("seven");break;
				case 'a':System.out.println("one hundred one");break;
				case 12019:System.out.println("over");break;
				default:System.out.println("default");
			}
		}
		else
		{
		   System.out.println("��������ݲ��Ϸ�");
		}

		System.out.println("======================");
		char ch = '-';
		long l = 1928092839087L;// switch��֧��long���͵�����
		switch(ch)
		{
			case '-':System.out.println(NUM-NUM_1);break;
			case '+':System.out.println(NUM+NUM_1);break;
			case '*':System.out.println(NUM*NUM_1);break;
			case '/':System.out.println(NUM/NUM_1);break;
			default:System.out.println("��������");
		}
	}


}
