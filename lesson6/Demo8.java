import java.util.*;
// 定义一个枚举
enum MyWeek
{
   // 枚举中定义这个范围内部的数据---一周内七天
   Monday,Tuesday,Wednesday,Thrisday,Friday,Saturday,Sunday;
}

class Demo8 
{
	/**switch分支  key值枚举 enum 
	enum -----一种特殊的数据类型，将某一个范围内的可列举的情况都罗列出来
	***/
	public static void main(String[] args) 
	{
	   	// 定义枚举类型的key值
       
		int key = 10;
        MyWeek myday = MyWeek.Monday; // myday枚举的情况----Monday---key值

		switch(myday)
		{
           case Monday:System.out.println("今天是星期一");break;
		   case Tuesday:System.out.println("今天是星期二");break;
		   case Wednesday:System.out.println("今天是星期三");break;
		   case Thrisday:System.out.println("今天是星期四");break;
		   case Friday:System.out.println("今天是星期五");break;
		   case Saturday:System.out.println("今天是星期六");break;
		   case Sunday:System.out.println("今天是星期天");break;		 
		   default:System.out.println("周内没有这种情况");
		}

	}
}
