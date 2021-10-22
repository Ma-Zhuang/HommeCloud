package top.Cloud.Homme.Doc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.Cloud.Homme.Doc.entity.Doc;
import top.Cloud.Homme.Doc.mapper.DocMapper;

import java.util.List;

@Service
public class DocService {
    @Autowired
    private DocMapper docMapper;

    public List<Doc> queryDocByUUID(String UUID) {
        return docMapper.findDocByUUID(UUID);
    }
}
