package com.xmal.sys;

import java.util.Arrays;

import com.xmal.user.Admin;
import com.xmal.user.Employee;
import com.xmal.validate.*;
/*ConstrolSystem（系统类）*/

public class ControlSystem {
    public String[] password   = new String[100]; 
    public String[] cards       = new String[100];
    public String[] fingerMarks = new String[100]; 

    //无参构造方法，创建一组测试用密码、指纹、卡号
    public ControlSystem(){
    	 addpassword();
         addCards();
         addfingerMarks();
    }

    //验证
    public boolean validate(String pass,int type){
        boolean bn = false;
        Validate validate = null;
        if (type==1)
        {
             validate = new PassValidate();
             bn = validate.check(password, pass);
         }
            /*验证胸卡*/
        else if(type==2){
                validate = new CardValidate();
                bn = validate.check(cards, pass);
            } 
            /*验证指纹*/
            else if (type==3){
                validate = new FingerMarkValidate();
                bn = validate.check(fingerMarks,pass);
            } 
 
        return bn;
    }
    
    public void addCards() {
        for(int i=0;i<Admin.arrString.length;i++){
            this.cards[i]=Admin.arrString[i].split(",")[3];
        }
    }


    public void addfingerMarks() {
        for(int i=0;i<Admin.arrString.length;i++){
        	 this.fingerMarks[i]=Admin.arrString[i].split(",")[4];
        }
    }
 
    public void addpassword() {
        for(int i=0;i<Admin.arrString.length;i++){
        	 this.password[i]=Admin.arrString[i].split(",")[1];
        }
    }

    public void addPass() {
    	System.out.println(Admin.count+"==========="+Admin.arrString.length);
    	  this.cards[Admin.count-1]=Admin.judgeCard();
          this.password[Admin.count-1]=Admin.judgePass();
          this.fingerMarks[Admin.count-1]=Admin.judgeFinger() ;
          System.out.println(Arrays.toString(this.password));
          System.out.println(Arrays.toString(this.cards));
          System.out.println(Arrays.toString(this.fingerMarks));
   }


}
