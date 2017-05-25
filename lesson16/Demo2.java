/**
实现复数对象的加，减，乘，除
this关键字的使用
函数的参数传递
**/
class Demo2 
{
	public static void main(String[] args) 
	{
		Complex c = new Complex();
		// 定义俩个复数对象
		Complex c1 = new Complex(1,2);// 1+2i====4+6i		
		Complex c2 = new Complex(3,4);// 3+4i

		System.out.println(c1);// 30de3c87
		System.out.println(c2);
		// c1+c2 = c3 ===4+6i
        //c.show(c1,c2);
        // 第一种：基本数据类型数据的值得传递，传递的是变量的值，并不能改变
		// 变量在内存中的数据
		int realPart = c1.getReal();// 1 
		System.out.println("未调用方法前的实部为："+realPart);
		c.changeReal(realPart);
		System.out.println("调用changReal方法后的实部为："+realPart);

		// 第二种：引用类型的数据传递的首地址，放置数据根据首地址对应的堆中放置数据
		// 改变首地址所对应的数据，本身对象所对应的数据肯定发生变化
        c.changeComplex(c1); // 传递c1对象的首地址
		int realPart1 = c1.getReal(); // 100

		System.out.println("调用changeComplex方法后的实部为："+realPart1);
         
		// 特殊的数据类型：String类----存放数据---在字符串缓冲区中-
		// 并不是在堆内存，所以String类型数据做为参数可以看做是一种基本数据类型的参数传递
        String str = "1234";
		c.changeStr(str);
		System.out.println(str);

	}
}
class Complex
{
	private int realPart; // 实部
	private int imagePart;// 虚部
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
	// 自定义toString()方法------对象按照给定字符串的格式打印--
	// 打印对象名时会自动调用toString()方法
//    public String toString()
//    {
// 	   return realPart+"+"+imagePart+"i";
// 	}

	// 俩个复数对象相加求和 加法运算法则： 实部与实部相加，虚部与虚部相加
	public Complex add(Complex c)
	{
	   Complex result = new Complex();
       result.realPart = this.realPart+c.realPart;
	   result.imagePart = this.imagePart+c.imagePart;
       return result;
	}
	// 俩个复数对象相乘 （a+bi)(c+di)=(ac－bd)+(bc+ad)i.
	public Complex multiply(Complex c)
	{
       Complex result = new Complex();
       result.realPart = this.realPart*c.realPart-this.imagePart*c.imagePart;
	   result.imagePart = this.imagePart*c.realPart+this.realPart*c.imagePart;
	   return result;
	}
	//专门打印计算结果的方法
	public void show(Complex c1,Complex c2)
	{
      System.out.println("复数对象相加后的结果是："+c1.add(c2)); 	
      System.out.println("复数对象相乘后的结果是："+c1.multiply(c2)); 	
	}
	//定义改变实部的方法
	public void changeReal(int realPart1)
	{
          realPart1 = 100;
	}

	//定义改变具体的复数对象的实部的方法
	public void changeComplex(Complex c)// 
	{
          c.realPart = 100; // 将形参数据传递过来的复数对象的实部改成100
	}

	// 定义改变字符串类型的数据方法
	public void changeStr(String str)
	{
         str = "hello world";
	}
}

