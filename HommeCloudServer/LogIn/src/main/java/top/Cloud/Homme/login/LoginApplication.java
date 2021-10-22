package top.Cloud.Homme.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import top.Cloud.Homme.feign.clients.UserClient;
import top.Cloud.Homme.feign.config.DefaultFeignConfiguration;

@SpringBootApplication
@EnableFeignClients(clients = {UserClient.class},defaultConfiguration = DefaultFeignConfiguration.class)
public class LoginApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }
}