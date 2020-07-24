package com.spring.ss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetAPIController {
    @RequestMapping(method = RequestMethod.GET, path = "/getRequest")
    public String getRequest() {
        return "this is getRequest";
    }
}
