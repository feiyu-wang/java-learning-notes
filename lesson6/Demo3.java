import java.util.*;
class Demo3 
{
	/****
	 ����һ����λ�����ж������껹��ƽ��  
	****/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
	   // �ж���������껹��ƽ�������
	   //��һ������400����
	   //�ڶ���: ��4�������Ҳ��ܱ�100����
	   System.out.println("��������ݣ�");
	   int year = input.nextInt();
	   if(year>999&&year<=9999)
	   {
           if(year%400==0||(year%4==0&&year%100!=0))
		   {
			   System.out.println(year+"������");
		   }
		   else
		   {
			   System.out.println(year+"��ƽ��");
		   }
	   }
	   else
	   {
		   System.out.println("�������ݲ��Ϸ�");
	   }
	}
}
