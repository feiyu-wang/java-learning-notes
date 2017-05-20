/*选择题：

1、Java 之所以可以实现夸平台，是因为Java程序在运行时使用了（ ）//-------------C

A  JDK ( Java Development Kit ) 

B  JRE ( Java Runtime Environment ) 

C  JVM ( Java Virtual Machine ) 

D  OS ( Operating System )

2  下列不是java语言的中的关键字是：（  ）//----------------C
A  public B Static C main D void

3  下列哪个是合法的 byte 类型的数据: （  ）  //--------------B
A  128   B   127   C  -129   D   (int)-130

4  以下程序中最终输出 i 的值是：(   ) //==============B
      int i = 999;    
      i--;    
      ++i; 
    System.out.println( i++ );
A  998 B 999 C 1000  D 1001

5 在 JDK 1.7 中，对于 switch 语句 ，switch 后面的 ( ) 中不可以是哪种类型： // -----------G  H 
A  byte   B char   C  short   D  int   E String    F 枚举   G  float   H  double
	
6 下列语句序列执行后，k 的值是（    ）  //////////////C
  
int  i=10, j=18, k=30;
  switch(j-i)
  {
     case 8: k++;   //31
     case 9:k+=2;  //33
      case 10:k+=3;  //36
     default :k/=j;  //36/18=2
  }

A．31   
B．3 C. 2 D．33

7 下列语句序列执行后，k的值是 （    ）------------------------------------------//B
 
   int m=3,n=6,k=0;
   
while((m++)<(--n))   3<5     m4  n5  k=1-----  4< 4不成立
  {
      ++k;
  }
  
 A．0  
B．1  C．2   
D．3

8  输出什么   
publicclass Test2 
{
    static boolean foo(char c) 
    {
       System.out.print(c);
       return true;
    }
    public static void main(String[] argv) 
   {
       int i = 0;
       for (foo('A'); foo('B') && (i < 2); foo('C')) {
           i++;
           foo('D');
       }
    }
}

 //         ABDCBDCB

9  下列的赋值语句中，编译正确的是（）。 //         B
A．	byte a = -129;
B．	char b = 97;
C．	float c = 48.7;
D．	char d = 'abc';


10 下列赋值语句中错误的是（）。          //           C
A．	char c1=’A’;
B．	char c2= 65;
C．	char c3=’abc’;
D．	char c4=’\u0041’;
 
11  以下程序的输出结果正确的是。(  )              //======A  
public class test {
	public static void main(String args[]) {        x0 y2  z1   x1 y1 z2     
		int x=1,y=1,z=1;
		if(x--==1&&y++==1||z++==1)
		System.out.println("x="+x+",y="+y+",z="+z);
	}
}
A．	X=0,y=2,z=1;
B．	X=1,y=2,z=1;
C．	X=0,y=1,z=1;
D．	X=0,y=2,z=2

12  以下程序的输出结果为 ( c )
public class test {
	public static void main (String args[]) {
		int i = 0xFFFFFFF1;    //负数
		int j = ~i;           二进制0000-1110/ 2+4+6=14
		System.out.println(j);
	}
}
A.	0
B.	1
C.	14
D.	-15

填空题

1. 三目运算符的3个操作数中，第一个操作数的类型必须是（  布尔类型 ）型的。

2. 
在Java的基本数据类型中，char型采用Unicode编码方案，每个Unicode码占用（  2）字节内存空间，这样，无论是中文字符还是英文字符，都是占用（  2 ）字节内存空间。

3. 假设x=13，y=4，则表达式x%y!=0的值是(  true  )，其数据类型是(  布尔类型  )。                                                                                          

4. Java语言规定标识符是由(  数字 )、( 字母 )、( $ )和( _ )组成的字符序列，
长度不限；又规定第一个字符不能是(数字   )，并区分字母的大小写。


判断题：

1   数据由高类型转换到低类型时候，采用强制转换，数据精度要受到损失。   错误

2   静态方法只能处理静态变量。                                       正确

3   程序在编译通过以后，仍然可能出现运行时错误和逻辑错误。            正确

4   在Java Application中如果没有定义main()方法，则程序不能编译。     错误

5   continue语句可以跳出循环，继续向下执行。                        错误

6   Integer和int是同一种类型的数据。                               错误
*/

