import  java.util.*;
//账户
class Account{
	private  long id; //账户
	private  String passWord;//密码
	private  String name;//姓名
	private  String passId;//身份证号
	private  double balance;//余额
	public Account(){
		this.id=0;
		this.passWord=null;
		this.name=null;
		this.passId=null;
		this.balance=0.0;
	}
	public Account(long id,String passWord,String name,String passId,double balance){
		this.id=id;
		this.passWord=passWord;
		this.passId=passId;
		this.name=name;
		this.balance=balance;
	}
	public void setId(long id){
		this.id=id;
	}
	public long getId(){
		return id;
	}
	public void setPassWord(String passWord){
			this.passWord=passWord;
	}

	public String getPassWord(){
		return passWord;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}
	public void setPassId(String passId){
			this.passId=passId;
	}

	public String getPassId(){
		return passId;
	}
	public void setBalance(double balance){
    this.balance=balance;
	}
	public double getBalance(){
		return  balance;
	}

	
}

class Bank extends Account{
  public int type;
  public Account [] [] account=new Account[2][10];
  public int count1;
  public int count2;
  public int trueNum;
  public Bank(){
  	while (true) {
  	  System.out.println("=======================================================================");
	  System.out.println("===========================请选择您要选择的业务========================");
	  System.out.println("=====================1.开户，2.登录 ，3.查询,4.存款，5.取款=====================");
	  System.out.println("=======================================================================");
			int chose=new Scanner(System.in).nextInt();
			switch (chose) {
				case 1: openAccount(); break;
				case 2: signIn(); break;
				case 3:showInfo(type,account,trueNum); break;
				default:;		
			}
		if (chose>2||chose<=0) {
				System.out.println("再见");
				break;
			}
		}
  }
  public void setType(int type){
		this.type=type;
	}

	public int getType(){
		return type;
	}

