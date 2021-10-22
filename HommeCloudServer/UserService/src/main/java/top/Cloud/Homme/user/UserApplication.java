package top.Cloud.Homme.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import top.Cloud.Homme.feign.clients.DocClient;
import top.Cloud.Homme.feign.config.DefaultFeignConfiguration;

@MapperScan("top.Cloud.Homme.user.mapper")
@SpringBootApplication
@EnableFeignClients(clients = {DocClient.class},defaultConfiguration = DefaultFeignConfiguration.class)
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
