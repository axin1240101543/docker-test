package com.docker.test.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>docker-test</h3>
 * <p></p>
 *
 * @author : Darren
 * @date : 2020年08月26日 14:07:29
 **/
@RestController
public class DockerController {

    @GetMapping("/")
    public String index(){
        return "Hello Docker!!!";
    }

}
