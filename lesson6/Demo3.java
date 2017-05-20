import java.util.*;
class Demo3 
{
	/****
	 输入一个四位数，判定是闰年还是平年  
	****/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
	   // 判断年份是闰年还是平年的条件
	   //第一个：被400整除
	   //第二中: 被4整除并且不能被100整除
	   System.out.println("请输入年份：");
	   int year = input.nextInt();
	   if(year>999&&year<=9999)
	   {
           if(year%400==0||(year%4==0&&year%100!=0))
		   {
			   System.out.println(year+"是闰年");
		   }
		   else
		   {
			   System.out.println(year+"是平年");
		   }
	   }
	   else
	   {
		   System.out.println("输入的年份不合法");
	   }
	}
}