/*编程题：

1：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利
润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数。（if嵌套）

2：从键盘输入0～1000的整数，求各位数的和，并求得该值的二进制位表达式。例如345的结果是3+4+5＝12。

3：从键盘上输入3个整数，求3个整数的和、积、最大值、最小值、平均值，将以上3个数字，从小到大排列，然后再从大到小排列。

4： 月中天数： 输入年份：2016 输入月份2 
      结果： 2016年是闰年，2月有29天

5： 打印出10行10列的等腰三角形

6： 使用do-while循环：输出询问“我爱你，嫁给我吧？”，选择“你喜欢我吗？(y/n):"，
       如果输入为y则打印”我们形影不离“，若输入为n,则继续询问

7： 百分制分数查询 能够查询到80分到90分的学生成绩(swicth来写)

8： 计算a+aa+aaa+aaaa+......+a....a其中a的值是0到9的任意一个数字，从键盘输入n。n个数相加

9： 编写一个Java程序在屏幕上输出1！+2！+3！+……+10！的和。

10:  用户名密码加密，请输入用户名（String）类型，输入密文对输入的用户名进行加密，请输入

   密码（String）类型，输入密文对密码进行加密，并将加密后的用户名和密码解密回原文*/



 /*选择题 答案：

1.C     2.C      3.B      4.B     5.G H  6.C      7.B       8.   ABDCBDCB       9.B         10.C      11.A        12 C*/

/*题1*/
import  java.util.*;
 class  Profit_sum{
     static int bonus=0;
     static int profit_num;
     static Scanner inputV=new Scanner(System.in);
     public static void main(String[] args) {
      while (true) {
      //得到利润总额；
       getProfit();
       //判断是否数据是否合理；
         if(!judgeProfit(profit_num)){
            continue;
         }
         System.out.println(profit_num);
          getBonus( profit_num);
          System.out.println("停止查询，按S键;继续查询按其他键");
          String str=inputV.next();
          if (str.equals("s")) 
              break;
       }
     }
      public static int getProfit(){
       System.out.println("请输入正确的利润金额");
        profit_num=inputV.nextInt();
        return  profit_num;
     }
     public static boolean judgeProfit(int profit_num ){
        if (profit_num>0) 
           return true;
           else 
           return false ; 
     }
     public static void getBonus(int profit_num){
         switch (profit_num/100000){
           default:bonus+=(profit_num-1000000)*(0.01);profit_num=1000000;
           case 9:
           case 8:
           case 7:
           case 6:bonus+=(profit_num-600000)*(0.015);profit_num=600000;
           case 5:
           case 4:bonus+=(profit_num-400000)*(0.03);profit_num=400000;
           case 3:
           case 2:bonus+=(profit_num-200000)*(0.05);profit_num=200000;
           case 1:bonus+=(profit_num-100000)*(0.075);profit_num=100000;
           case 0:bonus+=profit_num*(0.10);
          System.out.println("奖金总额是："+bonus);
          bonus=0;
       }
     }
 }
class  Profit_sum_1{
    static int bonus=0;
    static int profit_num;
    static Scanner inputV=new Scanner(System.in);
    public static void main(String[] args) {
     while (true) {
      //得到利润总额；
       getProfit();
       //判断是否数据是否合理；
         if(!judgeProfit(profit_num)){
            continue;
         }
         System.out.println(profit_num);
          getBonus( profit_num);
          System.out.println("停止查询，按S键;继续查询按其他键");
          String str=inputV.next();
          if (str.equals("s")) 
              break;
       }
    
     }
     public static int getProfit(){
       System.out.println("请输入正确的利润金额");
        profit_num=inputV.nextInt();
        return  profit_num;
     }
     public static boolean judgeProfit(int profit_num ){
        if (profit_num>0) 
           return true;
           else 
           return false ; 
     }
     public static void getBonus(int profit_num){
         switch (profit_num/100000) {
           default:bonus+=(profit_num-1000000)*(0.01);profit_num=1000000;
           case 9:
           case 8:
           case 7:
           case 6:bonus+=(profit_num-600000)*(0.015);profit_num=600000;
           case 5:
           case 4:bonus+=(profit_num-400000)*(0.03);profit_num=400000;
           case 3:
           case 2:bonus+=(profit_num-200000)*(0.05);profit_num=200000;
           case 1:bonus+=(profit_num-100000)*(0.075);profit_num=100000;
           case 0:bonus+=profit_num*(0.10);
         }
          System.out.println("奖金总额是："+bonus);
          bonus=0;
     }

 }
