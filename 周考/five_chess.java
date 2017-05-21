import java.util.*;
class Five_chess
	{
	static char [] [] boards=new char[16] [16];
	static int rows=16;
	static int cols=16;
	static int row_num;
	static int col_num;
	static char white='★';
	static char black='☆';
	

	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		drawBoard();
		printBoard();
	 while (true) {
		//输入XY值
		System.out.println("白子：");
		//x y
		while (true) {
			getCoordinate();
			if (judgePiece( row_num,col_num) ) {
				System.out.println("请重新输入:");
				continue;
			}else{
				setPiece(row_num,col_num,white);
				printBoard();				
				break;
			}
		}
		if(whowin(  row_num, col_num,white))
		 {System.out.println("白子赢了");
		break;
		}
		else
		 {	
		System.out.println("黑子：");
		while (true)
			{
			getCoordinate();		
			if (judgePiece(row_num,col_num) ) 
				{
				System.out.println("请重新输入:");
				continue;
			}
			else
				{
				setPiece(row_num,col_num,black);
				printBoard();				
				break;
			}
		}
		if(whowin(row_num,col_num,black)){
			System.out.println("黑色赢了");
			break;
		}
			
	}
	 }
	}
	/*★☆※*/
	public static void drawBoard(){
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
	public static void getCoordinate(){
		 System.out.println("请输入坐标X：");
		 int a=input.nextInt();
		 System.out.println("请输入坐标Y：");
		 int b=input.nextInt();
		  col_num=b;
		  row_num=a;
	}
	public static void setPiece(int a,int b,char c){
		 boards[a][b]=c;
	}
	public static boolean judgePiece(int a ,int b) {
		if (a<=0||b<=0) {
			System.out.println("输入坐标不能小于0");
			return  true;
		}else if (a>=rows ||b>=rows) {
			System.out.println("输入坐标不能大于16");
			return  true;
		}else if(boards[a][b]!='╋') {
			System.out.println("此处已落子");
			return true;
		}else{
			return false;
		}
	}
	public static boolean whowin(int a,int b,char c)
	{
		int straight=0;
		int vertical=0;
		int sideway_x=0;
		int sideway_y=0;
		for(int i =0;i<5;i++)
		{			
			if(b+i<16&&boards[a][b+i]==c)
			{							
				
				straight++;			
			}
			else
			{
				break;
			}
	    }
			for(int i=0;i<5;i++)
			{
				if(b-i>0&&boards[a][b-i]==c)
				{
					
					straight++;
				}
				else
				{
					break;
				}
			}
			for(int i=0;i<5;i++)
			{
				if(a+i<16&&boards[a+i][b]==c)
				{
					
					vertical++;
				}
				else
				{
					break;
				}
			}
			for(int i=0;i<5;i++)
			{
				if(boards[a-i][b]==c&&a-i>0)
				{
					
					vertical++;
				}
				else
				{
					break;
				}
			}

			for(int i=0;i<5;i++)
			{
				if(b+i<16&&(a-i>0&&boards[a-i][b+i]==c))
				{
					sideway_x++;
					
				}
				else
				{
					break;
				}
			}

			for(int i=0;i<5;i++)
			{
				if(a+i<16&&b-i>0&&boards[a+i][b-i]==c)
				{
					sideway_x++;
					
				}
				else
				{
					break;
				}
			}


				for(int i=0;i<5;i++)
			{
				if(a+i<16&&b+i<16&&boards[a+i][b+i]==c)
				{
					sideway_y++;
					
				}
				else
				{
					break;
				}
			}

				for(int i=0;i<5;i++)
			{
				if(a-i>0&&b-i>0&&boards[a-i][b-i]==c)
				{
					sideway_y++;
					
				}
				else
				{
					break;
				}
			}


			if(straight==6||vertical==6||sideway_x==6||sideway_y==6)
		     {return true;
			}
			else
	     	{return false;
			}

	

	}




	
}
