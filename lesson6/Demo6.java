import java.util.*;
class Demo6
{
	/**
	 switch选择分支，支持 char byte int short
	 case后面的数据类型必须与key值得数据类型一致或者低于key值得精度
	**/
	public static void main(String[] args) 
	{
		// 定义有具体值得变量
        final int NUM = 4;//最终变量
		final int key = 2; // key值
		final int NUM_1 = 2;
		System.out.println("请输入一个大于0的数据");
		short num = new Scanner(System.in).nextShort();
		if(num>0)
		{
			switch(num)
			{
				case 1: System.out.println("one");break;
				case key: System.out.println("two");break;
				case 3: System.out.println("three");break;
				case key+NUM_1: System.out.println("four");break;
				case 5: System.out.println("five");break;
				case 6: System.out.println("six");break;
				case 7: System.out.println("seven");break;
				case 'a':System.out.println("one hundred one");break;
				case 12019:System.out.println("over");break;
				default:System.out.println("default");
			}
		}
		else
		{
		   System.out.println("输入的数据不合法");
		}

		System.out.println("======================");
		char ch = '-';
		long l = 1928092839087L;// switch不支持long类型的数据
		switch(ch)
		{
			case '-':System.out.println(NUM-NUM_1);break;
			case '+':System.out.println(NUM+NUM_1);break;
			case '*':System.out.println(NUM*NUM_1);break;
			case '/':System.out.println(NUM/NUM_1);break;
			default:System.out.println("不做运算");
		}
	}


}