/* if嵌套*/
 class  If_sum{
     public static void main(String[] args) {
       Scanner inputV=new Scanner(System.in);
       System.out.print("请输入利润金额: ");
       int profit_num=inputV.nextInt();
       int  bonus=0;
       int new_profit=profit_num/100000;
       if (profit_num>0){
         if (profit_num>1000000) {
              bonus+=(profit_num-1000000)*(0.01)+400000*0.015+200000*0.03+200000*0.05+100000*0.075+10000;
              profit_num=1000000;
              
           }else if (profit_num>=600000) {
              bonus+=(profit_num-600000)*(0.015)+200000*0.03+200000*0.05+100000*0.075+10000;
              profit_num=600000;
             
          }else if (profit_num>=400000) {
            bonus+=(profit_num-400000)*(0.03)+200000*0.05+100000*0.075+10000;
              profit_num=400000;
           
          }else if (profit_num>=200000) {
                 bonus+=(profit_num-200000)*(0.075)+100000*0.075+10000;
              profit_num=200000;
          }else if (profit_num>=100000) {
               bonus+=(profit_num-100000)*(0.075)+10000;
                profit_num=100000;
            }else{
               bonus+=profit_num*(0.10);
             }
          System.out.println("奖金总额是："+bonus);
       }else{
          System.out.println("请输入正确的利润金额");
       }
     }
 }
/*class Demo {
  public static void main(String[] args) {
    System.out.println(10000);//0.1 100000 
    System.out.println(17500);//0.075 200000
    System.out.println(27500);//0.005 2-4
    System.out.println(33500);//0.003 4-6
    System.out.println(39500);//0.0015 6-10
  }
}*/

/*题2*/
/*2：从键盘输入0～1000的整数，求各位数的和，并求得该值的二进制位表达式。例如345的结果是3+4+5＝12。*/
 class   Examine2{
    public static void main(String[] args) {
      Scanner inputV=new Scanner(System.in);
      System.out.print("请输入一个0~1000的整数：");
      while (true) {
         int radom_num=inputV.nextInt();
         if (radom_num>=0&&radom_num<=1000) {
            int new_sum=0;
            String str_num="";
            str_num+=radom_num;
            int inum=str_num.length();
            for (int j=0;j<inum;j++) {
                new_sum+=Integer.parseInt(str_num.substring(j,j+1));
              }
            System.out.println("radom_num的二进制表达式为："+Integer.toBinaryString(radom_num));
            System.out.println("sum的各个位数相加的结果为："+new_sum);
            break;
         }else{
            System.out.print("输入有误，请重新输入：");
         }
      }
    }
 }
  class   Examine2_1{
    static int new_sum;
    public static void main(String[] args) {
      Scanner inputV=new Scanner(System.in);
      System.out.print("请输入一个0~1000的整数：");
        while (true) {
         int radom_num=inputV.nextInt();
         if (radom_num>=0&&radom_num<=1000) {
            System.out.println("sum的各个位数相加的结果为："+getSum(radom_num));
            break;
         }else{
            System.out.print("输入有误，请重新输入：");
         }
      }
    }
    static int getSum(int num){
        while (num>0) {
           new_sum+=num%10;
            num/=10;
        }
        return new_sum;
    }
 }
