class Demo1 
{
	/***
     复习练习1
	***/
	public static void main(String[] args) 
	{
		byte b  = 120; // 超过了byte的数据范围
        Short s = new Short((short)10000); // 定义short类型的数据 short s = 10000;
		char ch = (char)b; // 将byte类型的变量强转为char类型的变量

		//char类型数据的定义
		char ch1 = 'm';
		int ch1_code = ch1;
		System.out.println("ch1的askii码是："+ch1_code);// 109
		char ch2 = 122;
		char ch3 = '\u0031'; // 字符数据的十六进制的表示方式
		System.out.println("ch1 ="+ch1);
		System.out.println("ch2 ="+ch2);
		System.out.println("ch3 ="+ch3);
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("ch="+ch);

		int  i = 23000; // 定义int类型的变量

		s = (short)i; // 将int类型的变量强转为short类型的变量，要强转的数据在强转后数据类型的范围内，不会发生值得损失
        
		// 发生值得损失的这个强转在写代码的过程中是禁止的

		System.out.println("i="+i);

		System.out.println("s="+s);

		ch = (char)(ch + ch1) ; // 会发生精度的损失 byte,char,short数据在运算过程中会自动升级到int类型的数据
        
		int ch_code = ch;
		System.out.println("ch_code="+ch_code);
		ch += ch1; // 自加运算不会发生精度损失，等号右边不是一个计算表达式，那么不会自动生精度		
		


	}
}
