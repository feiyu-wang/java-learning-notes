import  java.util.*;
import  java.math.*;
//账户
class Account{
	public  long id; //账户
	public  String passWord;//密码
	public  String name;//姓名
	public  String passId;//身份证号
	public  double balance;//余额
  public int type ;
	public Account(){
		this.id=0;
		this.passWord=null;
		this.name=null;
		this.passId=null;
		this.balance=0.0;
		this.type=0;
	}
	public Account( int type,long id,String passWord,String name,String passId,double balance){
		this.type=type;
		this.id=id;
		this.passWord=passWord;
		this.passId=passId;
		this.name=name;
		this.balance=balance;
	}
	public void setId(long id,int index,Account [] a){
		 a[index].id=id;
	}
	public long getId(int index,Account [] a){
		return  a[index].id;
	}
	public void setPassWord(String passWord,int index,Account [] a){
		//if (passWord.length()==6) {
			 a[index].passWord=passWord;
		/*}else{
			this.passWord=null;
			System.out.println("密码必须是6位");
		}*/
	}

	public String getPassWord(int index,Account [] a){
		return a[index].passWord;
	}
	public void setName(String name,int index,Account [] a){
		 a[index].name=name;
	}

	public String getName(int index,Account [] a){
		return  a[index].name;
	}
	public void setPassId(String passId,int index,Account [] a){
		//if (passId.length()==18) {
			 a[index].passId=passId;
		// }else{
		// 	this.passId=null;
		// 	System.out.println("身份证号必须是18位");
		// }
	}

	public String getPassId(int index,Account [] a){
		return  a[index].passId;
	}
	public void setBalance(double balance,int index,Account [] a){
		if (a[index].type==0&& a[index].balance>=0) {
			 a[index].balance=balance;
		}else if ( a[index].type==1&& a[index].balance>=0) {
			 a[index].balance=balance;
		}else{		
		 a[index].balance=-1;
		}
	}
	public double getBalance(int type,int index,Account [] a){
		return  a[index].balance;
	}
	public  void setType(int type,int index,Account [] a){
		a[index].type=type;
	}
	public  int getType(int index,Account [] a){
		return a[index].type;
	}
	/*public String toString(){
		return "账户类型："+type+"\n"+"账户号码:"+id+"\n"+"账户密码:"+passWord+"\n"+"姓名："+name+"\n"+"身份证号："+passId+"\n"+"余额："+balance;
	}*/
	//存款
	public void deposit(int index,Account [] a){
		System.out.println("请输入存款金额：");
		 a[index].balance+=new Scanner(System.in).nextDouble();
     System.out.println("deposit.index="+index);
		System.out.println("存储成功！您的信息如下");
	}
	//取款
	public void withdraw(int index,Account [] a){
		while (true) {
			System.out.println("请输入取款金额：");
			 a[index].balance-=new Scanner(System.in).nextDouble();
      System.out.println("withdraw.index="+index);
			if (this.balance==-1) {
				System.out.println("余额不足,请重新输入");
			}else{
				System.out.println("取款成功！您的信息如下");
				break;
			}
		}
	}
}
//储蓄账户
class SavingAccount extends Bank{
  public  SavingAccount() {
		while (true) {
      System.out.println("请选择您要选择的业务：1.开户，2.登录 ，按其他键退出");
      System.out.println(count+"-----------");
      int chose=new Scanner(System.in).nextInt();
      switch (chose) {
        case 1: openAccount(); break;
        case 2: signIn(); break;
      /*  case 3: deposit(); break;
        case 4: withdraw(); break;*/
        default:;   
      }
    if (chose>=5||chose<=0) {
        System.out.println("再见");
        break;
      }
    }
	}

  public Account openAccount(){
    account[count]=new  Account();
    while (true) {
      System.out.println("请输入您的账户号码：");
      long id=new Scanner(System.in).nextLong();
      setId(id,count,account);
      if (account[count].id==0) {
        System.out.println("您的输入有误，请重新输入：");
      }else{
        break;
      }
    }
    while (true) {
      System.out.println("请输入您的账户密码：");
      String passWord=new Scanner(System.in).next();
      setPassWord(passWord,count,account);
      if (account[count].passWord!=null) {
        break;
      }else{
        System.out.println("您的密码输入有误，请重新输入：");
      }
    }
    System.out.println("请输入您的姓名：");
    String name=new Scanner(System.in).next();
    setName(name,count,account);
    while (true) {
      System.out.println("请输入您的身份证号：");
      String passId=new Scanner(System.in).next();
      setPassId(passId,count,account);
      if (account[count].passId==null) {
        System.out.println("您的输入有误，请重新输入：");
      }else{
        break;
      }
    }
    setType(0,count,account);
    balance=0;
    setBalance(balance,count,account);
    System.out.println(count+"---------"+Arrays.toString(account));
    System.out.println("开户成功，您的信息如下：");
    showInfo(count,account);
    count++;
    return account[count];    
  }


