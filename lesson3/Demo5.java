import java.util.Scanner;
class Demo5 
{
	/**
     从键盘输入信息
	**/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		// 从键盘录入一个人名

		System.out.println("请输入一个人名");

		String name = input.next();

		System.out.println("扫描的人名是："+name);
	}
}
