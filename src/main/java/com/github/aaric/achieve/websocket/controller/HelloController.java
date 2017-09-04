package com.github.aaric.achieve.websocket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloController
 *
 * @author Aaric, created on 2017-09-04T10:58.
 * @since 1.0-SNAPSHOT
 */
@Controller
public class HelloController {

    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * /hello
     *
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name", "thymeleaf");
        return modelAndView;
    }
}