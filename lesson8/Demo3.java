import java.util.*;
class Demo3 
{
	static Scanner input = new Scanner(System.in);
	static int max ;
	public static void main(String[] args) 
	{
		//input1();
//	   int i = 0;
//       for(foo('A'); foo('B') && (i < 2); foo('C'))
//	   {
//           i++;      // i = 1  i = 2 
//           foo('D');
//       }
//
//	    int x=1,y=1,z=1;
//	    if(x--==1&&y++==1||z++==1)
//		{
//		   System.out.println("x="+x+",y="+y+",z="+z);
//		}
		int i = 0xFFFFFFF1;
		System.out.println(Integer.toBinaryString(i));//11111111111111111111111111110001
		// 0000-1110
		int j = ~i; // ~ 二进制位取反符号
		System.out.println(j); // 14

	   // A B D C B D C B 
	}
	public static void input1()
	{
		System.out.println("请输入第一个int");
		int num1 = input.nextInt();
		System.out.println("请输入第二个int");
		int num2 = input.nextInt();
		System.out.println("请输入第三个int");
		int num3 = input.nextInt();
        System.out.println("三个int的最大值是："+getMax(num1,num2,num3));
	}
	public static int getMax(int num1,int num2,int num3)
    {
        max = Math.max(Math.max(num1,num2),num3);
		return max;
	}
	/**
	foo()调用者传一个char字母，将传进来的字母打印输出，返回给调用者true
	**/
	
	static boolean foo(char c) 
    {
       System.out.print(c);       
	   return true;
    }
    

}
