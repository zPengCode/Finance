package com.awspaas.user.apps.finance.util;

public class StringUtil {

    public static boolean isEmpty(String str){
        if(str == null || "".equals(str) || "null".equals(str)){
            return true;
        }
        return false;
    }
}
