class Demo2 
{
	/***
     java�������ͣ��ؼ��֣����ݷ�Χ

	****/
	public static void main(String[] args) 
	{
		 // ����byte�������͵ı���������һ��byte����,byte�����ݷ�Χ ��-128  127��
		byte b = -128; // Byte��byte�������ݵİ�װ��
		System.out.println("b="+b);
		System.out.println("byte�����ֵ��"+Byte.MAX_VALUE);  // 127
		System.out.println("byte����Сֵ��"+Byte.MIN_VALUE);  // -128

		// ����short���͵ı���
		short s = 10000;
		System.out.println("s =" + s);
		System.out.println("short�����ֵ" + Short.MAX_VALUE);
		System.out.println("short����Сֵ" + Short.MIN_VALUE);

		//����һ�����͵ı���

		int value = 21379878; // Integer ��int�������ݵİ�װ��
        
		String str = "hello";
	    System.out.println("value =" +value);
		System.out.println("int�����ֵ"+ Integer.MAX_VALUE);//int�����ֵ2147483647
	    System.out.println("int����Сֵ"+ Integer.MIN_VALUE); //int����Сֵ-2147483648
    	// ����һ�������͵ı��� 

		long l = 1723901878L;

		//System.out.println("value�Ķ����Ʊ�ʾ��"+Integer.toBinaryString(l));

		System.out.println("l = "+ l);
		System.out.println("long�����ֵ��"+Long.MAX_VALUE);//long�����ֵ��9223372036854775807

		System.out.println("long����Сֵ��"+Long.MIN_VALUE); //long����Сֵ��-9223372036854775808
       
	    // ����һ�����������͵ı���
        //  �������ֲ�ռ�ڴ�,С�����8λ�ɼ����ٶ�����ݾ�ֱ��ʡ�Ե�
		//  ��������ռ�ڴ棬С�����6λ�ɼ�
		float f = 11.6182689664f; // ����f�ĸ��������ݾ�Ĭ����double���͵�����

		System.out.println("f="+f);
		System.out.println("float�����ֵ��"+Float.MAX_VALUE); //3.4028235E38
		System.out.println("float����Сֵ��"+Float.MIN_VALUE); //float����Сֵ��1.4E-45
		 
		double d = 0.21738973298745662; //�����17λ�ɼ�

		System.out.println("d = "+d);
		System.out.println("double�����ֵ��"+Double.MAX_VALUE);
		System.out.println("double����Сֵ��"+Double.MIN_VALUE);

		// ����һ��char���͵ı���

		char ch = 'k'; // ÿһ����ĸ����Ӧһ������

		char ch1 = 65 ; // ������ĸ��askii�붨���ַ�����

		System.out.println("ch1 =" +ch1); // A
		System.out.println("ch =" + ch); // �س���

		char ch2 = '\u0051';

		System.out.println("ch2 ="+ch2);

		String str1 = "hello";

        int code1 = str1.charAt(0); // 'h'��askii��

        System.out.println("hello�ĵ�һ����ĸ��askii���ǣ�"+code1);

        // ����boolean���͵ı���
		boolean isTrue = false;
		System.out.println("isTrue = "+isTrue);
       
	}
}
