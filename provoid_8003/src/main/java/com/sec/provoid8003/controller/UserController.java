package com.sec.provoid8003.controller;

import com.sec.api.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sec.provoid8003.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-08-24 15:46:32
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    //拿到获取当前服务信息接口对象
    @Resource
    private DiscoveryClient dg;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne/{id}")
    public User selectOne(@PathVariable("id") Integer id) {
        return this.userService.queryById(id);
    }

    //查询全部
    @RequestMapping("selectAll")
    public List<User> selectAll(){
        return userService.queryAll();
    }
    //添加
    @RequestMapping("insert")
    public User insert(User user){
       return userService.insert(user);
    }

    @RequestMapping("update")
    public User update(User user){
        return userService.update(user);
    }

    @RequestMapping("deleteById")
    public String deleteById(@Param("uid") Integer id){
        userService.deleteById(id);
        return "";
    }


    //查询当前微服务的摘要信息
    @RequestMapping(value = "/wujie")
    public Object showSpringCloudInfo(){
        //此处需要一个包含当前微服务信息的对象
        List<String> list = dg.getServices();
        System.out.println("list的值为："+list);
        List<ServiceInstance> siList = dg.getInstances("WUJIEPROVOID8001");
        for (ServiceInstance si:siList) {
            System.out.println("si.getServiceId():"+si.getServiceId());
            System.out.println("si.getHost():"+si.getHost());
            System.out.println("si.getPort():"+si.getPort());
            System.out.println("si.getUri():"+si.getUri());
            System.out.println("si.getMetadata():"+si.getMetadata());
        }
        return  this.dg;
    }
}
