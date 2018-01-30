package com.hy.shop.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 菜单栏管理类
 * Created by zhjx on 2018/1/28.
 */
@Controller
@RequestMapping("catalogue")
public class CatalogueController {
    @RequestMapping("/tolist")
    public String toLogin(){
        return "catalogue/catalogue";
    }
}
