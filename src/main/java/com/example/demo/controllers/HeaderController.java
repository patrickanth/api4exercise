package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping("/requestHeaders")
    public String requestHeaders(@RequestHeader("hostName") String hostName,@RequestHeader("hostPort") String hostPort){

        return hostName + hostPort;
    }

}
