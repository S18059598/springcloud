package com.sec.fegin8040.controller;

import com.sec.api.entity.User;
import com.sec.api.service.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
 * @author:吴杰
 * @data:2021/8/25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static final String URL="http://WUJIEPROVOID/user/";
    @Resource
    private Service service;
    //查询全部
    @RequestMapping("/search")
    public List<User> search(){
        return service.search();
    }

    @RequestMapping("searchById/{id}")
    public User searchById(@PathVariable("id") Integer id){
        return service.searchById(id);
    }
}
