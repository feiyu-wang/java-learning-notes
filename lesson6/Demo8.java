import java.util.*;
// ����һ��ö��
enum MyWeek
{
   // ö���ж��������Χ�ڲ�������---һ��������
   Monday,Tuesday,Wednesday,Thrisday,Friday,Saturday,Sunday;
}

class Demo8 
{
	/**switch��֧  keyֵö�� enum 
	enum -----һ��������������ͣ���ĳһ����Χ�ڵĿ��оٵ���������г���
	***/
	public static void main(String[] args) 
	{
	   	// ����ö�����͵�keyֵ
       
		int key = 10;
        MyWeek myday = MyWeek.Monday; // mydayö�ٵ����----Monday---keyֵ

		switch(myday)
		{
           case Monday:System.out.println("����������һ");break;
		   case Tuesday:System.out.println("���������ڶ�");break;
		   case Wednesday:System.out.println("������������");break;
		   case Thrisday:System.out.println("������������");break;
		   case Friday:System.out.println("������������");break;
		   case Saturday:System.out.println("������������");break;
		   case Sunday:System.out.println("������������");break;		 
		   default:System.out.println("����û���������");
		}

	}
}
