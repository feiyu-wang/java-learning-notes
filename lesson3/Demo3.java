class Demo3 
{
	public static void main(String[] args) 
	{		
		char ch = 109;  // ����char���͵ı�����ֵΪ109
		byte b = (byte)ch ; // ��char���͵����ݷ���һ��byte���͵ı�����
		System.out.println("ch = "+ch);


        short s = 10000;
	    ch  = (char)s;

		//System.out.println("s = "+ s);

		byte b1 = 56;

        int i = ch; // ��ch���͵�����ת����int���͵�����

        int m = s;  // ��short���͵�����ת����int���͵�����

		int n = b1;  // ��byte���͵�����ת����int���͵�����

		System.out.println("i ="+i);
		System.out.println("m ="+m);
		System.out.println("n ="+n);

		int j = 1208989890;

		float f = j; // ��int���͵�����ת����float���͵�����

		System.out.println("f = "+ f);


        int value1 = (int)f; // ��float���͵����ݷŵ�int���͵�����

		System.out.println("value1 = "+ value1);

		long l = j;

		System.out.println("l ="+ l);
	}
}
