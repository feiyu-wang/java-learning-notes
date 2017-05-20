class Demo1 
{
	/****
	*
	复习练习1 
	****/
	public static void main(String[] args) 
	{
		boolean flag1,flag2;
		int a = 100;
		int b = 120;
		flag1 = a++>=b&&(b--)>a; 
		System.out.println("a="+a); // 101 
		System.out.println("flag1="+flag1); // true false 
		System.out.println("b="+b);//120
		flag2 = ++a<=b||(++b)>a;	
		System.out.println("a="+a); // 102       
        System.out.println("b="+b); // 119
		System.out.println("flag2="+flag2);// true 
        int c = 30;
	
		String str= "hello";
		if(a++>=100&&b-->=120&(++a%2==0)||++c>=30)
		{
			System.out.println("a = "+a+" b = "+b+" c = "+c);
		}
		else
		{
			System.out.println("判定不成立");
		}
		//练习： 从键盘输入一个整数，整数必须是大于0的时候，判断这个数是奇数还是偶数
		// 从键盘输入一个用户名，判断只有输入的用户名是admin的时候，用户名是有效的
   	}
}
