class Demo3 
{
	/***
	���������
	�������Լ� ++ -- 
	��ֵ����� = 
	��ֵ����� �� ��������� �������ʹ�� += -= *= /= %= 
	***/
	public static void main(String[] args) 
	{
		char ch = 'a';
		ch+=10; // ch = ch + 10;
        int ch_code = ch;
		System.out.println("ch_code="+ch_code);
		ch_code-=10; // ����������
		System.out.println("ch_code="+ch_code);
		ch_code*=10;
		System.out.println("ch_code="+ch_code);
		ch_code/=10;
        System.out.println("ch_code="+ch_code);
		int m = 78; // int���͵�����

		int re_1 = m%5; // 78����5������ 
        System.out.println("re_1="+re_1);

		ch+=1; // ch = ch+1=======ch++;

        // ��һ���Լ����㣬�൱�������1 ����һ���Լ����㣬�൱�������һ

		// ���ֽ�ϣ��������Ҽ���
		// ++ -- ����� ��������������ȼ�
        System.out.println("================�����Լ�====================");
		int x = 10;
        int y = ++x; // ���ϣ��ȸ����������1������֮��Ľ����ֵΪ����������ʽ��
		System.out.println("x = "+x); // 11
		System.out.println("y = "+y); // 11

		int z = x++; // �ҽ�ϣ��Ƚ�������ֵ��������������ʽ����ֵ��֮���ٸ������1
        System.out.println("x="+x); // 12
		System.out.println("z="+z); // 11

		int m1 = (x++)+x;
		System.out.println("x="+x); // 13
		System.out.println("m1="+m1); // 25

		int w = 20;

		int sub_w = w--;
        System.out.println("w="+w); // 19
        System.out.println("sub_w="+sub_w); // 20
		int sub_w1 = --w;
		System.out.println("w="+w);//18
		System.out.println("sub_w1="+sub_w1); // 18
	}
}
