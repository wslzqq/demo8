package com.example.demo8.cases;


import com.example.demo8.config.TestConfig;
import com.example.demo8.model.UpdateUserInfoCase;
import com.example.demo8.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class UpdateUserInfoTest {


    @Test(dependsOnGroups = "loginTrue",description = "更改用户信息")
    public  void updateUserInfotTest() throws IOException {
        SqlSession session = DatabaseUtil.getSession();
        UpdateUserInfoCase updateUserInfoCase = session.selectOne("updateUserInfoCase",1);
        System.out.println(updateUserInfoCase.toString());
        System.out.println(TestConfig.updateUserInfoUrl);

    }

    @Test(dependsOnGroups = "loginTrue",description = "删除用户信息")
    public  void deleteUserInfotTest() throws IOException {
        SqlSession session = DatabaseUtil.getSession();
        UpdateUserInfoCase updateUserInfoCase = session.selectOne("updateUserInfoCase",2);
        System.out.println(updateUserInfoCase.toString());
        System.out.println(TestConfig.updateUserInfoUrl);

    }

}
