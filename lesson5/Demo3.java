import java.util.*;
class Demo3 
{
	/***
	  �û��������¼����
	***/
	// ����һ��ȫ�ֱ������ı�ɨ����
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("�������û���");
		// ������û������������͵�����
		int username = input.nextInt();
        // �û������ܵ����ݾ��ǡ�a��
		//char[] ch_user = username.toCharArray(); // a b f g 
		System.out.println("����������");
        String secret = input.next();
		char ch_secret = secret.charAt(0); // a
        // �û������ܹ���------���ܵ�����------int 

		int content = username^ch_secret;
		System.out.println("����ǰ���û���ԭ���ǣ�"+username);
		System.out.println("���ܺ���û��������ǣ�"+content);

		// �û������ܹ���-----����---
		int  con_jiemi = ch_secret^content;
		System.out.println("���ܺ���û��������ǣ�"+con_jiemi);

		// ����ļ��ܹ���
		System.out.println("���������룺");		
		byte pass = input.nextByte();
		//��������м��ܣ�������9 

		byte pa_jiami = (byte)(pass^9);
		byte pa_jiemi = (byte)(pa_jiami^9);

		System.out.println("����ǰ������ԭ���ǣ�"+pass);
		System.out.println("���ܺ�����������ǣ�"+pa_jiami);
		System.out.println("���ܺ������ԭ���ǣ�"+pa_jiemi);

	}
}
