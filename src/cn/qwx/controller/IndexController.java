package cn.qwx.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController{
    private static Logger logger=Logger.getLogger(IndexController.class);

    //RequestMapping表示与那个请求的URL来对应（此处："/index"）
    /*@RequestMapping("/index")
    public String index(){
        logger.info("hello,SpringMVC！");
        return "index";
    }*/


    @RequestMapping(value = "/welcome",method=RequestMethod.GET,params = "username")

    /**
     *参数传递：View to Controller
     */
    //@RequestMapping("/welcome")
    public String welcome(@RequestParam String username){
        logger.info("welcome,"+username);
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome1(@RequestParam(value ="username",required = false) String username){
        logger.info("welcome,"+username);
        return "index";
    }


    /**
     * 参数传递：controller to -view -（ModelAndView）
     * @param username
     * @return
     */
    @RequestMapping("/index1")
    public ModelAndView index(String username){
      logger.info("welcome!username:"+username);
      ModelAndView mView=new ModelAndView();
      mView.addObject("username",username);
      mView.setViewName("index");
      return mView;
    }







}
