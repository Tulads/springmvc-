package Tul.service;

import Tul.pojo.User;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

public interface UserService {

    boolean save(User user);


    User getByNameAndPwd(String username,String password);


    List<User> getAll();
}
