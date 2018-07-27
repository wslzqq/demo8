package com.example.demo8.model;

import lombok.Data;

@Data
public class UpdateUserInfoCase {
    private int id;
    private int userId;
    private String usernName;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
