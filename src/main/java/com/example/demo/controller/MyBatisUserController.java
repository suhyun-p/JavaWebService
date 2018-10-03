package com.example.demo.controller;

import com.example.demo.model.UserVO;
import com.example.demo.repository.MyBatisUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "myBatis")
public class MyBatisUserController {
    @Autowired
    MyBatisUserRepository myBatisUserRepository;

    @GetMapping("/getUserInfoAll")
    public List helloWorld() {
        return myBatisUserRepository.getUserInfoAll();
    }

    @GetMapping("addUserInfo")
    public List addUserInfo() {
        UserVO userVO = new UserVO("test4", "jpub", "qwer1234");
        myBatisUserRepository.addUserInfo(userVO);

        return myBatisUserRepository.getUserInfoAll();
    }

    @GetMapping("findByUserNameLike")
    public List findByUserNameLike() {
        return myBatisUserRepository.findByUserNameLike("ki");
    }

    @GetMapping("findByUserName")
    public UserVO findByUserName() {
        return myBatisUserRepository.findByUserName("jpub");
    }
}