/*题3*从键盘上输入3个整数，求3个整数的和、积、最大值、最小值、平均值，
将以上3个数字，从小到大排列，然后再从大到小排列。*/
class Examine3{
  public static void main(String[] args) {
    Scanner inputV=new Scanner(System.in);
    System.out.println("请输入三个整数");
    int intNum1=inputV.nextInt();
    int intNum2=inputV.nextInt();
    int intNum3=inputV.nextInt();
    int sum=0;//求和初始化;
    sum=intNum1+intNum2+intNum3;
    int average=sum/3;
    int ride_num=intNum1*intNum2*intNum3;
    System.out.println(" 这三个数的和是:"+sum);
    System.out.println(" 这三个数的积是:"+ride_num);
    System.out.println(" 求这三个数的平均值:"+average);
    compareNum(intNum1,intNum2,intNum3);
  }
  //从小到大排的方法
  public static void compareNum(int a,int b,int c){
    if (a>b) {
        int iNum=a;
        a=b;
        b=iNum;
    }
    else if (a>c) {
        int jNum=c;
        a=c;
        c=jNum;
    }
     else if (b>c) {
      int kNum=b;
      b=c;
      c=kNum;
    } 
    System.out.println(" 求这三个数的最大值:"+c);
    System.out.println(" 求这三个数的最小值:"+a);
    System.out.println(" 从小到大排列:"+a+","+b+","+c);
    System.out.println(" 从大到小排列:"+c+","+b+","+a);
  }
}
/*class Examine3_1{
  static max,min;
  public static void main(String[] args) {
    Scanner inputV=new Scanner(System.in);
    System.out.println("请输入三个整数");
    int intNum1=inputV.nextInt();
    int intNum2=inputV.nextInt();
    int intNum3=inputV.nextInt();
    int sum=0;//求和初始化;
    sum=intNum1+intNum2+intNum3;
    int average=sum/3;
    int ride_num=intNum1*intNum2*intNum3;
    System.out.println(" 这三个数的和是:"+sum);
    System.out.println(" 这三个数的积是:"+ride_num);
    System.out.println(" 求这三个数的平均值:"+average);
    compareNum(intNum1,intNum2,intNum3);
  }
  //从小到大排的方法
  public static void compareNum(int a,int b,int c){
    max=Math.max(Math.max.(a,b),c);
    min=Math.main(Math.min.(a,b),c);
    System.out.println(" 求这三个数的最大值:"+max);
    System.out.println(" 求这三个数的最小值:"+a);
    System.out.println(" 从小到大排列:"+a+","+b+","+c);
    System.out.println(" 从大到小排列:"+c+","+b+","+a);
  }
}*/
/*4： 月中天数： 输入年份：2016 输入月份2 
      结果： 2016年是闰年，2月有29天*/
class Examine4{
  public static void main(String[] args) {
    Scanner inputV=new Scanner(System.in);
    System.out.print("输入年份：");
    boolean iNum1=false;
    boolean iNum2=false;
    int year=inputV.nextInt();
     if (year%4==0&&year%100!=0||year%400==0){
          System.out.println(year+"是闰年");
          iNum1=true;
         }else{
          System.out.println(year+"是平年");
          iNum1=false;
         }
        System.out.print("输入月份：");
        while (true) {
              int month=inputV.nextInt();
              if (month>=0&&month<=12) {
                switch (month) {
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  case 8:
                  case 10:
                  case 12:System.out.println(iNum1?year+"是闰年,"+month+"月有31天":year+"是平年,"+month+"月有31天");break;
                  case 4:
                  case 6:
                  case 9:
                  case 11:System.out.println(iNum1?year+"是闰年,"+month+"月有30天":year+"是平年,"+month+"月有30天");break;
                  case 2: System.out.println(iNum1?year+"是闰年,2月有29天":year+"是平年,2月有28天");break;
                  default:System.out.println("");
                }
                break;
              }else{
                  System.out.println("请重新输入正确的月份");
              }
        }
    }
}

