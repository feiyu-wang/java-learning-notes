import java.util.*;
class Demo2 
{
	/**
    复习练习2： 键盘录入信息
	**/    
	public static void main(String[] args) 
	{
		System.out.println("请输入员工的姓名：");
        Scanner input = new Scanner(System.in);
        String name = input.next();
		//System.out.println("输入的员工姓名是："+name);
		System.out.println("请输入员工的年龄：");
		int age = input.nextInt();
		byte by_age = input.nextByte();
		short sh_age = input.nextShort();
        System.out.println("请输入员工的性别：");
        // 布尔类型的数据不能与其他类型的数据进行转换
		boolean gender = input.nextBoolean(); // nextBoolean()方法只能扫描布尔类型数据
	    String str_gender = "";
        // 输入的布尔类型数据是true的时候，你最终打印的结果是男，如果是false的话，最终打印女
        if(gender)
		{
           str_gender = "男";
		}
		else
		{
           str_gender = "女";
		}
        System.out.println("请输入员工的薪资待遇：");
		double salary = input.nextDouble();
        System.out.println("请输入员工的血型："); // AB A B O 
		String blondType = input.next();

		System.out.println("员工的姓名是："+name+"年龄是："+age
			+"性别是："+str_gender+"薪资待遇是："+salary+"血型是："+blondType);

	}
}
