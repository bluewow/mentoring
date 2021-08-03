package com.example.study.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"헬로우 컨트롤러"})
@RestController
public class HelloController {

    @ApiOperation("Hello")
    @GetMapping("hello")
    public String hello() {
        return "hello spring33333";
    }

    @ApiOperation("PR TEST")
    @GetMapping("pr")
    public String prTest() {
        return "pr test";
    }


}
