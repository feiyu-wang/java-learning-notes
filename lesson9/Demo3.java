import java.util.*;
class Demo3 
{
	/**��������ʵ�����ּ���**/
	static Scanner  input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("�������û���");
		String username = input.next();
		System.out.println("���������ģ�");
		String secret = input.next();
		char ch_s = secret.charAt(0);
		String jiami = entrption(username,ch_s);
		System.out.println("���ܵ��û����������ǣ�"+jiami);
        String jiemi = entrption(jiami,ch_s);
		System.out.println("���ܺ���û����������ǣ�"+jiemi);
		System.out.println("���������룺");
		String password = input.next();
	}
	/**�Զ�����ܵ��㷨---ͬʱҲ�ǽ����㷨**/
	public static String entrption(String username,char secret)
	{
       // ����---ԭ���е����е���ĸ���������������
	   // ����---���ܺ�Ľ�����������������
	   // ��һ�֣� 1 ��ԭ���ַ�����ֳɵ�����ĸ
	   char[] ch = username.toCharArray();
	   for(int i = 0; i<=ch.length-1;i++)
	   {
		   ch[i] = (char)(ch[i]^secret);		  
	   }
	   // 2 �����ܺ����ĸ���ӳɼ��ܵ��ַ����ڴ�
	   String en_username = new String(ch,0,ch.length);
      return en_username;
	   // �ڶ���д������ԭ���ַ�����ֳ�byte�ֽ�����

	   byte[] buf = username.getBytes();
       
	   for(int i = 0; i<buf.length;i++)
	   {
           buf[i] = (byte)(buf[i]^secret);
	   }

	   return new String(buf);
	}
}
