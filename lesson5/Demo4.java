import java.math.*;
class Demo4 
{
	/*******
	BigInteger��-----����������
	******/
	public static void main(String[] args) 
	{
	    int value1 = 2147483645; // int�������ݵ����ֵ�����ļ���ֵ
		int value2 = 2147483646; // ����int�������ݵ����ֵ

		BigInteger b_value2 = new BigInteger("214748364945");
		System.out.println("value1 =" +value1);
		System.out.println("b_value2 =" +b_value2);
		System.out.println("value2="+value2);
        
		// ����int�������ݵļ���ֵ���
		int sum = value1+value2; // int�������ݼ���ֵ�����㣺 �����������
		int mean = sum/2;
		System.out.println("sum="+sum);
		System.out.println("mean="+mean);

		// ��һ��������ʮ���Ƶ�����ת����BigInteger���͵�����

		BigInteger b1 = new BigInteger(2147483645+"");
		BigInteger b2 = new BigInteger("214748364645");

		// �ڶ������������������
		BigInteger b_sum = b1.add(b2); // b1+b2		// �������㣺

		BigInteger b_sub = b1.subtract(b2); // b1-b2
		BigInteger b_va = new BigInteger(2+""); // 		// �������㣺
		BigInteger b_mean = b_sum.divide(b_va);// b1+b2/2

		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		System.out.println("sum="+b_sum);
		System.out.println("sum="+b_sub);
		System.out.println("b_mean="+b_mean);

		// ��BigInteger���͵�����ת����float���͵�����

        float f = b1.floatValue();

		System.out.println("BigIntegerתfloat="+f);

		int i = b2.intValue();

		System.out.println("BigIntegerתint = "+i);

		long l = b2.longValue();

		System.out.println("BigIntegerתlong = "+l);

	}
}
