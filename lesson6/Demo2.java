import java.util.*;
class Demo2 
{
	/*****
	�������û���������������
    �ַ�����ʹ�÷�����
	1 ��һ��������������û����Ƿ�����ĸ����

	   ������ ������û����ĳɴ�д

	   �������� �ߵڶ�������

	2 �ڶ����������û����Ƿ��ԡ���"��ʼ��

	3 ���������������ݳ������ڻ�ȡ�Ա�  

	  610681198802152217------18λ�������ڶ������������У���ż����Ů��
     
	  �������� ���У�����������ã�

      �������� ��Ů����Ůʿ����ã�
	*****/

	/****
	����һ����λ����һ����ݣ��ж���һ�������껹��ƽ��
	****/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("������������");
		String name = input.next();
		// �ж��ַ������Ƿ����ĳһ����ĸ---contains("�ַ���")
		// ���ַ���ת���ɴ�д------toUpperCase();
		if(name.contains("s"))
		{
			System.out.println("����s���ַ����Ĵ�д��ʽΪ��"+name.toUpperCase());
			// �������'s'���ַ�����ͬʱ�������ˡ�0��,ȥ���ո�
			// ���������s�����ַ�����ͬʱ��������0�����ĳ�Сд��ʽ
			if(name.endsWith("0")) 
		    {
				System.out.println("ȥ���ո��������ʽΪ��"+name.trim());
			}
			else
			{
                System.out.println("�ĳ�Сд����ʽΪ��"+name.toLowerCase());
			}
		}
		else
		{
		    System.out.println("���������֤���룺");
			String id = input.next();
            
            String id_2 = id.substring(16,17); // substring(int begin,int end) ��������ȡ
			// ĳһ�����ַ�������begin��ʼ��end������������end			
			System.out.println("���֤�����ǣ�"+id);
			System.out.println("���֤����ĵ����ڶ�λ�ǣ�"+id_2);// "1"
			if(name.startsWith("��"))
			{               
				if(Integer.parseInt(id_2)%2==0) // "1"------1%2----Integer��parseInt()�������������ַ���ת��������
				{
                    System.out.println("��Ůʿ�����");				
				}
				else
				{
					System.out.println("�����������");
				}
			}
			else
			{
				System.out.println("δ֪������");
			}
		}

	}
}
