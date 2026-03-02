package org.example.sbweb1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName()
    {
        return "Java";
    }

    @RequestMapping("/")
    public String home()
    {
        return "index.html";
    }
    @RequestMapping("addNumbers")
    public String add(int num1, int num2, Model model)
    {

        int result = num1 + num2;
        model.addAttribute("result", result);
        return "result.html";
    }
}
