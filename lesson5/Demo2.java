class Demo2 
{
	/****
	*λ����� 
	****/
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(3));  // 11
		// ����3�Ķ�����λ���ַ�������ʽ
		System.out.println(Integer.toBinaryString(4)); // 100
		System.out.println(3&4); // 0 
		System.out.println(3|4); // 7
		System.out.println(3^6); // 5

		System.out.println(3<<4); // 48
		System.out.println(51>>4); // 3

		System.out.println(-13>>4); // -1
		System.out.println(-13>>>4); //

		// λ������

		int a = 10;  // Ҫ���ܵ�ԭ����a

		int b = 20; // ������b

		int c = a^b; // 30  ԭ�����������������--------���ܹ��� 

		int d = b^c; // 10  ��������ܺ�Ľ�����������-----���ܹ���

		System.out.println("a��b���������Ľ���ǣ�"+c); // 30

		System.out.println("b��c���������Ľ���ǣ�"+d); // 10


	}
}
