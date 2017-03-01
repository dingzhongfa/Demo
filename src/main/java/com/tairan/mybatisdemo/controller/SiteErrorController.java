package com.tairan.mybatisdemo.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzdzf on 2016/11/10.
 */
@RestController
public class SiteErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "error";
    }

    @RequestMapping(value = "/error")
    public String index() {
        return "welcome";
    }

}
