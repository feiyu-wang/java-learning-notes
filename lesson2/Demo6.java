class Demo6 
{
	/**
	������������

	ȫ�ֱ����;ֲ�����
	**/   
    // static �ؼ������εķ���ֻ�ܷ���static���ε�ȫ�ֱ���
    static String name ; // �����ַ������͵ı��������Ҹ�ֵΪ����
	static int age ; // �����������͵�ȫ�ֱ���age,age��ֵ����10 
	static boolean gender; 
	{
		 // ���������---���������ݿռ�
		 int y = 30;
	}
	public static void main(String[] args) 
	{
		// �ֲ�����: �����ڷ������ڲ���ʹ�÷�Χ�����ڷ������ڲ�ʹ�ã�
		//���˷����岻��ʹ��
		int x = 10 ; 
		System.out.println("x="+x);			
		// ��main()��ʹ��get()����
		get();
		//System.out.println("name = "+name);        
		int age = 20; // ������һ���ֲ�����age,ȫ�ֱ����;ֲ�����ͬ����
		// �������з��ʵ��Ǿֲ�����
		System.out.println("age = "+ age);
        // main()������һ�����������
		{
			// main()��������ľֲ��������Խ�������������
            x = 30;
			System.out.println("x =" +x); 
			int j = x+10; // ����������ж���ı��������ڴ�����ⲿʹ��
		}

		//System.out.println("j="+j); 
		
	}
    public static void get()
	{
		//System.out.println("x="+x);
		//String name = "����"; // get�����еľֲ�����
		//name = "����"; ����Ա������ֵ�޸�Ϊ����
		System.out.println("get name = "+ name);
		System.out.println("get age = "+ age);
		System.out.println("get gender  = "+ gender);
	}

}
