package top.Cloud.Homme.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.Cloud.Homme.feign.entity.Doc;


import java.util.List;

@FeignClient("docservice")
public interface DocClient {
    @PostMapping(path = "/docs", params = "UUID")
    List<Doc> findDocByUUID(@RequestParam("UUID") String UUID);
}
