import java.util.*;
class Demo4 
{
	/**
	�Ӽ�������0��1000�����������λ���ĺͣ�����ø�ֵ�Ķ�����λ���ʽ��
	����345�Ľ����3+4+5��12��
	**/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("������һ������0������");
			long num = input.nextLong();
			if(num>0)
			{
               System.out.println("�����͵Ľ���ǣ�"+getSum(num)); 
			}
			else
			{
                break;
			}
		}
	}
	public static int getSum(long num)
	{
        //��ס���������num��ֳɸ���λΪ�����֣��ͺ�
		int sum = 0;
        long d = 0; // ÿһ�β�ֵõ�������
		while(num>0)
		{
            d = num%10; // 5  4  3  2 
			sum+=d;
			num/=10;
		}
		return sum;
	}
}
