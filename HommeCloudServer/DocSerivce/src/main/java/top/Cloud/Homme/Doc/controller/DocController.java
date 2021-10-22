package top.Cloud.Homme.Doc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import top.Cloud.Homme.Doc.entity.Doc;
import top.Cloud.Homme.Doc.service.DocService;

import java.util.List;

@RestController
@RequestMapping("docs")
public class DocController {
    @Autowired
    private DocService docService;

    @PostMapping(path = "",params = "UUID")
    public List<Doc> queryDocByUUID(@RequestParam("UUID") String UUID) {
        return docService.queryDocByUUID(UUID);
    }
}
