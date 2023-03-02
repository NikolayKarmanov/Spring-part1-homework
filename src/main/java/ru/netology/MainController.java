package ru.netology;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class MainController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = formatForDateNow.format(dateNow);

        model.addAttribute("currentDate", currentDate);
        return "greeting";
    }
}
