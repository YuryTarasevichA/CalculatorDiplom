package ru.gb.matCalc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalcController {
    @PostMapping("/index")
    public String calc() {
        return "index";
    }
}
