/**
ʵ�ָ�������ļӣ������ˣ���
this�ؼ��ֵ�ʹ��
�����Ĳ�������
**/
class Demo2 
{
	public static void main(String[] args) 
	{
		Complex c = new Complex();
		// ����������������
		Complex c1 = new Complex(1,2);// 1+2i====4+6i		
		Complex c2 = new Complex(3,4);// 3+4i

		System.out.println(c1);// 30de3c87
		System.out.println(c2);
		// c1+c2 = c3 ===4+6i
        //c.show(c1,c2);
        // ��һ�֣����������������ݵ�ֵ�ô��ݣ����ݵ��Ǳ�����ֵ�������ܸı�
		// �������ڴ��е�����
		int realPart = c1.getReal();// 1 
		System.out.println("δ���÷���ǰ��ʵ��Ϊ��"+realPart);
		c.changeReal(realPart);
		System.out.println("����changReal�������ʵ��Ϊ��"+realPart);

		// �ڶ��֣��������͵����ݴ��ݵ��׵�ַ���������ݸ����׵�ַ��Ӧ�Ķ��з�������
		// �ı��׵�ַ����Ӧ�����ݣ������������Ӧ�����ݿ϶������仯
        c.changeComplex(c1); // ����c1������׵�ַ
		int realPart1 = c1.getReal(); // 100

		System.out.println("����changeComplex�������ʵ��Ϊ��"+realPart1);
         
		// ������������ͣ�String��----�������---���ַ�����������-
		// �������ڶ��ڴ棬����String����������Ϊ�������Կ�����һ�ֻ����������͵Ĳ�������
        String str = "1234";
		c.changeStr(str);
		System.out.println(str);

	}
}
class Complex
{
	private int realPart; // ʵ��
	private int imagePart;// �鲿
	public Complex()
	{
		realPart = 0;
		imagePart = 0;
	}
	public Complex(int realPart,int imagePart)
	{
       this.realPart = realPart;
	   this.imagePart = imagePart;
	}
	public void setReal(int realPart)
	{
      this.realPart = realPart;
	}
	public int getReal()
	{
		return realPart;
	}
	public void setImage(int imagePart)
	{
		this.imagePart = imagePart;
	}
	public int getImage()
	{
		return imagePart;
	}
	// �Զ���toString()����------�����ո����ַ����ĸ�ʽ��ӡ--
	// ��ӡ������ʱ���Զ�����toString()����
//    public String toString()
//    {
// 	   return realPart+"+"+imagePart+"i";
// 	}

	// ������������������ �ӷ����㷨�� ʵ����ʵ����ӣ��鲿���鲿���
	public Complex add(Complex c)
	{
	   Complex result = new Complex();
       result.realPart = this.realPart+c.realPart;
	   result.imagePart = this.imagePart+c.imagePart;
       return result;
	}
	// ��������������� ��a+bi)(c+di)=(ac��bd)+(bc+ad)i.
	public Complex multiply(Complex c)
	{
       Complex result = new Complex();
       result.realPart = this.realPart*c.realPart-this.imagePart*c.imagePart;
	   result.imagePart = this.imagePart*c.realPart+this.realPart*c.imagePart;
	   return result;
	}
	//ר�Ŵ�ӡ�������ķ���
	public void show(Complex c1,Complex c2)
	{
      System.out.println("����������Ӻ�Ľ���ǣ�"+c1.add(c2)); 	
      System.out.println("����������˺�Ľ���ǣ�"+c1.multiply(c2)); 	
	}
	//����ı�ʵ���ķ���
	public void changeReal(int realPart1)
	{
          realPart1 = 100;
	}

	//����ı����ĸ��������ʵ���ķ���
	public void changeComplex(Complex c)// 
	{
          c.realPart = 100; // ���β����ݴ��ݹ����ĸ��������ʵ���ĳ�100
	}

	// ����ı��ַ������͵����ݷ���
	public void changeStr(String str)
	{
         str = "hello world";
	}
}

