import java.util.*;
class Demo2 
{
	/**
    ��ϰ��ϰ2�� ����¼����Ϣ
	**/    
	public static void main(String[] args) 
	{
		System.out.println("������Ա����������");
        Scanner input = new Scanner(System.in);
        String name = input.next();
		//System.out.println("�����Ա�������ǣ�"+name);
		System.out.println("������Ա�������䣺");
		int age = input.nextInt();
		byte by_age = input.nextByte();
		short sh_age = input.nextShort();
        System.out.println("������Ա�����Ա�");
        // �������͵����ݲ������������͵����ݽ���ת��
		boolean gender = input.nextBoolean(); // nextBoolean()����ֻ��ɨ�貼����������
	    String str_gender = "";
        // ����Ĳ�������������true��ʱ�������մ�ӡ�Ľ�����У������false�Ļ������մ�ӡŮ
        if(gender)
		{
           str_gender = "��";
		}
		else
		{
           str_gender = "Ů";
		}
        System.out.println("������Ա����н�ʴ�����");
		double salary = input.nextDouble();
        System.out.println("������Ա����Ѫ�ͣ�"); // AB A B O 
		String blondType = input.next();

		System.out.println("Ա���������ǣ�"+name+"�����ǣ�"+age
			+"�Ա��ǣ�"+str_gender+"н�ʴ����ǣ�"+salary+"Ѫ���ǣ�"+blondType);

	}
}
