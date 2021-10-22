package top.Cloud.Homme.login.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.Cloud.Homme.feign.entity.User;
import top.Cloud.Homme.login.service.LoginService;

@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private LoginService loginService;

    @PostMapping(path = "", params = {"userName", "userPass"})
    public String userLogin(@RequestParam("userName") String userName,
                            @RequestParam("userPass") String userPass) {

        if (!userName.isEmpty() && !userPass.isEmpty()) {
            boolean isUser = loginService.checkUserInfo(userName, userPass);
            if (isUser){
                return "true";
            }else {
                return "false";
            }
        } else {
            return null;
        }
    }
}
