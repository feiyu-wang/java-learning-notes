import java.util.*;
class Demo4 
{
	/**
	��������һ����λ�������������ַ�������
	�ڿ���̨��ӡ�����λ���֣�ʮλ���֣���λ������
	**/

	public static void main(String[] args) 
	{
		// ��һ��д���� �����������һ������
		Scanner input = new Scanner(System.in);	
		System.out.println("������һ����λ������");
		System.out.println("���������㷽�����ţ�");
		boolean flag = input.nextBoolean();
        if(flag)
		{
			int num = input.nextInt(); // 234 
			// ��λ --------------2  234/100 = 2 
			// ʮλ --------------3  234%100/10 = 3
			// ��λ --------------4  234%10 = 4 			
			int num1 = num/100; // 2

			int num2 = num%100/10; // 3

			int num3 = num%10;// 4
			
			System.out.println("num�İ�λ�ǣ�"+num1);
			System.out.println("num��ʮλ�ǣ�"+num2);
			System.out.println("num�ĸ�λ�ǣ�"+num3);
			
		}
		else
		{
			// �ڶ���д���� �����������һ���ַ��� ��234��
			// ֻ��String���͵����ݲ���charAt()����
            String str_num = input.next(); // "234"
            // һ���Խ��ַ����е����е���ĸ��ȡ�� ��2�� ��3�� ��4��
			char[] ch_num = str_num.toCharArray(); // һ���ַ�
			//��λ����ĸ
			//char ch_num1 = str_num.charAt(0);
			// ʮλ����ĸ
			//char ch_num2 = str_num.charAt(1);
			// ��λ����ĸ
            //char ch_num3 = str_num.charAt(2);
			System.out.println("num�İ�λ���ǣ�"+ch_num[0]+"  ʮλ����"+ch_num[1]+" ��λ���ǣ�"+ch_num[2]);
		}
	}
}
