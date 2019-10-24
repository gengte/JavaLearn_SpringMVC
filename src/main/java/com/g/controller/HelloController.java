package com.g.controller;

import com.g.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Hello")
public class HelloController {

    /**
     * 使用RequestMapping注解
     *
     * @return
     */
    @RequestMapping(path = "/sayHello")
    public String sayHello() {
        System.out.println("hello.");
        return "success";
    }

    /**
     * 使用RequestMapping注解，params属性：约束请求中的参数
     *
     * @return
     */
    @RequestMapping(path = "/sayHello2", params = "username=zhangsan")
    public String sayHello2() {
        System.out.println("hello zhangsan.");
        return "success";
    }

    /**
     * 请求参数绑定，要参数名称一致
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public String login(String username, String password) {
        System.out.println("username" + username + "  password=" + password);
        return "success";
    }

    /**
     * 自动封装为JavaBean对象
     *  另：
     *      对象中存在引用类型字段时；
     *      <input type="text" name="字段名.字段名"/>
     *      存在集合字段时；
     *      <input type="text" name="list字段名[index]"/>
     *      <input type="text" name="map字段名['key']"/>
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println(account);
        return "success";
    }

}
