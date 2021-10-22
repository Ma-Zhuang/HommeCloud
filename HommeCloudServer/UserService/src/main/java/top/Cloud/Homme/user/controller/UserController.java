package top.Cloud.Homme.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.Cloud.Homme.feign.entity.UserDoc;
import top.Cloud.Homme.user.entity.User;
import top.Cloud.Homme.user.service.UserService;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/doc", params = "userName")
    public UserDoc queryDocByUserName(@RequestParam("userName") String userName) {
        return userService.queryDocByUserName(userName);
    }


    @PostMapping(path = "/info", params = "userName")
    public User queryUserByName(@RequestParam("userName") String userName) {
        return userService.queryUserByName(userName);
    }
}
