package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fachrifebrian on 12/5/17.
 */
@Controller
public class CopyController {

    @RequestMapping("/about")
    public String about() {
        return "copy/about";
    }
}
