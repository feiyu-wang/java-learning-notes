import  java.util.*;
import  java.math.*;

class Account{
	private  long id; //账户密码
	private  String passWord;
	private  String name;
	private  String passId;
	private  double balance;

	public Account(){
		id=0;
		passWord=null;
		name=null;
		passId=null;
		balance=0.0;
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
		return balance;
	}
	//存款
	public double deposit(){

	}
	//取款
	public double withdraw(){

	}
}
//储蓄账户
class SavingAccount{

}
//信用卡账户
class CreditAccount{

}

class Bank{
	
	public static void main(String[] args) {
		long [] account=new long[8];
		a[0]=6220180402564890018;
		a[1]=6220280402564890018;
		a[2]=6220380402564890018;
		a[3]=6220480402564890018;
		a[4]=6220580402564890018;
		a[5]=6220680402564890018;
		a[6]=6220780402564890018;
		a[7]=6220880402564890018;
	}
}