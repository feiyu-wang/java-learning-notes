class Demo1 
{
	/***
     ��ϰ��ϰ1
	***/
	public static void main(String[] args) 
	{
		byte b  = 120; // ������byte�����ݷ�Χ
        Short s = new Short((short)10000); // ����short���͵����� short s = 10000;
		char ch = (char)b; // ��byte���͵ı���ǿתΪchar���͵ı���

		//char�������ݵĶ���
		char ch1 = 'm';
		int ch1_code = ch1;
		System.out.println("ch1��askii���ǣ�"+ch1_code);// 109
		char ch2 = 122;
		char ch3 = '\u0031'; // �ַ����ݵ�ʮ�����Ƶı�ʾ��ʽ
		System.out.println("ch1 ="+ch1);
		System.out.println("ch2 ="+ch2);
		System.out.println("ch3 ="+ch3);
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("ch="+ch);

		int  i = 23000; // ����int���͵ı���

		s = (short)i; // ��int���͵ı���ǿתΪshort���͵ı�����Ҫǿת��������ǿת���������͵ķ�Χ�ڣ����ᷢ��ֵ����ʧ
        
		// ����ֵ����ʧ�����ǿת��д����Ĺ������ǽ�ֹ��

		System.out.println("i="+i);

		System.out.println("s="+s);

		ch = (char)(ch + ch1) ; // �ᷢ�����ȵ���ʧ byte,char,short��������������л��Զ�������int���͵�����
        
		int ch_code = ch;
		System.out.println("ch_code="+ch_code);
		ch += ch1; // �Լ����㲻�ᷢ��������ʧ���Ⱥ��ұ߲���һ��������ʽ����ô�����Զ�������		
		


	}
}
