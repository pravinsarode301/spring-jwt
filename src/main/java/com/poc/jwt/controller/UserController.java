package com.poc.jwt.controller;

import com.poc.jwt.entity.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//import com.poc.jwt.entity.*;

@RestController
@RequestMapping("security")
public class UserController {

    @RequestMapping("getUsers")
    @GetMapping
    public List<student> getUsers() {
        List<student> list = new ArrayList<>();
        list.add(student.builder().firstName("pravin").LastName("sarode").build());
        list.add(student.builder().firstName("prajaka").LastName("dhadve").build());
        return list;
    }
}
