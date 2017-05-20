class Demo4 
{
	/**
    强制类型转换
	**/
	public static void main(String[] args) 
	{
		byte b = 78;

		int i = b ; // 隐式转换： 低精度转换成高精度

		System.out.println("b="+b);
		System.out.println("i="+i);

        int m = 100; // 强转的数据在byte类型的数据范围内，强转后不会发生值得损失
		byte n = (byte)m; // 将int类型的数据强制转换为byte类型的数据

		System.out.println("m = "+m);

		System.out.println("n = "+n);

		int num1 = 129; // 强转的数据出了byte类型的数据范围，强转会发生值得损失
		byte con_num1 = (byte)num1; 
		System.out.println("num1 ="+ num1); // 129
		System.out.println("con_num1 ="+ con_num1); // -127 

		int num2 = 40000;
        // 高精度的数据强转为低精度，并且强转后的数据不再低精度数据的范围内，发生值的损失

		short con_num2 = (short)num2;

		System.out.println("num2 = "+ num2);
		System.out.println("con_num2 =" + con_num2);

        b = (byte)(b+1); //运算过程中byte,short,char 自动升级到int类型的数据
		
		System.out.println("b ="+ b);

		b += 20; // b = b+20 自加运算，等号左
		边给变量自身做相加运算，但是等号右边没有运算过程，不会自动升精度			
		System.out.println("b = "+b);       


	}
}
