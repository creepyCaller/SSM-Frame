package cn.edu.cuit.fpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @RequestMapping("")
    public String toIndex() {
        return "index";
    }

    @RequestMapping("index")
    public String toIndexA() {
        return "index";
    }

    @RequestMapping("toLogin")
    public String toLogin(HttpSession session) {
        this.cleanErrMsg(session);
        return "login";
    }

    @RequestMapping("toRegister")
    public String toRegister(HttpSession session) {
        this.cleanErrMsg(session);
        return "register";
    }

    private void cleanErrMsg(HttpSession session) {
        if (null != session.getAttribute("errmsg")) {
            session.setAttribute("errmsg", null);
        }
    }

}
