import java.util.*;
class Demo4 
{
	/**
	 if-else-if
	***/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("��������ɰ��ţ�");
        int num = input.nextInt();
		if(num>0)
		{
            if(num==1)
			{
				System.out.println("���ʣ�����ԳΪʲô��ΪԳ�ࣿ");
			}
			else if(num==2)
			{
               System.out.println("���ʣ���ı��ص�ַ�ǣ�");
			}
			else if(num==3)
			{
               System.out.println("�ڶ����׷�ʣ����ԭ���ĵ�ַ�ǣ�");
			}
		}
		else
		{
			System.out.println("û�д�ѡ��");
		}
	} 
}
