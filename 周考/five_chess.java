import java.util.*;
class Five_chess{
	static char [] [] boards=new char[16] [16];
	static int rows=16;
	static int cols=16;
	static int row_num;
	static int col_num;
	static char white='★';
	static char black='☆';
	static int countR=0;
	static int countL=0;
	static int countU=0;
	static int countD=0;
	static int countRx=0;
	static int countLx=0;
	static int countRxx=0;
	static int countLxx=0;
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		drawBoard(rows,cols);
		printBoard(rows,cols);
	 while (true) {
		//输入XY值
		System.out.println("白子：");
		//x y
		while (true) {
			getCoordinate();
			//System.out.println("===============================:");
			//System.out.println(row_num+"==================:"+col_num);
			if (judgePiece( row_num,col_num) ) {
				System.out.println("请重新输入:");
				continue;
			}else{
				setPiece(row_num,col_num,white);
				printBoard(rows,cols);
				break;
			}
		}
		//白棋 落子 判定输赢;
		if(whoWin(boards,row_num,col_num,white)){
			System.out.println("赢了:");
			break;
		}else{
		//落子
		System.out.println("黑子：");
			while (true) {
				getCoordinate();
				//System.out.println("===============================:");
				//System.out.println(row_num+"==================:"+col_num);
				if (judgePiece(row_num,col_num) ) {
					System.out.println("请重新输入:");
					continue;
				}else{

					setPiece(row_num,col_num,black);
					printBoard(rows,cols);
					break;
				}
			}
			if(whoWin(boards,row_num,col_num,black)){
				System.out.println("赢了:");
				break;
			}
		}
	}

	}
	/*★☆※*/
	public static void drawBoard(int rows,int cols){
		char rowss='1';
		char colss='1';
		for (int i=0;i<rows ;i++ ) {
			for (int j=0;j<cols ;j++ ) {
				if (i==0&&j>0) {
				   boards[i][j]=rowss;
				   rowss++;
				   if (rowss=='9'+1) {
				   		rowss='A';
				   }
				}else if (j==0&&i>0) {
				   boards[i][j]=colss;
				   colss++;
				   if (colss=='9'+1) {
				   		colss='A';
				   }
				}
				else{
					boards[i][j]='╋';
				}
			}
		}
	}
	public static void printBoard(int rows,int cols){
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
	public static void getCoordinate(){
		 System.out.println("请输入坐标X：");
		 int a=input.nextInt();
		 System.out.println("请输入坐标Y：");
		 int b=input.nextInt();
		  col_num=b;
		  row_num=a;
		  countR=0;
		  countL=0;
		  countU=0;
		  countD=0;
		  countRx=0;
		  countLx=0;
		  countRxx=0;
		  countLxx=0;
	}
	public static void setPiece(int a,int b,char c){
		 boards[a][b]=c;
	}
	public static boolean judgePiece(int a ,int b) {
		if (a<=0||b<=0) {
			System.out.println("输入坐标不能小于0");
			return  true;
		}else if (a>rows ||b>rows) {
			System.out.println("输入坐标不能大于16");
			return  true;
		}else if(boards[a][b]!='╋') {
			System.out.println("此处已落子");
			return true;
		}else{
			return false;
		}
	}
	public static boolean whoWin(char [] [] arr,int a ,int b,char c){
			//判断是否是五子连线
			/*int i=1;
			while (i<5) {
				if (arr[a][b+i]==c&&b+i<=15) {
					countR++;
					System.out.println(countR+"向右找");
				}else{
					i=1;
					if (arr[a][b+countR-i]==c&&b+countR-i>=1) {
						countL++;
						System.out.println(countL+"向左找"+i);
					}else{
						System.out.println("向左找了"+i+"没有了");
						break;
					}	
					//break;
					/*continue;
				}
				i++;	
			}*/
		//左右
		for (int i=1;i<5 ;i++ ) {
				if (arr[a][b+i]==c&&b+i<=15) {
					countR++;
					System.out.println(countR+"向右找");
				}else{
					break;
				}				
				}
		for (int j=1;j<5 ;j++ ) {
				if (arr[a][b+countR-j]==c&&b+countR-j>=1) {
					countL++;
					System.out.println(countL+"向左找"+j);
				}else{
					//System.out.println("向左找了"+j+"没有了");
					break;
				}				
				}
		//上下
		for (int i=1;i<5 ;i++ ) {
				if (arr[a+i][b]==c&&a+i<=15) {
					countU++;
					System.out.println(countU+"向下找");
				}else{
					break;
				}				
				}
		for (int j=1;j<5 ;j++ ) {
				if (arr[a+countU-j][b]==c&&a+countU-j>=1) {
					countD++;
					System.out.println(countD+"向上找"+j);
				}else{
					//System.out.println("向上找了"+j+"没有了");
					break;
				}				
				}
		//左到右下斜线		
		for (int i=1;i<5 ;i++ ) {
				if (arr[a+i][b+i]==c&&b+i<=15) {
					countRx++;
					System.out.println(countRx+"向斜右找");
				}else{
					break;
				}				
				}
		for (int j=1;j<5 ;j++ ) {
				if (arr[a-j][b+countRx-j]==c&&b+countRx-j>=1) {
					countRxx++;
					System.out.println(countRxx+"向斜左找"+j);
				}else{
					//System.out.println("向斜左找了"+j+"没有了");
					break;
				}				
				}
		//右到左下斜线
		for (int i=1;i<5 ;i++ ) {
				if (arr[a+i][b-i]==c&&a+i<=15) {
					countLx++;
					System.out.println(countLx+"向斜右左 下找");
				}else{
					break;
				}				
				}
		for (int j=1;j<5 ;j++ ) {
				if (arr[a+countLx-j][b+j]==c&&b+j<=15) {
					countLxx++;
					System.out.println(countLxx+"向左右·上找"+j);
				}else{
					//System.out.println("向左右·上找"+j+"没有了");
					break;
				}				
				}

		if (countR==4||countL==4||countU==4||countD==4||countRx==4||countLx==4||countRxx==4||countLxx==4) {
			System.out.println("五子");
			return  true;
		}else {
			return false;
		}
	}
}