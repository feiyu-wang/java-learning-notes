class Demo2 
{
	/**
	  ��������
	**/
	public static void main(String[] args) 
	{
		System.out.println(-20);
		// �����Ķ����Ʊ�ʾ��ʽ---�����Ķ����Ʊ�ʾ��1��ͷ
		// �����Ķ����Ʊ�ʾ��0��ͷ
		// �����Ķ������ַ����ı��ı�ʾ��ʽ��ӡ���
		// Integer -------------�������е�toBinaryString()������-20 ת���ɶ������ı�

		System.out.println(Integer.toBinaryString(-20)); //11111111111111111111111111101100 
         
		System.out.println(020);// �����İ˽��Ʊ�ʾ��ֱ��ת����ʮ���ƣ����ڴ���ת���ɶ�����

		System.out.println(0x20); //������ʮ�����Ʊ�ʾ����0x��ͷ
		
		System.out.println(0xd); // 13 ��ĸ�Ĵ�д��Сдû������

		System.out.println(8.9798127f); // �����ȸ����ͳ���

		System.out.println(132.0218390183902183); // ˫���ȸ����ͳ���

		System.out.println(100000000000000000L); // ���������͵����ݣ���9��ͷ��19λ����
         
		System.out.println(Long.MAX_VALUE);//9223372036854775807 ���������ݵ����ֵ��Χ


		System.out.println(Long.MIN_VALUE);//-9223372036854775808 ���������ݵ���Сֵ��Χ


        char ch = 65; // char ��ʾ�ַ������� 
		System.out.println('A'); // �ַ�����
        
		System.out.println(ch); //�ַ�����
        
        // �������͵����ݶ������ж�����
		// �������͵����ݲ��ܸ�����ֵ����ת��------�������ʽ------���ʽ�Ľ�����ջ���true����false
		if(10==20)// ------false 
		{
			System.out.println("���");
		}
		else
		{
			System.out.println("�ٵ�");
		}
	}
}
