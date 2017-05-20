import java.util.*;
class Demo7 
{
	/***
	switch语句 key值支持String类型数据，jdk1.6版本（面试提问回答）

	编译程序if选择结构语法来解析
	***/

	public static void main(String[] args) 
	{
		System.out.println("请输入游戏角色：");
		String role = new Scanner(System.in).next();
		switch(role)
//		{
//			case "诸葛亮":System.out.println("观星，换底牌");
//			case "孙权":System.out.println("制衡");break;
//			case "关羽":System.out.println("武圣，补一刀!");break;
//			case "张飞":System.out.println("咆哮！");break;
//          default:System.out.println("无名小卒");
	    }
        if(role.equals("诸葛亮"))
		{
			System.out.println("观星，换牌");
			System.out.println("制衡");
		}
		else if(role.equals("孙权"))
		{
			System.out.println("制衡");
		}
	}
}
