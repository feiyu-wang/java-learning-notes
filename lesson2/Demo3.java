class Demo3 
{
	public static void main(String[] args)
	{
		/**
         �����Ķ���
		 �����ĸ�ֵ
		 ������ȡֵ
         ��ͬһ���������в����ظ��Ķ������
		 // ����һ���������͵ı���
        //��getValue()����ֵ���ڴ���ȡ�������뵽�����
		**/
		int i = 10; // ����������ڴ�ռ� 0200
	
		System.out.println("i = "+ i); // ������i��ֵ���ڴ���ȡ������ӡ���
	    i = 15; //���¸�ֵ 
		System.out.println("i = "+ i); // �ڶ��θ�����i��ֵ���ڴ���ȡ������ӡ���

		int j ; // ��������¿���һ���أ�����ڴ�ռ��ַ 0300 
   
		j = i+100; // �������i�����ڴ��д�ŵ�ֵȡ����
		// ��i��ֵ����ֵ100��������㣬����Ľ�����뵽0300Ҳ����j���ڵ��ڴ���
		System.out.println("j = "+ j); 

		int a,b = 10,c = 20; // ͬһ���������͵ı���,ֻ����һ���������;Ϳ���

		a = b+c; // ����a��ֵ�ɱ���b�ͱ���c���ڴ���ȡ����ֵ�����ͻ��

		System.out.println("a="+ a);
		System.out.println("b="+ b);
		System.out.println("c="+ c);
       
		int m = getValue();

		System.out.println("m="+m);
	
	}
    /**
    getValue()����һ������10 
	**/
	public static int getValue()
	{
		return 10;
	}
}
