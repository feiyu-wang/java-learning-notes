import java.math.*;
class Demo4 
{
	/*******
	BigInteger类-----超大整数类
	******/
	public static void main(String[] args) 
	{
	    int value1 = 2147483645; // int类型数据的最大值附近的极限值
		int value2 = 2147483646; // 超过int类型数据的最大值

		BigInteger b_value2 = new BigInteger("214748364945");
		System.out.println("value1 =" +value1);
		System.out.println("b_value2 =" +b_value2);
		System.out.println("value2="+value2);
        
		// 俩个int类型数据的极限值求和
		int sum = value1+value2; // int类型数据极限值的运算： 存在运算错误
		int mean = sum/2;
		System.out.println("sum="+sum);
		System.out.println("mean="+mean);

		// 第一步：　将十进制的整数转换成BigInteger类型的数据

		BigInteger b1 = new BigInteger(2147483645+"");
		BigInteger b2 = new BigInteger("214748364645");

		// 第二步：将俩个数据求和
		BigInteger b_sum = b1.add(b2); // b1+b2		// 减法运算：

		BigInteger b_sub = b1.subtract(b2); // b1-b2
		BigInteger b_va = new BigInteger(2+""); // 		// 除法运算：
		BigInteger b_mean = b_sum.divide(b_va);// b1+b2/2

		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		System.out.println("sum="+b_sum);
		System.out.println("sum="+b_sub);
		System.out.println("b_mean="+b_mean);

		// 将BigInteger类型的数据转换成float类型的数据

        float f = b1.floatValue();

		System.out.println("BigInteger转float="+f);

		int i = b2.intValue();

		System.out.println("BigInteger转int = "+i);

		long l = b2.longValue();

		System.out.println("BigInteger转long = "+l);

	}
}
