package top.Cloud.Homme.user.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.Cloud.Homme.user.entity.User;

public interface UserMapper {

    @Select("select * from user where username = #{userName}")
    User findUserByName(@Param("userName") String name);

}