    //登录
  public void signIn(){
    System.out.println(count+"---------"+Arrays.toString(account));
      int j=0;
      while (j<3) {
      int trueNum=100;
      System.out.println("请输入您的账户号码：");
      long id=new Scanner(System.in).nextLong();
      System.out.println("count===="+count);
      for (int i=0;i<=count-1;i++ ) {
          
        if (id==account[i].id) {
           trueNum=i;
          System.out.println(trueNum+"++++++++");
          while(true){
              System.out.println("请输入您的账户密码：");
              String passWord=new Scanner(System.in).next();
              if (passWord.equals(account[trueNum].passWord)) {
                  System.out.println("登录成功！存款请按1，取款请按2");
                  String iNum=new Scanner(System.in).next();
                  if (iNum.equals("1")) {
                    deposit(trueNum,account);
                    showInfo(trueNum,account);

                  }else if (iNum.equals("2")) {
                    withdraw(trueNum,account);
                    //setBalance(account[trueNum].balance,trueNum,account);
                    showInfo(trueNum,account);
                  }else{
                    System.out.println("再见");
                  }
                break;
              }else{
                System.out.println("您的密码输入有误，请重新输入：");
                continue;
              }
            }
            break;
          }
      }
      j++;
      if (trueNum==100) {
        System.out.println("您的账户输入有误，请重新输入：");
      }else{
        break;
      }
    }
  }  
}
//信用卡账户
class CreditAccount extends Bank{

	public  CreditAccount() {
		while (true) {
      System.out.println("请选择您要选择的业务：1.开户，2.登录 ，按其他键退出");
      System.out.println(count+"-----------");
      int chose=new Scanner(System.in).nextInt();
      switch (chose) {
        case 1: openAccount(); break;
        case 2: signIn(); break;
      /*  case 3: deposit(); break;
        case 4: withdraw(); break;*/
        default:;   
      }
    if (chose>=5||chose<=0) {
        System.out.println("再见");
        break;
      }
    }
	}

public Account openAccount(){
    account[count]=new  Account();
    while (true) {
      System.out.println("请输入您的账户号码：");
      long id=new Scanner(System.in).nextLong();
      setId(id,count,account);
      if (account[count].id==0) {
        System.out.println("您的输入有误，请重新输入：");
      }else{
        break;
      }
    }
    while (true) {
      System.out.println("请输入您的账户密码：");
      String passWord=new Scanner(System.in).next();
      setPassWord(passWord,count,account);
      if (account[count].passWord!=null) {
        break;
      }else{
        System.out.println("您的密码输入有误，请重新输入：");
      }
    }
    System.out.println("请输入您的姓名：");
    String name=new Scanner(System.in).next();
    setName(name,count,account);
    while (true) {
      System.out.println("请输入您的身份证号：");
      String passId=new Scanner(System.in).next();
      setPassId(passId,count,account);
      if (account[count].passId==null) {
        System.out.println("您的输入有误，请重新输入：");
      }else{
        break;
      }
    }
    setType(1,count,account);
    balance=10000;
    setBalance(balance,count,account);
    System.out.println(count+"---------"+Arrays.toString(account));
    System.out.println("开户成功，您的信息如下：");
    showInfo(count,account);
    count++;
    return account[count];    
  }


    //登录
  public void signIn(){
    System.out.println(count+"---------"+Arrays.toString(account));
      int j=0;
      while (j<3) {
      int trueNum=100;
      System.out.println("请输入您的账户号码：");
      long id=new Scanner(System.in).nextLong();
      System.out.println("count===="+count);
      for (int i=0;i<=count-1;i++ ) {
          
        if (id==account[i].id) {
           trueNum=i;
          System.out.println(trueNum+"++++++++");
          while(true){
              System.out.println("请输入您的账户密码：");
              String passWord=new Scanner(System.in).next();
              if (passWord.equals(account[trueNum].passWord)) {
                  System.out.println("登录成功！请输入取款金额");
                    withdraw(trueNum,account);
                    showInfo(trueNum,account);
                break;
              }else{
                System.out.println("您的密码输入有误，请重新输入：");
                continue;
              }
            }
            break;
          }
      }
      j++;
      if (trueNum==100) {
        System.out.println("您的账户输入有误，请重新输入：");
      }else{
        break;
      }
    }
  }  

}

