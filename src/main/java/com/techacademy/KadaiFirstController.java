package com.techacademy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val}")
    public String dispDayOfWeek(@PathVariable String val) {
        LocalDate ld = LocalDate.parse(val, DateTimeFormatter.ofPattern("yyyyMMdd"));
        return "指定日:" + val + "(" + ld.getDayOfWeek() + ")";
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        return "plus:" + (val1 + val2);

    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        return "minus:" + (val1 - val2);
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calctimes(@PathVariable int val1, @PathVariable int val2) {
        return "times:" + (val1 * val2);
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcdivide(@PathVariable int val1, @PathVariable int val2) {
        return "divide:" + (val1 / val2);
    }
}
