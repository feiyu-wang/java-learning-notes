import java.util.*;
/**
��ϰ1���Ӽ�������10����������ִ�������������ݣ�����һ��Caculateʵ���࣬
��ʵ��������ȡ10���������ֵ����Сֵ��ƽ��ֵ��
**/
class Demo2 // ִ����
{
	// Ҫʹ��ʵ�����г�Ա�����ͳ�Ա����������������ʵ�����ʵ������
	public static void main(String[] args) 
	{
		int[] num = new int[10];
		for(int i = 0; i<num.length;i++)
		{
		  System.out.println("�������"+(i+1)+"������");
		  num[i] = new Scanner(System.in).nextInt();
		} 
		Caculate c = new Caculate();
		c.getResult(num);
		c.show();
	}
}
/**
Caculateʵ����
**/
class Caculate
{
    // ��Ա�����ͳ�Ա����
	int max;
	int min;
	int sum;
	double mean;
	public void getResult(int[] num)
	{
         max = num[0];
		 min = num[0];
		 for(int i = 0; i<num.length;i++)
		 {
			 if(max<num[i])
			 {
				 max = num[i];
			 }
			 if(min>num[i])
			 {
				 min = num[i];
			 }
			 sum+=num[i];
		 }
		 mean = (double)sum/(double)num.length;
	}

	public void show()
	{
       System.out.println("���ֵ�ǣ�"+max);
       System.out.println("��Сֵ�ǣ�"+min);
       System.out.println("ƽ��ֵ�ǣ�"+mean);
	}
}
