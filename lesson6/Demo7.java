import java.util.*;
class Demo7 
{
	/***
	switch��� keyֵ֧��String�������ݣ�jdk1.6�汾���������ʻش�

	�������ifѡ��ṹ�﷨������
	***/

	public static void main(String[] args) 
	{
		System.out.println("��������Ϸ��ɫ��");
		String role = new Scanner(System.in).next();
		switch(role)
//		{
//			case "�����":System.out.println("���ǣ�������");
//			case "��Ȩ":System.out.println("�ƺ�");break;
//			case "����":System.out.println("��ʥ����һ��!");break;
//			case "�ŷ�":System.out.println("������");break;
//          default:System.out.println("����С��");
	    }
        if(role.equals("�����"))
		{
			System.out.println("���ǣ�����");
			System.out.println("�ƺ�");
		}
		else if(role.equals("��Ȩ"))
		{
			System.out.println("�ƺ�");
		}
	}
}
