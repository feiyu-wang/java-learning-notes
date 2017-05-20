class Demo3 
{
	/***
	算术运算符
	自增，自减 ++ -- 
	赋值运算符 = 
	赋值运算符 与 算数运算符 结合起来使用 += -= *= /= %= 
	***/
	public static void main(String[] args) 
	{
		char ch = 'a';
		ch+=10; // ch = ch + 10;
        int ch_code = ch;
		System.out.println("ch_code="+ch_code);
		ch_code-=10; // 做减法运算
		System.out.println("ch_code="+ch_code);
		ch_code*=10;
		System.out.println("ch_code="+ch_code);
		ch_code/=10;
        System.out.println("ch_code="+ch_code);
		int m = 78; // int类型的数据

		int re_1 = m%5; // 78整除5的余数 
        System.out.println("re_1="+re_1);

		ch+=1; // ch = ch+1=======ch++;

        // 做一次自加运算，相当于自身加1 ，做一次自减运算，相当于自身减一

		// 俩种结合，左结合与右集合
		// ++ -- 运算比 其他运算符的优先级
        System.out.println("================自增自减====================");
		int x = 10;
        int y = ++x; // 左结合：先给变量自身加1，加完之后的结果赋值为整个运算表达式，
		System.out.println("x = "+x); // 11
		System.out.println("y = "+y); // 11

		int z = x++; // 右结合：先将变量的值付给整个运算表达式，赋值完之后再给自身加1
        System.out.println("x="+x); // 12
		System.out.println("z="+z); // 11

		int m1 = (x++)+x;
		System.out.println("x="+x); // 13
		System.out.println("m1="+m1); // 25

		int w = 20;

		int sub_w = w--;
        System.out.println("w="+w); // 19
        System.out.println("sub_w="+sub_w); // 20
		int sub_w1 = --w;
		System.out.println("w="+w);//18
		System.out.println("sub_w1="+sub_w1); // 18
	}
}
