class Demo3 
{
	public static void main(String[] args) 
	{		
		char ch = 109;  // 定义char类型的变量赋值为109
		byte b = (byte)ch ; // 将char类型的数据放在一个byte类型的变量中
		System.out.println("ch = "+ch);


        short s = 10000;
	    ch  = (char)s;

		//System.out.println("s = "+ s);

		byte b1 = 56;

        int i = ch; // 将ch类型的数据转换成int类型的数据

        int m = s;  // 将short类型的数据转换成int类型的数据

		int n = b1;  // 将byte类型的数据转换成int类型的数据

		System.out.println("i ="+i);
		System.out.println("m ="+m);
		System.out.println("n ="+n);

		int j = 1208989890;

		float f = j; // 将int类型的数据转换成float类型的数据

		System.out.println("f = "+ f);


        int value1 = (int)f; // 将float类型的数据放到int类型的数据

		System.out.println("value1 = "+ value1);

		long l = j;

		System.out.println("l ="+ l);
	}
}
