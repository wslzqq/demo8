package com.example.demo8.cases;

import com.example.demo8.config.TestConfig;
import com.example.demo8.model.GetUserInfoCase;
import com.example.demo8.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoTest {

    @Test(dependsOnGroups = "loginTrue",description = "获取userid为1的用户信息")
    public  void getUserInfo() throws IOException {
        SqlSession session = DatabaseUtil.getSession();
        GetUserInfoCase getUserInfoCase =session.selectOne("getUserInfoCase",1);
        System.out.println(getUserInfoCase.toString());
        System.out.println(TestConfig.getUserInfoUrl);
    }
}
