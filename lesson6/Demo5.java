import java.util.*;
class Demo5 
{
	public static void main(String[] args) 
	{
		System.out.println("������һ��100���ڷ�����");
		int score = new Scanner(System.in).nextInt();
		if(score>=0&&score<=100)
		{
			if(score>=90)
			{
				System.out.println("����");
			}
			else if(score>=80)
			{
               // ������80 �� 90 ֮����ݶ�
			   System.out.println("����");
			}
			else if(score>=70) 
			{
               System.out.println("��ͨ");
			}
			else if(score>=60)
			{
               System.out.println("����");
			}
			else
			{
			  System.out.println("�ҿƣ������Ŭ��");
			}
		}
		else
		{
			System.out.println("����ķ������Ϸ�");
		}
	}
}
