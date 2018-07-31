package com.example.demo8.cases;

import com.example.demo8.config.TestConfig;
import com.example.demo8.model.AddUserCase;
import com.example.demo8.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddUserTest {

    @Test(dependsOnGroups = "loginTrue",description = "添加用户接口测试")
    public void addUser() throws IOException {

        SqlSession session = DatabaseUtil.getSession();
        AddUserCase addUserCase =session.selectOne("addUserCase",1);
        System.out.println(addUserCase.toString());
        System.out.println(TestConfig.addUserUrl);

    }
}
