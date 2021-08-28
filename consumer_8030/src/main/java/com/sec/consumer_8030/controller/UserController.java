package com.sec.consumer_8030.controller;

import com.sec.api.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private RestTemplate restTemplate;
    //查询全部
    @RequestMapping("/search")
    public List<User> search(){
        return restTemplate.getForObject(URL+"selectAll",List.class);
    }

    @RequestMapping("searchById/{id}")
    public User searchById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(URL+"selectOne/"+id,User.class);
    }
}
