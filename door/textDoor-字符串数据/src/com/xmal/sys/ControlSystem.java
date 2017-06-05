package com.xmal.sys;

import com.xmal.user.Admin;
import com.xmal.validate.*;
/*ConstrolSystem（系统类）*/

public class ControlSystem {
    private String[] password   = new String[Admin.arrString.length]; 
    private String[] cards       = new String[Admin.arrString.length];
    private String[] fingerMarks = new String[Admin.arrString.length]; 

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



}
