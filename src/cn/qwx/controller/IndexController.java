package cn.qwx.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;


public class IndexController{
    private static Logger logger=Logger.getLogger(IndexController.class);
    
    //RequestMapping表示与那个请求的URL来对应（此处："/index"）
    @RequestMapping("/index")
    public String index(){
        logger.info("hello,SpringMVC！");
        return "index";
    }
}
