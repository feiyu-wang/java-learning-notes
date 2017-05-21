import java.util.*;
class Five_chess
	{	
	/**  声明一个16行16列的二维数组    */
	static char [] [] boards=new char[16] [16];
	/*    存二维数组的行数和列数     */
	static int rows=16;
	static int cols=16;
	/* 声明变量row_num,col_num,存扫描器输入的行数和列数 */
	static int row_num;
	static int col_num;
	/*  声明变量 white ,black存char类型的棋子字符; */
	/*★☆*/
	static char white='★';
	static char black='☆';
	//new一个文本扫描器
	static Scanner input=new Scanner(System.in);

	/**
	*	1.先按照二维数组的样子画一个棋盘
	*	2.将画好的棋盘打印出来
	*    游戏开始，默认执白子的先落子
	*   3.扫描器获取白子玩家的落子坐标
	*   4.判断行列坐标是否符合要求，不符合 ，则continue 跳出当前循环 白子玩家重新落子，
	*	  符合要求,则将棋盘白子玩家输入的坐标处改为白子,重绘棋盘 ,然后break,跳出白子玩家落子回合。
	*   5.白子落子完毕，通过五子棋输赢规则判断白子是否满足赢得条件,满足 则break，跳出整个循环，游戏结束，否则，黑子玩家落子。
	*   6.同白子玩家 一样 ，输入落子坐标，判断是否符合要求，不符合 ，则continue 跳出当前循环 白子玩家重新落子，
	*     符合要求,则将棋盘黑子玩家输入的坐标处改为黑子,重绘棋盘 ,然后break,跳出黑子玩家落子回合。
	*   7.黑子落子完毕，通过五子棋输赢规则判断黑子是否满足赢得条件,满足 则break，跳出整个循环，游戏结束，否则，白子玩家落子。
	*/ 
	public static void main(String[] args) {
		drawBoard();
		printBoard();
	 while (true) {
		System.out.println("白子：");
		while (true) {
			getCoordinate();
			if (judgePiece(row_num,col_num)) {
				System.out.println("请重新输入:");
				continue;
			}else{
				setPiece(white);
				printBoard();				
				break;
			}
		}
		if (judgeWin(white)) {
			System.out.println("白子赢了");
			break;
		}else{
		System.out.println("黑子：");
		while (true)
			{
			getCoordinate();		
			if (judgePiece(row_num,col_num) ){
				System.out.println("请重新输入:");
				continue;
			}
			else
				{
				setPiece(black);
				printBoard();				
				break;
			}
		}
		if (judgeWin(black)) {
			System.out.println("黑子赢了");
			break;
		}
	 	}
		}
	}
	/**
	 *   1.先按照二维数组的样子画一个棋盘
	 *   drawBoard()通过双for循环对二维数组的行列遍历,数组的第一行和 每行的第一个位置 用1-F的从小到大顺序的字符标记行数和列数,其他位置用╋字符来拼出棋盘的样子
	*/
	public static void drawBoard(){
		char rows_sign='1';
		char cols_sign='1';
		for (int i=0;i<rows ;i++ ) {
			for (int j=0;j<cols ;j++ ) {
				if (i==0&&j>0) {
				   boards[i][j]=rows_sign;
				   rows_sign++;
				   if (rows_sign=='9'+1) 
				   		rows_sign='A';
				   
				}else if (j==0&&i>0) {
				   boards[i][j]=cols_sign;
				   cols_sign++;
				   if (cols_sign=='9'+1) 
				   		cols_sign='A';
				}
				else{
					boards[i][j]='╋';
				}
			}
		}
	}
	/**
	 *	2.将画好的棋盘打印出来
	 * printBoard()将拼出来的棋盘打印出来
	*/
	public static void printBoard(){
		for (int i=0;i<rows ;i++ ) {
			for (int j=0;j<cols ;j++ ) {
				if (i==0&&j>0) {
				  System.out.print(boards[i][j]+" ");
				}else if (i==0&&j==0) {
					 System.out.print("  ");
				}else{
					System.out.print(boards[i][j]);
				}
			}
			System.out.println();
		}
	}
	/**
	 * 3.扫描器获取白子玩家的落子坐标
	 *getCoordinate()用变量存入扫描器输入的行列坐标并返回给全局变量
	*/
	public static void getCoordinate(){
		 System.out.println("请输入坐标X：");
		 int piece_x=input.nextInt();
		 System.out.println("请输入坐标Y：");
		 int piece_y=input.nextInt();
		  col_num=piece_y;
		  row_num=piece_x;
	}
	/**
	 *4.判断玩家落子是否符合要求
	 * judgePiece(int piece_x ,int piece_y)将获取到的玩家落子坐标传入方法中 判断是否符合，并返回对应的判断结果的布尔值
	*/
	public static boolean judgePiece(int piece_x ,int piece_y) {
		if (piece_x<=0||piece_y<=0) {
			System.out.println("输入坐标不能小于0");
			return  true;
		}else if (piece_x>=rows ||piece_y>=rows) {
			System.out.println("输入坐标不能大于16");
			return  true;
		}else if(boards[piece_x][piece_y]!='╋') {
			System.out.println("此处已落子");
			return true;
		}else
			return false;
	}
	/**
	 *5.判断玩家落子是否符合要求
	 *  setPiece(int piece_x,int piece_y,char piece)玩家落子符合要求 将玩家所执黑子或者白子对应的字符传入传入并改变棋盘该位置的字符，printBoard();	重绘棋盘
	*/
	public static void setPiece(char piece){
		 boards[row_num][col_num]=piece;
	}

	/**
	 *6.判断玩家落子落子位置的各个方向是否满足五子连线
	 * getDirection(int piece_changeX,int piece_changeY,char piece)传入落子位置到各个方向依次寻找该玩家相同棋子并且相连的个数
	*/
	public static int getDirection(int piece_changeX,int piece_changeY,char piece)
	{
		int num=0;
		//while循环条件 落子位置到各个方向遍历的位置上如果有该玩家所执棋子 并且 判断各个方向的边界 返回各个方向中找到的最多的棋子数 num.
		while (row_num+piece_changeX<16&&col_num+piece_changeY<16&&row_num+piece_changeX>=1&&col_num+piece_changeY>=1&&boards[row_num+piece_changeX][col_num+piece_changeY]==piece) {
				num++;
				//左右方向
				if (piece_changeX==0) {
					if (piece_changeY>0)
						piece_changeY++;
					else
						piece_changeY--;
				} 
				//竖直方向
				if (piece_changeY==0) {
					if (piece_changeX>0)
						piece_changeX++;
					else
						piece_changeX--;				
				}
				//从左到右，斜方向
				if (piece_changeX!=0&&piece_changeY!=0&&piece_changeX-piece_changeY==0) {
					if (piece_changeX>0) {
						piece_changeX++;
						piece_changeY++;
					}else {
						piece_changeX--;
						piece_changeY--;
					}
				}
				//从右到左，斜方向
				if (piece_changeX!=0&&piece_changeY!=0&&piece_changeX-piece_changeY!=0) {
					if (piece_changeX>0) {
						piece_changeX++;
						piece_changeY--;
					}else {
						piece_changeX--;
						piece_changeY++;
					}
				}
			}
			//System.out.println(num);
			return  num;
	}
	/**
	 *6.判断玩家输赢
	 * judgeWin(char piece)传入玩家所执棋子字符，通过getDirection(int piece_changeX,int piece_changeY,char piece)方法各个方向传入不同的参数返回的值,五子连线
	 *落子位置各个方向找到4与其相同棋子与count=4比较返回一个布尔值,true 则该玩家获胜 
	*/
	public static boolean judgeWin(char piece){
		int count=4;
		if (count<=(getDirection(0,1,piece)+getDirection(0,-1,piece))) 
			return true;
		else if (count<=getDirection(1,0,piece)+getDirection(-1,0,piece)) 
			return true;
		else if (count<=getDirection(1,1,piece)+getDirection(-1,-1,piece)) 
			return true;
		else if (count<=getDirection(1,-1,piece)+getDirection(-1,1,piece)) 
			return true;
		else
			return false;
	}
}
