package top.Cloud.Homme.Doc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("top.Cloud.Homme.Doc.mapper")
@SpringBootApplication
public class DocApplication {
    public static void main(String[] args) {
        SpringApplication.run(DocApplication.class, args);
    }
}
