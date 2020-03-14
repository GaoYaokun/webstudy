package com.pku.webstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Yorke
 * @Date 2020/3/14 23:08
 */
@Controller
public class PublishController {
    @GetMapping("/publish")
    private String publish(){
        return "publish";
    }

}
