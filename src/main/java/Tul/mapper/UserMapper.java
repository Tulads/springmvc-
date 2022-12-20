package Tul.mapper;

import Tul.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Insert("insert into tb_user values (null,#{username},#{password})")
    int save(User user);


    @Select("select * from tb_user where user_name=#{username} and password=#{password}")
    User getByNameAndPwd(String username,String password);

    @Select("select  * from tb_user")
    List<User> getAll();

}
