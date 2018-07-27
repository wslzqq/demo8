package com.example.demo8.utils;

import com.example.demo8.model.InterfaceName;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    private static ResourceBundle bundle = ResourceBundle.getBundle("application",Locale.CHINA);

    public  static  String getUrl(InterfaceName name){

        String  address = bundle.getString("test.url");

        String uri="";

        //最终的测试地址
        String testUrl;

        if (name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");

        }

        //hahahahh
        testUrl = address+uri;
        return testUrl;

    }

}
