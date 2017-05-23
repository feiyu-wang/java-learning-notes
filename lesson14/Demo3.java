import java.util.*;
import java.math.*;
/**
练习2: 从键盘输入俩个字符串，分别定义三个方法实现字符串的拼接，整数值相加，
浮点数相加求和,并将浮点型数据转换成超精度数据类型，保留3位有效位数
（jdk提供的类String,Integer,BigDecimal）
**/
class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入第一个字符串");
		String str1 =  new Scanner(System.in).next();
		System.out.println("请输入第二个字符串");
		String str2 = new Scanner(System.in).next();

		Demo3 d = new Demo3();
		d.show(str1,str2);
	}
	//实现字符串拼接的方法
	public static String strAdd(String str1,String str2)
	{
       return str1+str2;
	}
	// 字符串整数中相加求和-----这俩种解析方法使用前提，字符串必须是整数类型的字符串
	public static int strIntAdd(String str1,String str2)
	{
		// 第一种： 将字符串整数解析为整数值
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);

		// 第二种： 将字符串整数封装成Integer类，Integer的intValue()方法
        int num1 = Integer.valueOf(str1).intValue();
		int num2 = Integer.valueOf(str2).intValue();		
		return num1+num2;
	}

	// 实现浮点型字符串的相加求和
	public static double strDoubleAdd(String str1,String str2)
	{ 
        double num1 = Double.valueOf(str1).doubleValue();
		double num2 = Double.valueOf(str2).doubleValue();
		// 1 将double类型的数据转换成BigDecimal类型的数据
        BigDecimal b1 = new BigDecimal(num1);
		BigDecimal b2 = new BigDecimal(num2);
		MathContext mc = new MathContext(5,RoundingMode.HALF_UP);        
        BigDecimal sum = b1.add(b2,mc);
		// 2 将BigDecimal类型的数据转换成double类型的数据
		double sum_db = sum.doubleValue();
        return sum_db;
	}
	// 定义打印输出结果的方法
	public static void show(String str1,String str2)
	{
		if(str1.contains(".")&&str2.contains("."))
		{
			System.out.println("字符串转换成浮点型数据相加求和的结果是："+strDoubleAdd(str1,str2));
		}
		else
		{
			System.out.println("字符串拼接的结果是："+strAdd(str1,str2));
			System.out.println("字符串转换成整数相加的结果是："+strIntAdd(str1,str2));
		}
	}
}
