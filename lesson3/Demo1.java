class Demo1 
{
	static int age;  // ����һ��ȫ�ֱ���age��û�г�ʼ����
	public static void main(String[] args) 
	{
		System.out.println(0x18); // ʮ�����Ƶ��������������ڴ��� 72 
        System.out.println(18290183291268618L); //���������� ��׺L
		System.out.println(Long.MAX_VALUE);        
		int m,n,x = 10,y = 20,z = 30; // �����Ķ���,main()�����ľֲ�����
        
		m = 100; // �����ĵ�һ�ָ�ֵ��ֱ�Ӹ���ֵ

		n = m + 90; // �ڶ��ָ�ֵ���Ǳ��ʽ
		m = x+y+z; 		
		System.out.println("m="+m);        
		int i = getValue();  // 100  ������ֵ�Ƿ�������ֵ
		System.out.println("i="+i);

		String name ="s:hksaa:ok:hello"; // ������ֵΪnull ,���������NullPointerException 

		int length = name.length(); 

		System.out.println(length); // �ַ������͵����ݲ��е�length()��ȡname�ַ����ĳ�����һ������ֵ
        
		if(i==100) // �ȽϵĽ�����ǲ���ֵ��true,false 
		{
			int age = 20; // main()�����е�if{} �еľֲ�����
			//ȫ�ֱ����;ֲ�����������ʱ�򣬷��ʵ��Ǿֲ�����
		    String[] str = name.split(":"); // split() ������һ�����ַ������ݣ����ָ�ɼ������ַ���

            System.out.println("str = " +str); // �׵�ַ
			System.out.println(str[0]);
			System.out.println(str[1]);
			System.out.println(str[2]);
			System.out.println(str[3]);
			System.out.println("if age="+age);
		}
		else
		{
           System.out.println("x ="+ x);
		   System.out.println("y ="+ y);
		}
		System.out.println(" main age = "+ age);
		// ��main()������ʹ��circleArea()����
		circleArea(8.979878f);   

	}
	// �Զ���getValue()������
	public static int getValue()
	{
		System.out.println("getValue age = "+ age );
		return 100;
	}
    
	// ��Բ��������ܳ�
    // Բ���� ���ճ��� Math.PI --- �����˾������ֵ
	// �뾶 
	public static void circleArea(float radius)
	{
		double  area  =  Math.PI * radius * radius;
		double  circulate = 2 * Math.PI * radius;
		System.out.println("Բ�����ǣ�"+Math.PI);		
		System.out.println("Բ������ǣ�"+ area);
		System.out.println("Բ���ܳ��ǣ�"+ circulate);
	}

}
