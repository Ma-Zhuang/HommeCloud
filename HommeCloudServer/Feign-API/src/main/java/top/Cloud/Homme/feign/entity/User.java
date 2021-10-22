package top.Cloud.Homme.feign.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String UUID;
    private String userName;
    private String password;
    private String extPassword;
    private String userAuth;
    private String userStatus;
    private String userDir;
}
