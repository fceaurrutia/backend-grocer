package com.fredy.grocer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fredy.grocer.models.Response;

@RestController
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public Response helloPXP() {
        Response res = new Response("asd", "owo");

        return res;
    }
}
