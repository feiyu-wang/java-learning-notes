class Demo4 
{
	/**
    ǿ������ת��
	**/
	public static void main(String[] args) 
	{
		byte b = 78;

		int i = b ; // ��ʽת���� �;���ת���ɸ߾���

		System.out.println("b="+b);
		System.out.println("i="+i);

        int m = 100; // ǿת��������byte���͵����ݷ�Χ�ڣ�ǿת�󲻻ᷢ��ֵ����ʧ
		byte n = (byte)m; // ��int���͵�����ǿ��ת��Ϊbyte���͵�����

		System.out.println("m = "+m);

		System.out.println("n = "+n);

		int num1 = 129; // ǿת�����ݳ���byte���͵����ݷ�Χ��ǿת�ᷢ��ֵ����ʧ
		byte con_num1 = (byte)num1; 
		System.out.println("num1 ="+ num1); // 129
		System.out.println("con_num1 ="+ con_num1); // -127 

		int num2 = 40000;
        // �߾��ȵ�����ǿתΪ�;��ȣ�����ǿת������ݲ��ٵ;������ݵķ�Χ�ڣ�����ֵ����ʧ

		short con_num2 = (short)num2;

		System.out.println("num2 = "+ num2);
		System.out.println("con_num2 =" + con_num2);

        b = (byte)(b+1); //���������byte,short,char �Զ�������int���͵�����
		
		System.out.println("b ="+ b);

		b += 20; // b = b+20 �Լ����㣬�Ⱥ���
		�߸�����������������㣬���ǵȺ��ұ�û��������̣������Զ�������			
		System.out.println("b = "+b);       


	}
}
