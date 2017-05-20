import java.util.*;
class Demo2 
{
	/*****
	请输入用户姓名，出生日期
    字符串的使用方法：
	1 第一个条件：输入的用户名是否还有字母‘ｓ’

	   成立： 输入的用户名改成大写

	   不成立： 走第二个条件

	2 第二个条件：用户名是否以“辛"开始，

	3 第三个条件：根据出生日期获取性别  

	  610681198802152217------18位，倒数第二数是奇数（男），偶数（女）
     
	  输出结果： （男）辛先生，你好！

      输出结果： （女）辛女士，你好！
	*****/

	/****
	输入一个四位数是一个年份，判断这一年是闰年还是平年
	****/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("请输入姓名：");
		String name = input.next();
		// 判断字符串中是否包含某一个字母---contains("字符串")
		// 将字符串转换成大写------toUpperCase();
		if(name.contains("s"))
		{
			System.out.println("包含s的字符串的大写形式为："+name.toUpperCase());
			// 如果包含's'的字符串中同时还包含了“0”,去掉空格，
			// 如果包含‘s’的字符串中同时不包含“0”，改成小写形式
			if(name.endsWith("0")) 
		    {
				System.out.println("去掉空格的姓名格式为："+name.trim());
			}
			else
			{
                System.out.println("改成小写的形式为："+name.toLowerCase());
			}
		}
		else
		{
		    System.out.println("请输入身份证号码：");
			String id = input.next();
            
            String id_2 = id.substring(16,17); // substring(int begin,int end) 方法：截取
			// 某一串子字符串，从begin开始到end结束，不包含end			
			System.out.println("身份证号码是："+id);
			System.out.println("身份证号码的倒数第二位是："+id_2);// "1"
			if(name.startsWith("辛"))
			{               
				if(Integer.parseInt(id_2)%2==0) // "1"------1%2----Integer的parseInt()方法将数字型字符串转换成整数
				{
                    System.out.println("辛女士，你好");				
				}
				else
				{
					System.out.println("辛先生，你好");
				}
			}
			else
			{
				System.out.println("未知的姓氏");
			}
		}

	}
}