class Examine4_1{
  //static int year;
  static Scanner inputV=new Scanner(System.in);
  static int year;
  static boolean isLeapYear=year%4==0&&year%100!=0||year%400==0;
  static int month;
  static int day;
  public static void main(String[] args) {
    while (true) {
       System.out.println("输入年份：如2016");
      //输入年份
      getYear();
    //判断是否合法
     
    if (!judgeYear(year)) {
        System.out.println("请输入合法输入年份：如2016");
        continue;
    }
    System.out.print("输入月份：");
    getMonth();
    while (true) {
       if (!judgeMonth(month)) {
         System.out.println("请重新输入正确的月份");
          getMonth();
          }else{
            break;
          }
    }
    getDate(isLeapYear);
    System.out.println(year+(isLeapYear?"是闰年,":"是平年,")+month+"有"+day+"天");
    System.out.println("停止查询，按S键;继续查询按其他键");
    String str=inputV.next();
    if (str.equals("s")) 
         break;
    }
  }
     static int getYear(){
           year=inputV.nextInt();
          return year;
    }
     static int getMonth(){
          month=inputV.nextInt();
          return month;
    }
    static boolean judgeYear(int year){
          if (year>9999||year<1000)
                return false;
            else
                return true;
          
    }
    static boolean judgeMonth(int month){
          if (month>12||month<1)
                return false;
            else
                return true;
          
    }
     static int getDate(boolean isLeapYear){
           switch (month) {
                  case 1:
                  case 3:
                  case 5:
                  case 7:
                  case 8:
                  case 10:
                  case 12:day=31;break;
                  case 4:
                  case 6:
                  case 9:
                  case 11:day=30;break;
                  case 2:day=isLeapYear?29:28;break;
                  default:System.out.println("");
           }
           return day;
      }
  
    
}

/*5： 打印出10行10列的等腰三角形*/
class  Examine5  
{    
    public static void main(String[] args)   
    {  
        for (int i=0;i<10;i++) 
        {  
            for (int j=0;j<=10;j++)  
            {   
              if (j+i<10) 
                  System.out.print(" ");
              else
                  System.out.print("★");   
            }  
            System.out.println();  
        }  
  
    }  
  }
class  Examine5_1  
{    
    public static void main(String[] args)   
    {  
       /* for (int i=0;i<10;i++) 
        {  
            for (int j=0;j<=10;j++)  
            {   
              if (j+i<10) 
                  System.out.print(" ");
              else
                  System.out.print("★");   
            }  
            System.out.println();  
        }  */
  
    }
    //public static   
  }
/*6： 使用do-while循环：输出询问“我爱你，嫁给我吧？”，选择“你喜欢我吗？(y/n):"，
       如果输入为y则打印”我们形影不离“，若输入为n,则继续询问*/

class  Examine6_1
{    
    public static void main(String[] args)   
    {  
        Scanner inputV=new Scanner(System.in);  
       do{
          System.out.println("我爱你，嫁给我吧？");
          System.out.println("你喜欢我吗？(yes/no)");
          String question=inputV.next();
          if (question.contains("yes")) {
            System.out.println("我们形影不离");
            break;
          }

       }while(true);
  
    }  
  } 

class  Examine6  
{    
    static  Scanner inputV=new Scanner(System.in);  
    public static void main(String[] args)   
    {  
       getAnswer();
  
    } 
    public  static void getAnswer() {
        do{
          System.out.println("我爱你，嫁给我吧？");
          System.out.println("你喜欢我吗？(yes/no)");
          String question=inputV.next();
          if (question.contains("yes")) {
            System.out.println("我们形影不离");
            break;
          }

       }while(true);
    } 
  } 

 /* 7： 百分制分数查询 能够查询到80分到90分的学生成绩(swicth来写)*/

 class  Examine7  
{    
    public static void main(String[] args)   
    {  
        Scanner inputV=new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        while (true) {
          int score_num=inputV.nextInt();
          if (score_num>100||score_num<0) {
            System.out.print("您输入的成绩有误，请重新输入：");
          }else{
             switch (score_num) {
              case 80:
              case 81:
              case 82:
              case 83:
              case 84:
              case 85:
              case 86:
              case 87:
              case 88:
              case 89:
              case 90:System.out.println("您的成绩是："+score_num+"分");break;
              default:System.out.println("您的成绩不在查询范围之内，抱歉。");
            }
            break;
          }
        }
  
    }  
  } 
