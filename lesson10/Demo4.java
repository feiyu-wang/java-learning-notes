class Demo4 
{
	/**
	��������һ������������������С����--����

	�ɴ�С---����

    ���򷽷�һ�� �ٷ�sort()������

	�ŵ㣺java�������ṩ�����򷽷���Ч�����

	ȱ�㣺 ֻ������

	���򷽷���������ð���������Ը�Ƶ�㣩
	
    ð�������㷨���������� ---ǰ��λ�õ������ں���λ���ϵ���

    ԭ������������򣬽����ڵ�����Ԫ�����Ƚϣ���������������
	�����øı�Ԫ�ص�λ�ã����������������򣬽���������Ԫ�ص�λ�û�����

	ð��������Ż��棺��������Ԫ�صĽ�����ʱ��Ҳ����˵˳���Ѿ��źõ�ʱ�򣬲�Ҫ

	�����ظ���ӡ�źõ�������顣���˼·����Ԫ�صķ��������ĵط���һ����ʶ��
   
    ���򷽷����� ѡ������

	�㷨ԭ����һ��Ԫ�����������е�Ԫ�����Ƚϣ�����������򣬽���λ��

	**/
	public static void main(String[] args) 
	{
		int[] arr = {3,1,2,7,5,2198,34,78,99,121,0,56,2,45,23,756,49,99,20,66,88,188,8};  

        System.out.println("===========��ͨð������==============");
        long start =  System.currentTimeMillis();// ð������Ŀ�ʼʱ��
        bubbleSort(arr);
		long end = System.currentTimeMillis();// ð������Ľ���ʱ��
		System.out.println("��ͨð�������ʱ��"+(end-start)+"ms");  
		
		System.out.println("=========�Ż���ð������=============");
        start = System.currentTimeMillis();// �Ż�ð������Ŀ�ʼʱ��
	   	arr = new int[]{3,1,2,7,5,2198,34,78,99,121,0,56,2,45,23,756,49,99,20,66,88,188,8};  
        bubbleSuperSort(arr);
        end = System.currentTimeMillis(); // �Ż�ð������Ľ���ʱ��
	    System.out.println("�Ż�ð�������ʱ��"+(end-start)+"ms");

        arr = new int[]{3,1,2,7,5,2198,34,78,99,121,0,56,2,45,23,756,49,99,20,66,88,188,8};  
		System.out.println("=============ѡ������==============");
		start = System.currentTimeMillis();// ѡ������Ŀ�ʼʱ��
		selectSort(arr);
		end = System.currentTimeMillis(); // ѡ������Ľ���ʱ��
		System.out.println("ѡ�������ʱ��"+(end-start)+"ms");
    }
    
	/**
	ð������
	**/
	public static void  bubbleSort(int[] arr)
	{
		// 3 1 2 7 5 
		//��һ�αȽϣ�  3 2 7 5 1   

		//�ڶ��αȽϣ�  3 7 5 2 1 

		//�����αȽϣ�  7 5 3 2 1 
      
		//���Ƚ�4�γ������
        for(int i = 0; i<arr.length-1;i++)//�õ����������������ִ�м��αȽ�
		{
			for(int j = 0;j<arr.length-i-1;j++)
			{
               //��ѭ����ÿһ�αȽϣ���ȥ�ж��������������㣬Ԫ�ؽ���λ�� 
               if(arr[j]<arr[j+1])
			   {
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = temp;
			   }
			}
			for(int m = 0; m<arr.length;m++)
			{
				System.out.print(arr[m]+" ");
			}
			System.out.println();
		}
	}

	/**
�����Ż���ð��
	**/
    public static void bubbleSuperSort(int[] arr)
	{
		// �Ƿ����Ԫ�ؽ����ı�ʶ����
		boolean flag; // �����������в�����������ô����true,������������false
        for(int i = 0; i<arr.length-1;i++)
		{
			flag = true; // ��һ�αȽϣ�����û�н����жϣ�����û�з�������
			for(int j = 0; j<arr.length-i-1;j++)
			{
               if(arr[j]>arr[j+1])
			   {
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = temp;
				   flag = false;
			   }
			}
			if(flag)
			{
			   //�Ƚ�֮�󣬲�����ֵ�ý�������ô������ѭ��ֹͣ 
               break;
			}
			for(int m = 0;m<arr.length;m++)
			{
				System.out.print(arr[m]+" ");
			}
			System.out.println();
		}
	}

	/**
	ѡ������
	**/
	public static void selectSort(int[] arr)
	{
        // 3,1,2,7,5---ѡ������---����
		
		// �� i ---�Ƚϴ���   j ---  �Ƚ�Ԫ��

		// i = 0  7 1 2 3 5  j = 12017/5/17

		// i = 1  7 5 1 2 3  j = 2 

		// i = 2  7 5 3 1 2  j = 3

		// i = 3  7 5 3 2 1  j = 4
        // �Ƚϴ���
        for(int i = 0; i<arr.length-1;i++)
		{
			for(int j = i+1;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
                    int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			for(int m = 0; m<=arr.length-1;m++)
			{
				System.out.print(arr[m]+" ");
			}
			System.out.println();
		}	
	}
}
