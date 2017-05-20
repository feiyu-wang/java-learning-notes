import java.util.*;
class Demo3 
{
	/***
	  用户名密码登录加密
	***/
	// 定义一个全局变量的文本扫描器
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("请输入用户名");
		// 输入的用户名是整数类型的数据
		int username = input.nextInt();
        // 用户名加密的内容就是‘a’
		//char[] ch_user = username.toCharArray(); // a b f g 
		System.out.println("请输入密文");
        String secret = input.next();
		char ch_secret = secret.charAt(0); // a
        // 用户名加密过程------加密的内容------int 

		int content = username^ch_secret;
		System.out.println("加密前的用户名原文是："+username);
		System.out.println("加密后的用户名内容是："+content);

		// 用户名解密过程-----解密---
		int  con_jiemi = ch_secret^content;
		System.out.println("解密后的用户名内容是："+con_jiemi);

		// 密码的加密过程
		System.out.println("请输入密码：");		
		byte pass = input.nextByte();
		//对密码进行加密，用数字9 

		byte pa_jiami = (byte)(pass^9);
		byte pa_jiemi = (byte)(pa_jiami^9);

		System.out.println("加密前的密码原文是："+pass);
		System.out.println("加密后的密码内容是："+pa_jiami);
		System.out.println("解密后的密码原文是："+pa_jiemi);

	}
}
