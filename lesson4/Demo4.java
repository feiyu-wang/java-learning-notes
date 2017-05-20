import java.util.*;
class Demo4 
{
	/**
	键盘输入一个三位数（整数或者字符串），
	在控制台打印输出百位数字，十位数字，个位的数字
	**/

	public static void main(String[] args) 
	{
		// 第一种写法： 输入的数据是一个整数
		Scanner input = new Scanner(System.in);	
		System.out.println("请输入一个三位整数：");
		System.out.println("请输入运算方法符号：");
		boolean flag = input.nextBoolean();
        if(flag)
		{
			int num = input.nextInt(); // 234 
			// 百位 --------------2  234/100 = 2 
			// 十位 --------------3  234%100/10 = 3
			// 个位 --------------4  234%10 = 4 			
			int num1 = num/100; // 2

			int num2 = num%100/10; // 3

			int num3 = num%10;// 4
			
			System.out.println("num的百位是："+num1);
			System.out.println("num的十位是："+num2);
			System.out.println("num的个位是："+num3);
			
		}
		else
		{
			// 第二种写法： 输入的数据是一个字符串 “234”
			// 只有String类型的数据才有charAt()方法
            String str_num = input.next(); // "234"
            // 一次性将字符串中的所有的字母都取出 ‘2’ ‘3’ ‘4’
			char[] ch_num = str_num.toCharArray(); // 一组字符
			//百位的字母
			//char ch_num1 = str_num.charAt(0);
			// 十位的字母
			//char ch_num2 = str_num.charAt(1);
			// 个位的字母
            //char ch_num3 = str_num.charAt(2);
			System.out.println("num的百位数是："+ch_num[0]+"  十位数："+ch_num[1]+" 个位数是："+ch_num[2]);
		}
	}
}
