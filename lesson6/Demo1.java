import java.util.*;
class Demo1 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println("a="+a);
        setValue(30); // main()��������setValue()
		a++;
		System.out.println("a="+a);
		System.out.println("������һ������0������");
		int num = input.nextInt();
		if(num>0)
		{
			if(num%2==0)
			{
				System.out.println("�������ż��");
			}
			if(num>20)
			{
				System.out.println("��������Ǵ���20����");
			}
			else
			{
				System.out.println("���������С��20����");
			}	
		}
		else
		{
            System.out.println("��������ݲ��Ϸ�");
		}
		for(int i = 0; i<10;i++)
		{
			System.out.println("�˴��Ĵ���ִ��10��");
		}
	}
	
	public static void setValue(int m)
	{
        m = 20;
	}
}
