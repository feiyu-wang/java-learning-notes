class Demo5 
{
	/****
	��ϵ����� > < >= <= == != 

	�Ƚ�������ȣ� ==  equals()����
	***/
	public static void main(String[] args) 
	{
		int a = 10; // 0100
		int b = 10;

		boolean re1 = a>=b; //a���b�����Ļ����������ʽ�Ľ������true,�෴�Ļ�����false
		
		System.out.println("re1="+re1);

		boolean re2 = a<=b; // ���������ʽ�Ľ������true

		System.out.println("re2="+re2);

		boolean re3 = (a==b);// ����a�ͱ�����b��ֵ��ȵģ����ʽ����true

		System.out.println("re3="+re3);
		boolean re4 = (a!=b);
		System.out.println("re4="+re4);

        String str1 = "hello world"; // ����һ���ַ������͵�����
		String str2 = new String("hello world"); // �ڶ��ֶ����ַ������ݵķ���
		String str3 = new String("hello world");
        // str1��str2�ڼ�����ڴ��д洢���ݵĵط���ͬ��= ��ֵ���ַ�����������--0200
		// str2�Ķ��壬new�ؼ���һ������ڴ��п���һ���׵�ַ
		// str3�Ķ��壬new�ؼ����ڶ��ڴ��п���һ���׵�ַ
		System.out.println(str1==str2); // false
		System.out.println(str1==str3); // false
		System.out.println(str2==str3); // false
		System.out.println(a==b);
		// �Ƚ��ַ����������Ƿ�����ͬ��---equals()����
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));

		//System.out.println((a++)<=(b--));

		if((a++)<(b--)|(str1!=null)|(str2==null))
		{
           System.out.println("�߼������");
		}
		else
		{
			System.out.println("�߼��򲻳���");
		}

		System.out.println(!(str1==str2));

		boolean flag = true;

		boolean result = (!flag)&&(a++>b);

		System.out.println("reault = "+result);

		System.out.println("a="+a);

		boolean result1 = (flag)||(a++<b);

		System.out.println("result ="+result1);
		System.out.println("a="+a);


	}
}
