package top.Cloud.Homme.Doc.mapper;

import org.apache.ibatis.annotations.Select;
import top.Cloud.Homme.Doc.entity.Doc;

import java.util.List;

public interface DocMapper {

    @Select("select * from doc where UUID=#{UUID}")
    List<Doc> findDocByUUID(String UUID);
}
