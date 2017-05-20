import java.util.*;
class Demo5 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入一个100以内分数：");
		int score = new Scanner(System.in).nextInt();
		if(score>=0&&score<=100)
		{
			if(score>=90)
			{
				System.out.println("优秀");
			}
			else if(score>=80)
			{
               // 分数在80 到 90 之间的梯度
			   System.out.println("良好");
			}
			else if(score>=70) 
			{
               System.out.println("普通");
			}
			else if(score>=60)
			{
               System.out.println("及格");
			}
			else
			{
			  System.out.println("挂科，请继续努力");
			}
		}
		else
		{
			System.out.println("输入的分数不合法");
		}
	}
}
