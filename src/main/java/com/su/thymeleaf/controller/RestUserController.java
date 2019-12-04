package com.su.thymeleaf.controller;

import com.su.thymeleaf.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 1 使用 @RestController注解，相当于 @Controller+@ResponseBody两个注解的结合，
 * 返回json数据不需要在方法前面加@ResponseBody注解了，
 * 但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析（返回）jsp,html页面。
 * 配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容
 *
 * 2 使用 @Controller 注解，在对应的方法上，视图解析器可以解析return 的jsp,html页面，并且跳转到相应页面
 * 若返回json等内容到页面，则需要加@ResponseBody注解
 */
@RestController
@RequestMapping("/user1")
public class RestUserController {

    @RequestMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return new User(id, "张三", 20, "中国广州");

    }

    @RequestMapping("/list")
    public List<User> listUser() {
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            userList.add(new User(i, "张三" + i, 20 + i, "中国广州"));
        }
        return userList;
    }
}
