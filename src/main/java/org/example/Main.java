package org.example;


import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@SpringBootApplication
@RestController
public class Main {
    @GetMapping("/newyear")
    public String daysUntilNewYear(Model model){
        System.out.println("Calculating days to New Year..."); //Debug Line
        DateTime now = new DateTime();
        DateTime newYear = new DateTime(now.getYear() + 1, 1, 1, 0, 0);
        int daysUntilNewYear = Days.daysBetween(now, newYear).getDays();
        System.out.println("Days remaining: " + daysUntilNewYear);
        model.addAttribute("daysUntilNewYear", daysUntilNewYear);
        return "Days remaining: " +daysUntilNewYear;

    }

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}