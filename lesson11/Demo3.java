import java.util.*;
class Demo3 
{
	/**
	��ά���飺 һ��ά��ʵ�ʾ���һ��һά���顣��ά���Ƕ��һά������ɵľ���
    �����ڶ�ά���� 
	���壺 Ԫ������[][] ������ = new Ԫ������[3][3];
    ��ֵ�� ������[0][1] = 1; ������[0][2] = 2

	         -x 
		   y ----------

		     0 1 2 3    arr[0] = {0,1,2,3};
 
			 4          arr[1] = {4};

			 5 9 8      arr[2] = {5,9,8};

			------------

    ȡֵ�� ������[��][��] 

	       ����---һά����ĸ����� arr.length

		   ����---ÿһ��һά����ĳ��ȣ� arr[i].length

	һ����ȫ��ȡ����ά�����е����е�����
	for(int i = 0;i<3;i++)
	{
		for(int j = 0; j<4;j++)
		{
			System.out.print(arr[i][j]);
		}
    }

	**/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[][] arr = new int[][]{{0,1,2,3},{4},{5,9,8}};
        printArray(arr);
        System.out.println("�������������������5");
		int m = input.nextInt();
		System.out.println("�������������������5");
		int n = input.nextInt();
		int[][] arr1 = new int[m][n];
		// ��ӡm��m�еĿ�ֵ
		printArray(arr1);
        // ��m-3��n-2�е���ֵ��Ϊ100
		arr1[m-3][n-2] = 100;
        // ��ӡ�޸�֮��Ķ�ά����
		printArray(arr1);

		// һ���Խ����е�Ԫ�����Ϊ10�ķ���
		fill(arr1);
		printArray(arr1);


	}
	/*
	����ά�����е�Ԫ��ȫ��ȡ��
	*/
	public static void printArray(int[][] arr)
	{
      for(int i = 0;i<arr.length;i++) // ��ӡ�ڼ���һά���飬����
      {
		  for(int j = 0;j<arr[i].length;j++)//��ӡһά����
		  {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
	}

	/**
	ģ��fill()---��һά���������ͬ��Ԫ��
    ����ά���鸳��ͬ��Ԫ��
	**/
	public static void fill(int[][] arr1)
	{
        for(int i = 0; i<arr1.length;i++)
		{
           for(int j = 0; j<arr1[i].length;j++)
		   {
			    // Random��---�������������
				// nextInt()����---����2��32�η����ڵ�һ����
                // nextInt(n)����---����n��������n�����ڵ������һ������
                arr1[i][j] = new Random().nextInt(100);
		   }
		}
	}

}
