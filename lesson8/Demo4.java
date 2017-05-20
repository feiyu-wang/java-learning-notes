import java.util.*;
class Demo4 
{
	/**
	从键盘输入0～1000的整数，求各位数的和，并求得该值的二进制位表达式。
	例如345的结果是3+4+5＝12。
	**/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("请输入一个大于0的整数");
			long num = input.nextLong();
			if(num>0)
			{
               System.out.println("拆分求和的结果是："+getSum(num)); 
			}
			else
			{
                break;
			}
		}
	}
	public static int getSum(long num)
	{
        //将住房中输入的num拆分成各个位为上数字，就和
		int sum = 0;
        long d = 0; // 每一次拆分得到的数字
		while(num>0)
		{
            d = num%10; // 5  4  3  2 
			sum+=d;
			num/=10;
		}
		return sum;
	}
}
