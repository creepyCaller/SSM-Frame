package cn.edu.cuit.fpc.controller;

import cn.edu.cuit.fpc.model.T_User;
import cn.edu.cuit.fpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(HttpSession session, Model model, @RequestParam String username, @RequestParam String password) {
        if (userService.login(username, password) > 0) {
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            return "loginSuccess";
        } else {
            model.addAttribute("errmsg", "登录失败：用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        session.removeAttribute("password");
        return "index";
    }

    @RequestMapping("register")
    public String register(HttpSession session, Model model, @RequestParam String username, @RequestParam String password) {
        T_User user = new T_User(username, password, "sample@address.com");
        if (userService.findUser(username) > 0) {
            model.addAttribute("errmsg", "注册失败：已存在的用户");
            return "register";
        } else {
            userService.registerUser(user);
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            return "registerSuccess";
        }
    }

    @RequestMapping("userlist")
    public String toUserList(Model model) {
        StringBuilder sb = new StringBuilder();
        List<T_User> ls = userService.findAll();
        for (T_User iter : ls) {
            sb.append("<p>").append(iter.toString()).append("</p>");
        }
        model.addAttribute("userlist", sb.toString());
        return "userlist";
    }

}
