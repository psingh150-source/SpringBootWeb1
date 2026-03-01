package org.example.sbweb1;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
    @RequestMapping("addNumbers")
    public String add(int num1, int num2, HttpSession session) {

        int result = num1 + num2 + 1;
        session.setAttribute("result", result);


        return "result.jsp";
    }


}