class Bank extends Account{
	public  static Account [] account=new Account[10];
	public static  int count;

	
	public Bank() {
		while (true) {
			System.out.println("请选择您要选择的业务：1.开户，2.登录 ，按其他键退出");
      System.out.println(count+"-----------");
			int chose=new Scanner(System.in).nextInt();
			switch (chose) {
				case 1: openAccount(); break;
				case 2: signIn(); break;
			/*	case 3: deposit(); break;
				case 4: withdraw(); break;*/
				default:;		
			}
		if (chose>=5||chose<=0) {
				System.out.println("再见");
				break;
			}
		}
	}
	//开户
	/*public  long id; //账户
	  public  String passWord;//密码
	  public  String name;//姓名
	  public  String passId;//身份证号
	  public  double balance;//余额
	*/
	public Account openAccount(){
    account[count]=new  Account();
		while (true) {
			System.out.println("请输入您的账户号码：");
			long id=new Scanner(System.in).nextLong();
			setId(id,count,account);
			if (account[count].id==0) {
				System.out.println("您的输入有误，请重新输入：");
			}else{
				break;
			}
		}
		while (true) {

			System.out.println("请输入您的账户密码：");
			String passWord=new Scanner(System.in).next();
			setPassWord(passWord,count,account);
			if (account[count].passWord!=null) {
				break;
			}else{
				System.out.println("您的密码输入有误，请重新输入：");
			}
		}
		System.out.println("请输入您的姓名：");
		String name=new Scanner(System.in).next();
		setName(name,count,account);
		while (true) {
			System.out.println("请输入您的身份证号：");
			String passId=new Scanner(System.in).next();
			setPassId(passId,count,account);
			if (account[count].passId==null) {
				System.out.println("您的输入有误，请重新输入：");
			}else{
				break;
			}
		}
		while (true) {
			System.out.println("请选择您要办理的账户类型：0(储蓄账户)或者1(信用卡账户)");
			int type=new Scanner(System.in).nextInt();
			setType(type,count,account);
			if (type==0||type==1) {
				break;
			}else{
				System.out.println("您的密码输入有误，请重新输入：");
			}
		}
		if (account[count].type==0) {
			balance=0;
		}else{
			balance=10000;
		}
    setBalance(balance,count,account);
		System.out.println(count+"---------"+Arrays.toString(account));
		System.out.println("开户成功，您的信息如下：");
		showInfo(count,account);
    count++;
		return account[count];		
	}
	//登录
	public void signIn(){
		System.out.println(count+"---------"+Arrays.toString(account));
      int j=0;
      while (j<3) {
      int trueNum=100;
      System.out.println("请输入您的账户号码：");
      long id=new Scanner(System.in).nextLong();
      System.out.println("count===="+count);
			for (int i=0;i<=count-1;i++ ) {
          
				if (id==account[i].id) {
           trueNum=i;
          System.out.println(trueNum+"++++++++");
					while(true){
							System.out.println("请输入您的账户密码：");
							String passWord=new Scanner(System.in).next();
							if (passWord.equals(account[trueNum].passWord)) {
                  System.out.println(account[trueNum].balance+"-------------");
                if (type==0) {
									System.out.println("登录成功！存款请按1，取款请按2");
									String iNum=new Scanner(System.in).next();
									if (iNum.equals("1")) {
										deposit(trueNum,account);
                    //setBalance(account[trueNum].balance,trueNum,account);
										showInfo(trueNum,account);

									}else if (iNum.equals("2")) {
										withdraw(trueNum,account);
                    //setBalance(account[trueNum].balance,trueNum,account);
										showInfo(trueNum,account);
									}else{
										System.out.println("再见");
									}
								}else {
									withdraw(trueNum,account);
                   //setBalance(account[trueNum].balance,trueNum,account);
									showInfo(trueNum,account);
								}
								break;
							}else{
								System.out.println("您的密码输入有误，请重新输入：");
								continue;
							}
						}
            break;
					}
      }
      j++;
      if (trueNum==100) {
        System.out.println("您的账户输入有误，请重新输入：");
      }else{
         //System.out.println("错误次数已达三次，再见！");
        break;
      }
		}
	}  
	
	public void showInfo(int index,Account [] a){
		System.out.println("账户类型："+a[index].type+"\n"+"账户号码:"+a[index].id+"\n"+"账户密码:"+a[index].passWord+"\n"+"姓名："+a[index].name+"\n"+"身份证号："+a[index].passId+"\n"+"余额："+a[index].balance+"\n");//"账户密码"+a.passWord "姓名："+a.name "身份证号："+a.passId
	}	
}

class Demo{
	public static void main(String[] args) {
	Bank b=new Bank();
}

}