package top.Cloud.Homme.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.Cloud.Homme.feign.clients.UserClient;
import top.Cloud.Homme.feign.entity.User;

@Service
public class LoginService {
    @Autowired
    private UserClient userClient;


    public User queryUserByName(String userName) {
        return userClient.queryUserByName(userName);
    }

    public boolean checkUserInfo(String userName, String userPass){
        return true;
    }
}
