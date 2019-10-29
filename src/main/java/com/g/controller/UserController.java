package com.g.controller;

import com.g.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示 响应数据、结果视图
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 结果视图中使用${user}取得属性值
     * 注意：isELIgnored="false"
     */
    @RequestMapping("testString")
    public String testString(Model model) {
        User u = new User();
        u.setUsername("张三");
        u.setPassword("123");
        u.setAge(20);
        model.addAttribute("user", u);
        return "success";
    }

    @RequestMapping("testVoid")
    public void testVoid(HttpServletRequest req, HttpServletResponse res) throws Exception {
        //请求转发
        //req.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(req, res);
        //重定向
        //res.sendRedirect(req.getContextPath()+"/response.jsp");
        //直接响应
        res.getWriter().println("hhhhhh");
    }

    /**
     * 使用 ModelAndView对象
     * 结果视图中使用${user}取得属性值
     * 注意：isELIgnored="false"
     */
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView() {
        User u = new User();
        u.setUsername("lisi");
        u.setPassword("111");
        u.setAge(22);

        ModelAndView mv = new ModelAndView();
        mv.addObject("user", u);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("testForwardOrRedirect")
    public String testForwardOrRedirect() {
        //return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/response.jsp";
    }

    /**
     * 模拟异步请求响应
     * json封装为User对象
     * User对象转为json
     */
    @RequestMapping("testAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("testAjax");
        System.out.println(user);
        //模拟查询数据库
        user.setUsername("jack");
        return user;
    }
}
