package com.example.demo.controller;

import com.example.demo.dao.MemberMapper;
import com.example.demo.model.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /*@Autowired
    MemberMapper memberMapper;*/

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    /*@GetMapping("/members/{no}")
    public Member helloWorld(@PathVariable("no") long no) {
        return memberMapper.selectMember2(no);
    }*/
}
