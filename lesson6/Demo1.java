import java.util.*;
class Demo1 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println("a="+a);
        setValue(30); // main()方法调用setValue()
		a++;
		System.out.println("a="+a);
		System.out.println("请输入一个大于0的整数");
		int num = input.nextInt();
		if(num>0)
		{
			if(num%2==0)
			{
				System.out.println("输入的是偶数");
			}
			if(num>20)
			{
				System.out.println("输入的数是大于20的数");
			}
			else
			{
				System.out.println("输入的数是小于20的数");
			}	
		}
		else
		{
            System.out.println("输入的数据不合法");
		}
		for(int i = 0; i<10;i++)
		{
			System.out.println("此处的代码执行10遍");
		}
	}
	
	public static void setValue(int m)
	{
        m = 20;
	}
}
