package com.xmal.validate;
/*CardValidate(卡号密码验证子类)*/
public class CardValidate implements Validate {

    //    重写验证方法-根据卡号验证
    public boolean check(String[] cards, String input)
    {
        boolean bn = false;

        for(int i=0; i<cards.length; i++){
            if (input.equals(cards[i]) )  // 解析输入的密码
            {
                bn = true;
                break;
            }
        }

        return bn;
    }
}
