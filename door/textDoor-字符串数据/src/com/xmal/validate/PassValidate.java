package com.xmal.validate;
/*PassValidate(普通密码验证子类)*/
public class PassValidate implements Validate {

    //重写验证方法-根据密码验证
    public boolean check(String[] password, String s)
    {
        boolean bn = false;

        for(int i=0; i<password.length; i++){
        	System.out.println(password[i]);
            if (password[i].equals(s) )  // 解析输入的密码
            {
                bn = true;
                break;
            }
        }

        return bn;
    }
}