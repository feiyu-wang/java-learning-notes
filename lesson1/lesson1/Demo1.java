class HelloWorld1 
{
	//注释 -----文字性，用以描述编程思路或者解释说明功能方法
	// 3种 
	// 1 单行注释
    // 一次性多个单行注释 快键键： ctrl + / 
    // 2 /*   */ 多行注释
	// 3 /***   */  文档多行注释   
	// 第一点： class 关键字 ------类头 
	// java开发中所有的程序都必须写在类的内部，基本单元是class    
	// HelloWorld1 ---------自定义的类名----------生成.class 字节码文件
    // {} -----------类体 --------定义的类中具体的代码实现过程
	// main() 方法 ------------------最重要的东西
    // 主方法 ----所有的java程序执行的入口
	// public -----这个方法是公有的，其他的类或者程序可以看到main    
	// static ----静态关键字，参数已经在内存中存在
	// void ------无返回值，出了方法体后没有给外部返回任何东西
	// main -------主方法的关键字-----程序执行的入口只能是一个
	// 在一个类中只能有一个执行入口


	// ()String[] args --------------外部给我的参数数据
	// main{方法体-----执行出结果的程序代码块} 
	public static void main(String[] args) 
	{
		// "" -----------------字符串文本 
        // System类------window系统类---dos命令界面
        // out对象-------输出
		// println() 方法--------- 打印()里面的内容的方法

		System.out.println("Hello World!ashdoiahdsiuahiuws中文~O(∩_∩)O嗯!");
	}

	public static void main()
	{
		System.out.println("good good study ");
	}
}

