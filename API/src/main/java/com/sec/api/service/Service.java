package com.sec.api.service;

import com.sec.api.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
 * @author:吴杰
 * @data:2021/8/27
 */
@FeignClient("WUJIEPROVOID")
public interface Service {

    //查询全部
    @RequestMapping("/search")
    public List<User> search();

    @RequestMapping("searchById/{id}")
    public User searchById(@PathVariable("id") Integer id);
}
