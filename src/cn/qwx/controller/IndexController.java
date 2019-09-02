package cn.qwx.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController{
    private static Logger logger=Logger.getLogger(IndexController.class);


    @RequestMapping(value = "/welcome",method=RequestMethod.GET,params = "username")

    /**
     *参数传递：View to Controller
     */
    //@RequestMapping("/welcome")
    public String welcome(@RequestParam String username){
        logger.info("welcome,"+username);
        return "index";
    }




    //RequestMapping表示与那个请求的URL来对应（此处："/index"）
    @RequestMapping("/index")
    public String index(){
        logger.info("hello,SpringMVC！");
        return "index";
    }


}
