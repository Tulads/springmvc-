package Tul.service.impl;


import Tul.mapper.UserMapper;
import Tul.pojo.User;
import Tul.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean save(User user) {
        return userMapper.save(user)>0;
    }

    @Override
    public User getByNameAndPwd(String username,String password) {
        return userMapper.getByNameAndPwd(username,password);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
