package wwt.com.test;

/**  
* @Title:  Demo3.java
* @Package jtb.com.string
* @Description: TODO(用一句话描述该文件做什么)
* @author 牛迁迁
* @date  2017-6-6 下午05:37:24
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @ClassName: Demo3
 * @Description:String类中正则表达式
 * @author jiatengbin
 * @date 2017-6-6 下午05:37:24
 * 
 * java后台开发过程中： 正则表达式的实质是具有特定含义或者规则的字符串
 * 
 * 登录邮箱验证：
 * 
 * 用户名验证：输入的合法性，不仅仅限制长度，限制输入的字符的内容-----正则表达式
 * 
 * 满足： 用户名必须是 1 字母 2 6-16长度  3 包含@ ，4 包含域名
 * 
 *      字母----[\\w]{6,16}[@]([s][i][n][a]|[1][2][6]|[1][6][3])[.][c][o][m]
 * 
 * 密码验证:
 * 
 * 满足： 1数字或者字母 2 长度 超过8 
 * 
 * 第二个练习： 给定一个字符串，打印出来字符串中每一个字母出现的总次数
 * 
 */
public class Test
{

	/**
	 * @param args
	 */
	static int count=0;
	public static void main(String[] args) 
	{		
         while(true)
         {
        	 System.out.println("请输入邮箱用户名：");
        	 String username = new Scanner(System.in).next();
        	 if(isUserMatch(username))
        	 {
        		 System.out.println("邮箱用户名格式正确");
        		 break;
        	 }
        	 else
        	 {
			    System.out.println("邮箱用户名格式错误");	
			 }
         }
		
	/*	StringBuffer str=new StringBuffer(0);
		str.append("aaabbbcdfaadccddd");
		while(str.length()>0){
			fun(str);
		}*/
		
	}
	/**
	 * 邮箱用户名的规则验证的方法
	 */
	public static boolean isUserMatch(String username)
	{
		// 定义邮箱用户名满足的正则表达式
		String regex = "[\\w]{6,16}[@]([s][i][n][a]|[1][2][6]|[1][6][3])[.][c][o][m]";
		//第一种： 邮箱用户名的正则表大式的判断是根据String类的match()方法		
		//boolean isMatch = username.matches(regex);
		// 第二种： 使用模式匹配器来进行邮箱用户名正则表达式的判断
		// 第一步：　将正则表达式编译到模式匹配器中
		Pattern pattern = Pattern.compile(regex);
		// 第二种：将输入要验证的内容封装到Mather中
		Matcher m =  pattern.matcher(username);
		// 第三步：验证输入是否匹配模式表大式
		boolean isMatch = m.matches();// 输入的内容必须全部匹配正则表达式
		//boolean find = m.find(); // 输入的内容中由一段匹配正则表达式那么结果就成立
		//String groupString  = m.group(); // 输入的内容中找到的匹配的一小段
		//System.out.println(groupString);
		return isMatch;		
	}
	public static void fun(StringBuffer str){
		char ch=str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (ch==str.charAt(i)) {
			
				str.deleteCharAt(i);
				i--;
				count++;
			}
			//System.out.println(str);
		}
		System.out.print(ch+"出现了"+(count)+" ");
		count=0;
	}

}
