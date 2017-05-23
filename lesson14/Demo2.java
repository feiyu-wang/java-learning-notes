import java.util.*;
/**
练习1：从键盘输入10个整数，用执行类来接收数据，定义一个Caculate实体类，
在实体类中求取10个数中最大值，最小值，平均值。
**/
class Demo2 // 执行类
{
	// 要使用实体类中成员变量和成员方法，必须先生成实体类的实例对象
	public static void main(String[] args) 
	{
		int[] num = new int[10];
		for(int i = 0; i<num.length;i++)
		{
		  System.out.println("请输入第"+(i+1)+"个整数");
		  num[i] = new Scanner(System.in).nextInt();
		} 
		Caculate c = new Caculate();
		c.getResult(num);
		c.show();
	}
}
/**
Caculate实体类
**/
class Caculate
{
    // 成员变量和成员方法
	int max;
	int min;
	int sum;
	double mean;
	public void getResult(int[] num)
	{
         max = num[0];
		 min = num[0];
		 for(int i = 0; i<num.length;i++)
		 {
			 if(max<num[i])
			 {
				 max = num[i];
			 }
			 if(min>num[i])
			 {
				 min = num[i];
			 }
			 sum+=num[i];
		 }
		 mean = (double)sum/(double)num.length;
	}

	public void show()
	{
       System.out.println("最大值是："+max);
       System.out.println("最小值是："+min);
       System.out.println("平均值是："+mean);
	}
}
