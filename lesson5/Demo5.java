import java.math.*;
class Demo5 
{
	/***
	BigDecimal�� --------------����������
    
	***/
	public static void main(String[] args) 
	{
		double d1 = 26.27398729827318291829;
		double d2 = 23.1990909999111291982912;
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		// ��BigInteger���͵�����ֱ��ת����BigDecimal��

		BigInteger b = new BigInteger("17291872817234");
		BigDecimal b_d = new BigDecimal(b);
		System.out.println("b_d="+b_d);

		// ��double���͵�����ת����BigDecimal���͵����ݣ���double�������ߵ��������߾���
		// ��String���͵�����ת����BigDecimal���͵����ݣ�������ԭ�����ݵľ���ֵ
		BigDecimal b_d1 = new BigDecimal(d1); // ת�����ַ���

		System.out.println("double����ת����BigDecimal���͵Ľ���ǣ�"+b_d1);

		// ��int���͵�����ת����BigDecimal���͵����ݣ�����������
		BigDecimal b_int = new BigDecimal(2147483647);
		System.out.println("int��������ת����BigDecimal�Ľ���ǣ�"+b_int);

		// ��double���͵�����ת�����о���С����λ��BigDecimal���͵�����
        /**
        ��һ�֣�����һ������ģʽ������Чλ��

		MathContext mc = new MathContext(int precision,Rounding_mode mode);

		int precision : ���õ�С����Ŀ�ѧ����ֵ���������е����ֵ���Чλ����

		RoundingMode mode : ����ģʽ ----��������-----HALF_UP)

		23.678
		**/

		MathContext mc = new MathContext(5,RoundingMode.HALF_UP);

		BigDecimal b_mc = new BigDecimal(d1,mc);

		System.out.println("d1�����������������ģʽ������Ϊ��"+b_mc);

		/****

		�ڶ��֣� ���ø�������Чλ��

		setScale(int newScale); // int newScale -----�����µ���Чλ��,С�������Ч����

		*****/

		BigDecimal b_d2 = new BigDecimal(d2);

		BigDecimal b_sc = b_d2.setScale(3,RoundingMode.HALF_EVEN);
		
		System.out.println("d2����3λС���������Ϊ��"+b_sc);


	}
}
