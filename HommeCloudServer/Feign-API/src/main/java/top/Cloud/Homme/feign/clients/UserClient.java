package top.Cloud.Homme.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.Cloud.Homme.feign.entity.User;
import top.Cloud.Homme.feign.entity.UserDoc;

@FeignClient("userservice")
public interface UserClient {

    @PostMapping(path = "/user", params = "userName")
    UserDoc queryDocByName(@RequestParam("userName") String userName);

    @PostMapping(path = "/user/info",params = "userName")
    User queryUserByName(@RequestParam("userName") String userName);

}
