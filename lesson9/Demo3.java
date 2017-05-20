import java.util.*;
class Demo3 
{
	/**用数组来实现文字加密**/
	static Scanner  input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("请输入用户名");
		String username = input.next();
		System.out.println("请输入密文：");
		String secret = input.next();
		char ch_s = secret.charAt(0);
		String jiami = entrption(username,ch_s);
		System.out.println("加密的用户名的内容是："+jiami);
        String jiemi = entrption(jiami,ch_s);
		System.out.println("解密后的用户名的内容是："+jiemi);
		System.out.println("请输入密码：");
		String password = input.next();
	}
	/**自定义加密的算法---同时也是解密算法**/
	public static String entrption(String username,char secret)
	{
       // 加密---原文中的所有的字母与密文做异或运算
	   // 解密---加密后的结果与密文做异或运算
	   // 第一种： 1 将原文字符串拆分成单个字母
	   char[] ch = username.toCharArray();
	   for(int i = 0; i<=ch.length-1;i++)
	   {
		   ch[i] = (char)(ch[i]^secret);		  
	   }
	   // 2 将加密后的字母连接成加密的字符串内存
	   String en_username = new String(ch,0,ch.length);
      return en_username;
	   // 第二种写法：将原文字符串拆分成byte字节数组

	   byte[] buf = username.getBytes();
       
	   for(int i = 0; i<buf.length;i++)
	   {
           buf[i] = (byte)(buf[i]^secret);
	   }

	   return new String(buf);
	}
}
