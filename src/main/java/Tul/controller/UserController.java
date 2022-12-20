package Tul.controller;


import Tul.pojo.User;
import Tul.service.UserService;
import Tul.utlis.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("findAll")
    public Result getAll(){
        List<User> all = userService.getAll();

        return new Result("",all);
    }

}