class  Examine7_1  
{    
    static int score_num;
    static Scanner inputV=new Scanner(System.in);
    public static void main(String[] args)   
    {  
        while (true) {
          intScore(score_num);
          if (!trueScore(score_num)) {
            System.out.println("您输入的成绩有误，请重新输入：");
          }else{
            getScore(score_num);
           
             System.out.println("停止查询，按S键;继续查询按其他键");
             String str=inputV.next();
              if (str.equals("s")) 
                   break;
          }
        }
  
    }
    public  static void intScore(int score){
        System.out.print("请输入你的成绩：");
          score_num=inputV.nextInt();
        }
    public  static boolean trueScore(int score){
          if (score_num>100||score_num<0) 
              return false;
          else
              return true;
        }
    public static void getScore(int score) {
       switch (score_num) {
              case 80:
              case 81:
              case 82:
              case 83:
              case 84:
              case 85:
              case 86:
              case 87:
              case 88:
              case 89:
              case 90:System.out.println("您的成绩是："+score_num+"分");break;
              default:System.out.println("您的成绩不在查询范围之内，抱歉。");
            }
    }  
} 
/*8： 计算a+aa+aaa+aaaa+......+a....a其中a的值是0到9的任意一个数字，从键盘输入n。n个数相加*/
 /* 1
    2+22
    3+33+333
    4+44+444+4444*/
class Examine8{
    static  Scanner inputV=new Scanner(System.in);
    static int sum ;
    static int radom_num ;
    static int sum_all;
    public static  void main(String[] args) {
    
     while (true) {
      radom_num();
      if (!true_num(radom_num)) {
            System.out.print("输入有误，请重新输入： ");
          }else{
            getSum(radom_num);
             System.out.println("停止计算，按S键;继续输入计算其他值请按其他键");
             String str=inputV.next();
              if (str.equals("s")) 
                   break;
          }
     }
    
    }
    public  static void radom_num(){
         System.out.print("请输入一个0到9任意一个数字： ");
          radom_num=inputV.nextInt();
        }
    public  static boolean true_num(int radom_num){
          if (radom_num>=0&&radom_num<=9) 
              return true;
          else
              return false;
        }
    public static void getSum(int radom_num) {
       for (int i=0;i<radom_num ;i++) {
             sum+=Math.pow(10,i)*radom_num;
             sum_all+=sum;

            System.out.println(sum_all);
          }
          System.out.println("n个数相加的和是："+sum_all);
    }  
}

/*9： 编写一个Java程序在屏幕上输出1！+2！+3！+……+10！的和。*/
  /*   1+1*2+1*2*3+1*2*3*4+1*2*3*4*5 */
  /*  1                           1
      1*2                         2
      1*2*3                       6
      1*2*3*4                    24 
      1*2*3*4*5                  120 
      1*2*3*4*5*6                720
      1*2*3*4*5*6*7              5040 */
class Examine9{
  public static void main(String[] args) {
    int sum=1;
    int sum_all=0;
    for (int i=1;i<=10 ;i++ ) {
       sum*=i;
       sum_all+=sum;
       System.out.println("1+1*2+1*2*3+1*2*3*4+1*2*3*4*5...+1*2*3....*10的和="+sum_all);    
    }
     System.out.println("1+1*2+1*2*3+1*2*3*4+1*2*3*4*5...+1*2*3....*10的和="+sum_all);    
  }
}

/*10:  用户名密码加密，请输入用户名（String）类型，输入密文对输入的用户名进行加密，请输入

   密码（String）类型，输入密文对密码进行加密，并将加密后的用户名和密码解密回原文*/
class Examine10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        String msg = "";
         while(true){
             if(flag){
                 msg = "加密";
                 flag = false;
             }else{
                 msg = "解密";
                flag = true;
            }
           System.out.println("请输入需要"+msg+"的字符串：");
            String password = scan.nextLine();
            char[] array = password.toCharArray();
            for(int i = 0;i<array.length;i++){
                array[i] = (char)(array[i]^20000);
             }
             System.out.println(msg+"结果如下：");
            System.out.println(new String(array));
         }         
     }
 }