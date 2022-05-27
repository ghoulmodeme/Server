package COM.MATV;

import COM.MATV.SUBD.UserService;
import COM.MATV.SUBD.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;

@Component
@Controller
public class FormController {
    @Autowired
    UserService userService;
    @GetMapping("/")

    public String showForm(HttpServletRequest request, HttpServletResponse response) {
        String form = "<html>"
                + "<form action=\'postform\'method='POST'"
                + ""
                + ""
                + ""
                + ""
                + ""
                + "input type='password'name=id'"
                + "<form>"
                + "<html>";

        return form;


    }

    @PostMapping("/postform")
    public String checkForm(HttpServletRequest req, HttpServletResponse res) {
        String id = req.getParameter("id");


        return "сайт взломан";

    }
    @ResponseBody
    @PostMapping("/auth/login")
    public ResponseExample login(@RequestBody Id req,HttpServletResponse response) {
        System.out.println(req.getId());
        User user = new User(Long.parseLong(req.getId()));
        userService.save(user);
            


        return new ResponseExample("null",0);
        }
}

