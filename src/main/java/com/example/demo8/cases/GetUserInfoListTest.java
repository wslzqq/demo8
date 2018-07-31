package com.example.demo8.cases;

import com.example.demo8.config.TestConfig;
import com.example.demo8.model.GetUserListCase;
import com.example.demo8.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoListTest {

    @Test(dependsOnGroups = "loginTrue",description = "获取性别为男的")
    public void getUserInfolist() throws IOException {

        SqlSession session = DatabaseUtil.getSession();
        GetUserListCase  getUserListCase =session.selectOne("getUserListCase",1);
        System.out.println(getUserListCase.toString());
        System.out.println(TestConfig.getUserListUrl);

    }
}
