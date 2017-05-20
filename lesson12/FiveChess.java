class FiveChess 
{
	/**
	五子棋项目实战

	1 画棋盘 ----16行16列的字符型数组

	2 给棋盘添加行列号----改变第0行第0列的二维数组元素的赋值

	  1 ~9 A ~ F 

	**/
	static char[][] boards = new char[16][16];
	static int rows = boards.length;// 棋盘的行数---16
	static int cols = boards[0].length; // 棋盘的列数---16
	public static void main(String[] ar1gs) 
	{
		System.out.println("============华信五子棋=============");
		System.out.println();
		System.out.println();
		drawBoards();
		printBoards();
	}
	/**
	给二维数组赋一个相同的值，画棋盘
	// +  中文输入法 v9 ---翻页到最后一页╋----制表符----占俩个字母的位置
	**/
	public static void drawBoards()
	{
		char ch1 = '1'; // 行数的初始值
		for(int i = 0; i<rows;i++)
		{
			for(int j = 0; j<cols;j++)
			{	
				if(i==0&&j>0) // 第0行并且不是第0列
				{
					boards[i][j] = ch1;
					ch1++;//行数从数字1转变到数字9后，从“：”跳转到字母A 
					if(ch1=='9'+1)
					{
						ch1 = 'A';
					}
				}
				else
				{
				    boards[i][j] = '╋';
			    }
			}
		}
	}
    /**
    将画好棋盘打印的方法
	**/
	public static void printBoards()
	{
		for(int i = 0; i<rows;i++)
		{
			for(int j = 0; j<cols;j++)
			{
				if(i==0&&j>0)
				{
				  System.out.print(boards[i][j]+" ");
				}
				else
				{
				  System.out.print(boards[i][j]);
				}
			}
			System.out.println();
		}
	}
}

