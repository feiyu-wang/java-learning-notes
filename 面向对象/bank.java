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
		// 	this.passId=null;
		// 	System.out.println("身份证号必须是18位");
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
	public void deposit(int index,Account[] [] a,int type){
		System.out.println("请输入存款金额：");
		 a[type][index].balance+=new Scanner(System.in).nextDouble();
		System.out.println("存储成功！您的信息如下");
	}
	//取款
	public void withdraw(int index,Account [] [] a,int type){
		while (true) {
			System.out.println("请输入取款金额：");
			a[type][index].balance-=new Scanner(System.in).nextDouble();
			if (this.balance==-1) {
				System.out.println("余额不足,请重新输入");
			}else{
				System.out.println("取款成功！您的信息如下");
				break;
			}
		}
	}
}
//储蓄卡账户
class SavingAccount extends Bank{
	public  SavingAccount() {
    }
}
//信用卡账户
class CreditAccount extends Bank{
	public  CreditAccount() {

    }
}
class Bank extends Account{
  public int type;
  public Account [] [] account=new Account[2][10];
  public int count1;
  public int count2;
  public Bank(){
  	while (true) {
	  System.out.println("请选择您要选择的业务：1.开户，2.登录 ，按其他键退出");
			int chose=new Scanner(System.in).nextInt();
			switch (chose) {
				case 1: openAccount(); break;
				case 2: signIn(); break;
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

   public Account [] openAccount(){
   	while (true) {
			System.out.println("请选择您要办理的账户类型：0(储蓄账户)或者1(信用卡账户)");
			int type=new Scanner(System.in).nextInt();
			setType(type);
			if (type==0||type==1) {
				break;
			}else{
				System.out.println("您的输入有误，请重新输入：");
			}
	}
    while (true) {
      System.out.println("请输入您的账户号码：");
      long id=new Scanner(System.in).nextLong();
      //避免账号重复
      System.out.println(type);
      if (type==0&&count1!=0) {
      	boolean flag=false;
     	for (int i=0;i<count1;i++) {
     		if (id==account[0][i].getId()) {
     			System.out.println("账号已存在");
     			flag=true;
     			continue;
     		}
     	}
     	if (flag) {
     		continue;
     	}
     }else if (type==1&&count2!=0) {
     	boolean flag=false;
     	for (int i=0;i<count2;i++) {
     		if (id==account[1][i].getId()) {
     			System.out.println("账号已存在");
     			flag=true;
     			break;
     		}
     	}
     	if (flag) {
     		continue;
     	}
     }
      setId(id);
      if (getId()==0) {
        System.out.println("您的输入有误，请重新输入：");
      }else{
        break;
      }
    }
    while (true) {
      System.out.println("请输入您的账户密码：");
      String passWord=new Scanner(System.in).next();
      System.out.println("请再次输入您的账户密码：");
      String passWord2=new Scanner(System.in).next();
      if (passWord.equals(passWord2)) {
      	 setPassWord(passWord);
      }else{
      	System.out.println("两次密码输入不一致,请重新输入：");
      	continue;
      }
      setPassWord(passWord);
      if (getPassWord()!=null) {
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
      if (getPassId()==null) {
        System.out.println("您的输入有误，请重新输入：");
      }else{
        break;
      }
    }
    if (type==0) {
    	setBalance(0);
		account[0][count1]=new Account(getId(),getPassWord(),getName(),getPassId(),getBalance());
	}else{
		setBalance(10000);
		account[1][count2]=new Account(getId(),getPassWord(),getName(),getPassId(),getBalance());
	}
	int count=0;
 	 if (type==0) {
   		count=count1;
   	}else{
   		count=count2;
   	}
    System.out.println("开户成功，您的信息如下：");
    showInfo(account,type,count);
   	if (type==0) {
   		count1++;
   	}else{
   		count2++;
   	}
    return account[type];    
  }

  public void signIn(){
     	while (true) {
			System.out.println("请选择您要办理的账户类型：0(储蓄账户)或者1(信用卡账户)");
			int type=new Scanner(System.in).nextInt();
			setType(type);
			if (type==0||type==1) {
				break;
			}else{
				System.out.println("您的输入有误，请重新输入：");
			}
		}
      int j=0;
      while (j<=3) {
      	int trueNum=-1;
      	System.out.println("请输入您的账户号码：");
      	long id=new Scanner(System.in).nextLong();
      	int length=0;
  		if (type==0) {
	   		 length=count1-1;
	   	}else{
	   		 length=count2-1;
	   	}
      	for (int i=0;i<=length;i++ ) {
			if (id==account[type][i].getId()) {
       			trueNum=i;
				while(true){
						System.out.println("请输入您的账户密码：");
						String passWord=new Scanner(System.in).next();
						if (passWord.equals(account[type][trueNum].getPassWord())) {
            			if (type==0) {
						System.out.println("登录成功！存款请按1，取款请按2");
						String iNum=new Scanner(System.in).next();
						if (iNum.equals("1")) {
							deposit(trueNum,account,type);

						}else if (iNum.equals("2")) {
							withdraw(trueNum,account,type);
						}else{
							System.out.println("再见");
						}
					}else {
						withdraw(trueNum,account,type);
					}
					showInfo(account,type,trueNum);
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
      	System.out.println("j=="+j);
      	if (trueNum==-1&&j!=4) {
	        System.out.println("账户不存在");
	      }else if(trueNum==-1&&j==4){
	      	System.out.println("错误次数达到三次，再见");
	        break;
	      }
      }
	}  

  public void showInfo(Account [] [] a,int type,int num){
		System.out.println("账户号码:"+a[type][num].getId()+"\n"+"账户密码:"+a[type][num].getPassWord()+"\n"+"姓名："+a[type][num].getName()+"\n"+"身份证号："+a[type][num].getPassId()+"\n"+"余额："+a[type][num].getBalance()+"\n");//"账户密码"+a.passWord "姓名："+a.name "身份证号："+a.passId
	}	
}
class Demo{
	  public static void main(String[] args) {
	  Bank b=new Bank();
	}

}