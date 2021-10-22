package top.Cloud.Homme.feign.entity;

import lombok.Data;

import java.util.List;

@Data
public class UserDoc {
    private String UUID;
    private String userName;
    private String userAuth;
    private String userStatus;
    private List<Doc> docList;
}
