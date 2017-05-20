import java.util.*;
class Demo4 
{
	/**
	 if-else-if
	***/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("请输入答疑暗号：");
        int num = input.nextInt();
		if(num>0)
		{
            if(num==1)
			{
				System.out.println("提问：程序猿为什么称为猿类？");
			}
			else if(num==2)
			{
               System.out.println("提问：你的本地地址是？");
			}
			else if(num==3)
			{
               System.out.println("第二题的追问：你的原来的地址是？");
			}
		}
		else
		{
			System.out.println("没有此选项");
		}
	} 
}
