
class Demo2 
{
	/**
	���������������ֵ����Сֵ���ͣ�������С�������򣬴Ӵ�С����
	**/
	static int max ; // �������ֵ�ı���
	static double min ;// ������Сֵ�ı���	
	public static void main(String[] args) 
	{
		System.out.println("����int��max="+getMax(8,30,53));
		System.out.println("����double��min = "+ getMax(8.7,45.4,89.2));
	}
	/**
    ���������������ֵ---����int 
	**/
    public static int getMax(int a,int b,int c)
	{
//		if(a>b&&a>c)
//		{
//          max = a;
//		}
//		else if(b>a&&b>c)
//		{
//          max = b;
//		}
//		else
//		{
//		   max = c;
//		}	
//        max = a; //�����һ����������
//		if(b>max)
//		{
//           max = b; 
//		}
//		if(c>max)
//		{
//			max = c;
//		}
        // Math��max()�����Ƚ��������нϵ�һ����������������ͬһ���͵�����
        max = Math.max(Math.max(a,b),c);
		return max;		
	}

    /**
	������double�������ݵ���Сֵ
	**/
	public static double getMax(double a,double b,double c)
	{
        min = a;
		if(b<min)
		{
           min = b;
		}
		if(c<min)
		{
			min = c;
		} 
		return c;
	}    
}

class Demo3
{
	static int temp; //����int����Сֵ
	static int year;
	public static void main(String[] args)
	{
        getMax(23,30,34);
		
	}
	public static void getMax(int a,int b,int c)
	{
       if(a>b)//����a��b��λ��   
	   {
           temp = a;
	       a = b;
	       b = temp;               
	   }
	   if(a>c) //����a��c��λ��  
	   {
		   temp = a;
		   a = c;
		   c = temp;
	   }
	   if(b>c)  // 34 
	   {
		   temp = b;
		   b = c;
		   c = temp;
	   }
	   System.out.println("��С���������˳���ǣ�"+a+"<"+b+"<"+c);
	}

    public 
			return false;
		}
	}
}