	public int judgeType(){
		int type=0;
		while (true) {
			System.out.println("请选择账户类型：0(储蓄账户)或者1(信用卡账户)");
			int setType=new Scanner(System.in).nextInt();
			if (type==0||type==1) {
				type=setType;
				break;
			}else{
				System.out.println("您的输入有误，请重新输入：");
				continue;
			}
		}
		return type;
	}
	public long judgeId(String s,String choice){
		long id=0; //返回id值
		trueNum=-1;//获取登录匹配的账户的i值
		int signCount=0;//输入登录账户错误次数;
		while (true) {
	      System.out.println("请输入您的账户号码：");
	      long setId=new Scanner(System.in).nextLong();
	      int length=type==0?count1:count2;
	      int count=type==0?count1:count2;
	      signCount++;
	      //避免账号重复
	      if (s.equals("register")) {
	      	System.out.println("count====1======="+count);
	      if (count!=0) {
	      	System.out.println("count=====2======"+count);
	      	boolean flag=false;
	     	for (int i=0;i<length;i++) {
	     		System.out.println("setId==="+setId+"=================account[type][i].getId()"+account[type][i].getId());
	     		if (setId==account[type][i].getId()) {
	     			System.out.println("账号已存在");
	     			flag=true;
	     			break;
	     		}else{
	     			flag=false;
	     		}
	     	}
	     	if (flag) {
	     		continue;
	     	}else{
	     		id=setId;
	     		break;
	     	}
	     }else{
	     	System.out.println("count=====3======"+count);
	     	id=setId;
	     	break;
	     }
	 	}else if (s.equals("signIn")) {
	 		System.out.println("type==========="+type);
	      	for (int i=0;i<length;i++ ) {
	      		System.out.println("setId==="+setId+"=================account[type][i].getId()"+account[type][i].getId());
				if (setId==account[type][i].getId()) {
	       			trueNum=i;
	        		break;
				}
	     	 }
	     	if (trueNum==-1&&signCount!=3) {
	     	 	System.out.println("账户不存在============+signCount========="+signCount);
	     	 	continue;
	     	 }else if(trueNum==-1&&signCount==4){
	     	 	System.out.println("错误次数已达上限，返回到开始");
	     	 	continue;
	     	 }else{
	     	 	System.out.println("账户存在");
	     	 	break;
	     	 }
	 	 }
	    }
	    return id;
	}
	public String judgePassWord(String s,String choice){
		String passWord=null;
		while (true) {
	      System.out.println("请输入您的账户密码：");
	      String passWord1=new Scanner(System.in).next();
	      if (s.equals("register")) {
	      	System.out.println("请再次输入您的账户密码：");
	      	String passWord2=new Scanner(System.in).next();
		       //if (passWord1.length()==6) {
		      	  if (passWord1.equals(passWord2)) {
			      	  passWord=passWord1;
			      	  break;
			      }else{
			      	System.out.println("两次密码输入不一致,请重新输入：");
			      	continue;
			      }
		     /* }else{
		      	System.out.println("密码必须是6位");
		      	continue;
		      }*/
	      }else if(s.equals("signIn")){
	      	if (passWord1.equals(account[type][trueNum].getPassWord())){
	      		if (choice.equals("showInfo")) {
	      			showInfo(type,account,trueNum);
	      		}else if(choice.equals("deposit")){
	      			deposit(trueNum,account,type);
	      		}else if(choice.equals("withdraw")){
	      			withdraw(trueNum,account,type);
	      		}else{
	      			System.out.println("登录成功");
	      			break;
	      		}
				//showInfo();
				trueNum=0;
	      		break;
	      	}else{
	      		System.out.println("您的密码输入有误，请重新输入：");
				continue;
	      	}
	      }
	    }
	    return passWord;
	}
	public String judgepassId(){
		String passId=null;
		 while (true) {
		      System.out.println("请输入您的身份证号：");
		      String setPassId=new Scanner(System.in).next();
		     /* if (setPassId.length()!=18) {
		        System.out.println("您的输入有误，请重新输入：");
		      }else{*/
		      	passId=setPassId;
		        break;
		      //}
		    }
		    return passId;
		}
	   public Account [] openAccount(){
	   	 int type=judgeType();
	   	//设置账户类型
	   	 setType(type);
	    //设置账户号码
	    setId(judgeId("register",null));
	    //设置账户密码 
	    setPassWord(judgePassWord("register",null));
	    //设置姓名
	    System.out.println("请输入您的姓名：");
	    setName(new Scanner(System.in).next());
	    //设置身份证信息
   		 setPassId(judgepassId());
   		 //设置账户余额
   		 int balance=type==0?0:10000;
   		 setBalance(balance);
   		 //创建一个账户的实例对象
   		 int count=type==0?count1:count2;
		 account[type][count]=new Account(getId(),getPassWord(),getName(),getPassId(),getBalance());
	    //打印账户信息
		System.out.println(Arrays.toString(account[type]));
		int add=type==0?count1++:count2++;
		return account[type];    
	  }



  	public void signIn(){
  		int type=judgeType();
  		judgeId("signIn",null);
		//judgePassWord("signIn",null);   
	}  
	//存款
	public void deposit(int index,Account[] [] a,int type){
		System.out.println("请输入存款金额：");
		double newBalance=a[type][index].getBalance();
		newBalance+=new Scanner(System.in).nextDouble();
		a[type][index].setBalance(newBalance);
		System.out.println("存储成功！您的信息如下");
	}
	//取款
	public void withdraw(int index,Account [] [] a,int type){
		while (true) {
			System.out.println("请输入取款金额：");
			double newBalance=a[type][index].getBalance();
			newBalance-=new Scanner(System.in).nextDouble();
			if (newBalance<0) {
				System.out.println("余额不足,请重新输入");
			}else{
				a[type][index].setBalance(newBalance);
				System.out.println("取款成功！您的信息如下");
				break;
			}
		}
	}
  public void showInfo(int type,Account [][] a,int num){
  		int setType=judgeType();
  		judgeId("signIn","showInfo");
		//judgePassWord("signIn","showInfo");
		System.out.println("账户号码:"+a[type][num].getId()+"\n"+"账户密码:"+a[type][num].getPassWord()+"\n"+"姓名："+a[type][num].getName()+"\n"+"身份证号："+a[type][num].getPassId()+"\n"+"余额："+a[type][num].getBalance()+"\n");//"账户密码"+a.passWord "姓名："+a.name "身份证号："+a.passId
	}	
}
class Demo{
	  public static void main(String[] args) {
	  Bank b=new Bank();
	}

}