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
	static String piece_x;
	static String piece_y;
	/*  声明变量 white ,black存char类型的棋子字符; */
	/*★☆*/
	static char player;
	static boolean flag;
	//new一个文本扫描器
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		drawBoard();
		printBoard();
		while (true) {
		 	judgePlayer(player);
			System.out.println(flag?"白子：":"黑子：");
			player=flag?'★':'☆';
			System.out.println(player);
			while (true) {
				getCoordinate();
				if (judgePiece(piece_x,piece_y)) {
					//System.out.println("请重新输入:");
					continue;
				}else{
					setPiece(player);
					printBoard();				
					break;
				}
			}
			if(judgeWin(player)){
				System.out.println(flag?"白子赢了":"黑子赢了");
				System.out.println("按S键结束游戏,按其他任意键重新开始游戏");
				String goContinue=input.next();
				if (goContinue.equals("s")) {
					System.out.println("游戏结束");
					break;
				}else{
					System.out.println("重新开始");
					drawBoard();
					printBoard();
					flag=false;
				}
			}
		}
	}
	public static void drawBoard(){
		char rows_sign='1';
		char cols_sign='1';
		for (int i=0;i<rows ;i++ ) {
			for (int j=0;j<cols ;j++ ) {
				if (i==0&&j>0) {
				   boards[i][j]=rows_sign;
				   rows_sign++;
				   if (rows_sign=='9'+1) {
				   		rows_sign='A';
				   }
				}else if (j==0&&i>0) {
				   boards[i][j]=cols_sign;
				   cols_sign++;
				   if (cols_sign=='9'+1) {
				   		cols_sign='A';
				   }
				}
				else
					boards[i][j]='╋';
			}
		}
	}

	public static void printBoard(){
		for (int i=0;i<rows ;i++ ) {
			for (int j=0;j<cols ;j++ ) {
				if (i==0&&j>0) 
				  System.out.print(boards[i][j]+" ");
				else if (i==0&&j==0) 
					 System.out.print("  ");
				else
					System.out.print(boards[i][j]);
			}
			System.out.println();
		}
	}

	public static void getCoordinate(){
		 System.out.println("请输入坐标X：");
		  piece_x=input.next().toUpperCase();
		 System.out.println("请输入坐标Y：");
		  piece_y=input.next().toUpperCase();
		 	int ch=piece_x.charAt(0);
			int ch2=piece_y.charAt(0);
			if (ch>=48&&ch<=57&&ch2>=48&&ch2<=57) {
				row_num=Integer.parseInt(piece_x);
				col_num=Integer.parseInt(piece_y);
			}else if (ch>=65&&ch<=70&&ch2>=65&&ch2<=70) {
				row_num=ch-55;
				col_num=ch2-55;
			}else{
				row_num=ch;
				col_num=ch2;
			}
			System.out.println(row_num+"---------"+col_num);
	}

	public static boolean judgePiece(String x,String y) {
		if (x.length()>1||y.length()>1) {
			System.out.println("请重新输入1~9,或者A~F");
			return true;
		}else{
	    if (row_num<=0||col_num<=0) {
			System.out.println("输入坐标不能小于0");
			return  true;
		}else if (row_num>=rows ||col_num>=rows) {
			System.out.println("输入坐标不能大于F");
			return  true;
		}else if(boards[row_num][col_num]!='╋') {
			System.out.println("此处已落子");
			return true;
		}else{
			return false;
		}
		}
	}
	
	public static void judgePlayer(char player){
		 if (!flag)
		 	flag=true;
		 else
		 	flag=false;
	}

	public static void setPiece(char piece){
		 boards[row_num][col_num]=piece;
	}

	public static int getDirection(int piece_changeX,int piece_changeY,char piece){
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
			return  num;
	}
	
	public static boolean judgeWin(char piece){
		if ((getDirection(0,1,piece)+getDirection(0,-1,piece))>=4)
			return true;
		else if (getDirection(1,0,piece)+getDirection(-1,0,piece)>=4)
			return true;
		else if (getDirection(1,1,piece)+getDirection(-1,-1,piece)>=4)
			return true;
		else if (getDirection(1,-1,piece)+getDirection(-1,1,piece)>=4)
			return true;
		else
			return false;		
	}
}
