class Demo5 
{
	/**
	 ��ָ���쳣�Ľ��
	**/
	public static void main(String[] args) 
	{
		//����һ���ַ������͵ı������ü���������ڴ�ռ䣬�����ַ��ı�����

		String name = "awhhsaiudiuhy";
        
		// �����ַ������ȵķ��� ---------length() 

        int length = name.length();  // 0100

		System.out.println("name�ĳ����ǣ�"+length);

		// �ٶ���һ���ַ������͵ı���
        
		name = "how:are:you"; // �ַ��������а����ո�����ַ�

        length = name.length();

		System.out.println("name�ĳ����ǣ�"+length);

        // ��һ���������ַ����ı����ݹ̶��ָ���������ָ�������̵��ַ���

        // string1 --------how 

		// string2 --------are 

		// string3 --------you 
        
		// �ַ����ָ�ķ���----------split()
        String[]  str = name.split(":"); // �ָ���һ���ַ���

		System.out.println(str); // һ���ַ����׵�ַ

		System.out.println(str[0]); // һ���׵�ַ�Ϸ��õĵ�һ��Ԫ�� how

		System.out.println(str[1]); // �׵�ַ�ϵĵڶ���Ԫ�� are 
		System.out.println(str[2]); // �׵�ַ�ϵĵ�����Ԫ�� you          
	}
}
