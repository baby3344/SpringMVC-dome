package cn.qwx.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends AbstractController {
    private static Logger logger=Logger.getLogger(IndexController.class);
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("hello,SpringMVC!");
        return new ModelAndView("index");
    }

    //RequestMapping表示与那个请求的URL来对应（此处："/index"）
    /*@RequestMapping("/index")
    public String index(){
        logger.info("hello,SpringMVC！");
        return "index";
    }*/
}
