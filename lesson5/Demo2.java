class Demo2 
{
	/****
	*位运算符 
	****/
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(3));  // 11
		// 整数3的二进制位的字符串的形式
		System.out.println(Integer.toBinaryString(4)); // 100
		System.out.println(3&4); // 0 
		System.out.println(3|4); // 7
		System.out.println(3^6); // 5

		System.out.println(3<<4); // 48
		System.out.println(51>>4); // 3

		System.out.println(-13>>4); // -1
		System.out.println(-13>>>4); //

		// 位异或加密

		int a = 10;  // 要加密的原文是a

		int b = 20; // 密文是b

		int c = a^b; // 30  原文与密文做异或运算--------加密过程 

		int d = b^c; // 10  密文与加密后的结果做异或运算-----解密过程

		System.out.println("a和b做异或运算的结果是："+c); // 30

		System.out.println("b和c做异或运算的结果是："+d); // 10


	}
}
