import  java.util.*;
//账户
class Account{
  public  long id; //账户
  public  String passWord;//密码
  public  String name;//姓名
  public  String passId;//身份证号
  public  double balance;//余额
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
    //if (passWord.length()==6) {
      this.passWord=passWord;
    /*}else{
      this.passWord=null;
      System.out.println("密码必须是6位");
    }*/
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
    //if (passId.length()==18) {
      this.passId=passId;
    // }else{
    //  this.passId=null;
    //  System.out.println("身份证号必须是18位");
    // }
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
/**/
class Bank extends Account{
	public  static Account [] account=new Account[10];
	public static  int count;
  public  int type;
	 public void setType(int type){
    this.type=type;
  }

  public int getType(){
    return type;
  }
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
			setId(id);
			if (id==0) {
				System.out.println("您的输入有误，请重新输入：");
			}else{
				break;
			}
		}
		while (true) {

			System.out.println("请输入您的账户密码：");
			String passWord=new Scanner(System.in).next();
			setPassWord(passWord);
			if (passWord!=null) {
				break;
			}else{
				System.out.println("您的密码输入有误，请重新输入：");
			}
		}
		System.out.println("请输入您的姓名：");
		String name=new Scanner(System.in).next();
		setName(name);
		while (true) {
			System.out.println("请输入您的身份证号：");
			String passId=new Scanner(System.in).next();
			setPassId(passId);
			if (passId==null) {
				System.out.println("您的输入有误，请重新输入：");
			}else{
				break;
			}
		}
		while (true) {
			System.out.println("请选择您要办理的账户类型：0(储蓄账户)或者1(信用卡账户)");
			int type=new Scanner(System.in).nextInt();
			setType(type);
			if (type==0||type==1) {
				break;
			}else{
				System.out.println("您的密码输入有误，请重新输入：");
			}
		}
		if (type==0) {
			balance=0;
		}else{
			balance=10000;
		}
    setBalance(balance);
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
		System.out.println("账户号码:"+a[index].id+"\n"+"账户密码:"+a[index].passWord+"\n"+"姓名："+a[index].name+"\n"+"身份证号："+a[index].passId+"\n"+"余额："+a[index].balance+"\n");//"账户密码"+a.passWord "姓名："+a.name "身份证号："+a.passId
	}	
}

class Demo{
	public static void main(String[] args) {
	Bank b=new Bank();
}

}