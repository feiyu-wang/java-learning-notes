class Demo4 
{
	/**
	���������������͵ı����ֱ�ֵ����һ�θ�ֵ��ӡ�����

	������ֵ�������ٽ��������ֵ��ӡ�����
	**/
	public static void main(String[] args) 
	{
		int m = 10;
		int n = 20;
		System.out.println("����ǰm��ֵ��"+m);
		System.out.println("����ǰn��ֵ��"+n);

//		m = n; 
//		n = m;
        int temp  = m; // ������m��ֵȡ�������뵽�м�ֵ�ڴ�

        m = n ; //������n��ֵȡ�������뵽����m
		
        n = temp;  // ���м�ֵ�ڴ���ֵȡ�������뵽����n��
          
		System.out.println("temp="+temp);
		System.out.println("m="+m);
		System.out.println("n="+n);

	}
}
