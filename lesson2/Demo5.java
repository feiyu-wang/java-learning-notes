class Demo5 
{
	/**
	 空指针异常的解决
	**/
	public static void main(String[] args) 
	{
		//定义一个字符串类型的变量，让计算机开辟内存空间，放入字符文本数据

		String name = "awhhsaiudiuhy";
        
		// 计算字符串长度的方法 ---------length() 

        int length = name.length();  // 0100

		System.out.println("name的长度是："+length);

		// 再定义一个字符串类型的变量
        
		name = "how:are:you"; // 字符串长度中包含空格这个字符

        length = name.length();

		System.out.println("name的长度是："+length);

        // 将一个长串的字符串文本根据固定分割符（：）分割成三个短的字符串

        // string1 --------how 

		// string2 --------are 

		// string3 --------you 
        
		// 字符串分割的方法----------split()
        String[]  str = name.split(":"); // 分割后的一组字符串

		System.out.println(str); // 一组字符串首地址

		System.out.println(str[0]); // 一个首地址上放置的第一个元素 how

		System.out.println(str[1]); // 首地址上的第二个元素 are 
		System.out.println(str[2]); // 首地址上的第三个元素 you          
	}
}
