package cn.sun.tuesday.contr;

import cn.sun.tuesday.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @RequestMapping(path = "/createUser", method = {RequestMethod.POST})
    public String createUser(User user){
        System.out.println(user);
        return "result/success";
    }
}
