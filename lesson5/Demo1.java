class Demo1 
{
	/****
	*
	��ϰ��ϰ1 
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
			System.out.println("�ж�������");
		}
		//��ϰ�� �Ӽ�������һ�����������������Ǵ���0��ʱ���ж����������������ż��
		// �Ӽ�������һ���û������ж�ֻ��������û�����admin��ʱ���û�������Ч��
   	}
}
