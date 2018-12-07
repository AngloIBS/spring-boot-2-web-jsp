package com.demo.sb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by agospodinov on 12/7/2018.
 */
@Controller
public class TestController {
    @GetMapping("/test")
    public String test(@RequestParam(name = "myparam", defaultValue = "default", required = false) String name, Model model) {
        model.addAttribute("myparam", name);
        return "demo";
    }
}
