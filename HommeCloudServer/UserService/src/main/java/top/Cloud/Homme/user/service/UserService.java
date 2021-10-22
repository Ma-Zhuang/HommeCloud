package top.Cloud.Homme.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.Cloud.Homme.feign.clients.DocClient;
import top.Cloud.Homme.feign.entity.Doc;
import top.Cloud.Homme.feign.entity.UserDoc;
import top.Cloud.Homme.user.entity.User;
import top.Cloud.Homme.user.mapper.UserMapper;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DocClient docClient;


    public UserDoc queryDocByUserName(String userName) {
        User user = userMapper.findUserByName(userName);
        List<Doc> docs = docClient.findDocByUUID(user.getUUID());
        UserDoc userDoc = new UserDoc();
        userDoc.setUserName(user.getUserName());
        userDoc.setUserAuth(user.getUserAuth());
        userDoc.setUserStatus(user.getUserStatus());
        userDoc.setDocList(docs);
        userDoc.setUUID(user.getUUID());
        return userDoc;
    }

    public User queryUserByName(String userName) {
        return userMapper.findUserByName(userName);
    }

}
