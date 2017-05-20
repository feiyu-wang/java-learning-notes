import java.math.*;
class Demo5 
{
	/***
	BigDecimal类 --------------超精度类型
    
	***/
	public static void main(String[] args) 
	{
		double d1 = 26.27398729827318291829;
		double d2 = 23.1990909999111291982912;
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		// 将BigInteger类型的数据直接转换成BigDecimal类

		BigInteger b = new BigInteger("17291872817234");
		BigDecimal b_d = new BigDecimal(b);
		System.out.println("b_d="+b_d);

		// 将double类型的数据转换成BigDecimal类型的数据，将double数据升高到计算机最高精度
		// 将String类型的数据转换成BigDecimal类型的数据，不会升原本数据的精度值
		BigDecimal b_d1 = new BigDecimal(d1); // 转换成字符串

		System.out.println("double数据转换成BigDecimal类型的结果是："+b_d1);

		// 将int类型的数据转换成BigDecimal类型的数据，不会升精度
		BigDecimal b_int = new BigDecimal(2147483647);
		System.out.println("int类型数据转换成BigDecimal的结果是："+b_int);

		// 将double类型的数据转换成有具体小数点位的BigDecimal类型的数据
        /**
        第一种：定义一个舍入模式设置有效位数

		MathContext mc = new MathContext(int precision,Rounding_mode mode);

		int precision : 设置的小数点的科学精度值（包括所有的数字的有效位数）

		RoundingMode mode : 舍入模式 ----四舍五入-----HALF_UP)

		23.678
		**/

		MathContext mc = new MathContext(5,RoundingMode.HALF_UP);

		BigDecimal b_mc = new BigDecimal(d1,mc);

		System.out.println("d1按照四舍五入的舍入模式将精度为："+b_mc);

		/****

		第二种： 设置浮点型有效位数

		setScale(int newScale); // int newScale -----设置新的有效位数,小数点的有效精度

		*****/

		BigDecimal b_d2 = new BigDecimal(d2);

		BigDecimal b_sc = b_d2.setScale(3,RoundingMode.HALF_EVEN);
		
		System.out.println("d2保留3位小数点的数据为："+b_sc);


	}
}
