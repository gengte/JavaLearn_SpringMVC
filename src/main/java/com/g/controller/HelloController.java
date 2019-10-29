package com.g.controller;

import com.g.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 入门
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    /**
     * 使用 RequestMapping注解
     */
    @RequestMapping(path = "sayHello")
    public String sayHello() {
        System.out.println("hello.");
        return "success";
    }

    /**
     * 使用RequestMapping注解，params属性：约束请求中的参数
     */
    @RequestMapping(path = "sayHello2", params = "username=zhangsan")
    public String sayHello2() {
        System.out.println("sayHello2 zhangsan.");
        return "success";
    }

    /**
     * 使用RequestParam注解，约束请求的参数名必须为"uname"
     */
    @RequestMapping(path = "sayHello3")
    public String sayHello3(@RequestParam(name = "uname") String s) {
        System.out.println("sayHello3--" + s);
        return "success";
    }

    /**
     * 使用 PathVeriable 注解
     * 了解restful风格
     * 其他常用注解: RequestBody RequestHeader CookieValue ModelAttribute
     */
    @RequestMapping(path = "sayHello4/{id}")
    public String sayHello4(@PathVariable(name = "id") String s) {
        System.out.println("sayHello4--" + s);
        return "success";
    }

    /**
     * 请求参数绑定，要与方法参数名称一致
     * <form action="/Hello/login" method="post">
     * 用户名：<input type="text" name="username"><br>
     * 密码：<input type="password" name="password"><br>
     * <input type="submit" value="login">
     * </form>
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView login(String username, String password) {
        System.out.println("username" + username + "  password=" + password);
        ModelAndView mv = new ModelAndView();
        if ("zhangsan".equals(username) && "123".equals(password)) {
            mv.setViewName("success");
        } else {
            mv.setViewName("fail");
        }
        return mv;
    }

    /**
     * 自动封装为JavaBean对象
     * Account对象的各个字段：
     * <input type="text" name="username"/>
     * <input type="text" name="password"/>
     * <input type="text" name="money"/>
     * 另：
     * 对象中存在引用类型字段时；
     * <input type="text" name="字段名.字段名"/>
     * 存在集合字段时；
     * <input type="text" name="list字段名[index]"/>
     * <input type="text" name="map字段名['key']"/>
     */
    @RequestMapping("saveAccount")
    public String saveAccount(Account account) {
        System.out.println(account);
        return "success";
    }

}
