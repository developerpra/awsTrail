package com.prasad.awsDeployement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

    @GetMapping("/")
    public String entry() {
        return "<h1> Hello World </h1>";
    }

}
