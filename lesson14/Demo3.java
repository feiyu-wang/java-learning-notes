import java.util.*;
import java.math.*;
/**
��ϰ2: �Ӽ������������ַ������ֱ�����������ʵ���ַ�����ƴ�ӣ�����ֵ��ӣ�
������������,��������������ת���ɳ������������ͣ�����3λ��Чλ��
��jdk�ṩ����String,Integer,BigDecimal��
**/
class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("�������һ���ַ���");
		String str1 =  new Scanner(System.in).next();
		System.out.println("������ڶ����ַ���");
		String str2 = new Scanner(System.in).next();

		Demo3 d = new Demo3();
		d.show(str1,str2);
	}
	//ʵ���ַ���ƴ�ӵķ���
	public static String strAdd(String str1,String str2)
	{
       return str1+str2;
	}
	// �ַ���������������-----�����ֽ�������ʹ��ǰ�ᣬ�ַ����������������͵��ַ���
	public static int strIntAdd(String str1,String str2)
	{
		// ��һ�֣� ���ַ�����������Ϊ����ֵ
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);

		// �ڶ��֣� ���ַ���������װ��Integer�࣬Integer��intValue()����
        int num1 = Integer.valueOf(str1).intValue();
		int num2 = Integer.valueOf(str2).intValue();		
		return num1+num2;
	}

	// ʵ�ָ������ַ�����������
	public static double strDoubleAdd(String str1,String str2)
	{ 
        double num1 = Double.valueOf(str1).doubleValue();
		double num2 = Double.valueOf(str2).doubleValue();
		// 1 ��double���͵�����ת����BigDecimal���͵�����
        BigDecimal b1 = new BigDecimal(num1);
		BigDecimal b2 = new BigDecimal(num2);
		MathContext mc = new MathContext(5,RoundingMode.HALF_UP);        
        BigDecimal sum = b1.add(b2,mc);
		// 2 ��BigDecimal���͵�����ת����double���͵�����
		double sum_db = sum.doubleValue();
        return sum_db;
	}
	// �����ӡ�������ķ���
	public static void show(String str1,String str2)
	{
		if(str1.contains(".")&&str2.contains("."))
		{
			System.out.println("�ַ���ת���ɸ��������������͵Ľ���ǣ�"+strDoubleAdd(str1,str2));
		}
		else
		{
			System.out.println("�ַ���ƴ�ӵĽ���ǣ�"+strAdd(str1,str2));
			System.out.println("�ַ���ת����������ӵĽ���ǣ�"+strIntAdd(str1,str2));
		}
	}
}
