import java.util.*;
class Demo5 
{
	/**
	  月中天数： 输入年份：2016 输入月份2 
      结果： 2016年是闰年，2月有29天
	**/
	static Scanner input = new Scanner(System.in);     	
	static int year = 0;
	static int month = 0;
	static int day = 0; // 28 29 30 31 -----month,year
	static boolean isLeapYear = false;
	public static void main(String[] args) 
	{
		while(true)
		{		
			// 重复输入并且判断年份		
            inputYear();
			if(isRightYear(year))
			{
               System.out.println("输入的年份不合法，请重新输入：");
			   continue;
			}
		    // 重复输入并且判断月份
			inputMonth();
			if(isRightMonth(month))
			{
               System.out.println("输入的月份不合法，请重新输入：");
			   continue;
			}		
			isLeapYear = (year%400==0)||(year%4==0&&year%100!=0); // 判断闰年条件
           
		    System.out.println(year+"年是"+(isLeapYear?"闰年":"平年")+","+month+"月有"+getDay(isLeapYear,month)+"天");
			System.out.println("输入字母a,停止查询，按任意键继续");
			String ch = input.next();
			if(ch.equals("a"))
			{
			     System.out.println("bye-bye");
			     break;
			}
		}
	}
    public static void inputYear()
	{
		System.out.println("请输入年份：");
		year = input.nextInt();
	}

	public static void inputMonth()
	{
        System.out.println("请输入月份：");
		month = input.nextInt();
	}
    // 判断年份是否不合法的方法
	public static boolean isRightYear(int year)
	{
		if(year<1000||year>9999)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//判断月份是否不合法的方法
	public static boolean isRightMonth(int month)
	{
		if(month<1||month>12)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
    // 12月的天数罗列出来			
	public static int getDay(boolean isLeapYear,int month)
	{
            switch(month)
			{
				case 4:
				case 6:
				case 9:
				case 11: day = 30;break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: day = 31;break;
				case 2:  day = isLeapYear?29:28;
			}
            return day;
	}
	

}
