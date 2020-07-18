package com.crbiitr.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RequestMapping("/showForm") /* Parent mapping if you want */
public class HelloWorldController {

    String message = "Welcome to Spring MVC!";

    @RequestMapping("/hello")
    public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        System.out.println("in controller");
        ModelAndView mv = new ModelAndView("processForm");
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloword-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloword";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(@RequestParam(value = "studentName", required = false, defaultValue = "John") String studentName, Model model) {

        // Read request parameter from the HTML form
        String theName = studentName;

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloword";
    }

}
