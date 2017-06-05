package com.xmal.validate;
/*FingerMarkValidate(指纹密码验证子类)*/
public class FingerMarkValidate implements Validate {

    //重写验证方法-根据指纹验证
    public boolean check(String[] finger, String input)
    {
        boolean bn = false;

        for(int i=0; i<finger.length; i++){
            if (input.equals(finger[i]) )  
            {
                bn = true;
                break;
            }
        }

        return bn;
    }
}