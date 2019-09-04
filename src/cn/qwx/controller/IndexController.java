package cn.qwx.controller;

import cn.qwx.entity.User;
import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Map;

@Controller
public class IndexController{
    private static Logger logger=Logger.getLogger(IndexController.class);

    //RequestMapping表示与那个请求的URL来对应（此处："/index"）
    @RequestMapping("/index")
    public String index(){
        logger.info("hello,SpringMVC！");
        return "index";
    }




    /**
     *参数传递：View to Controller
     */
    @RequestMapping("/welcome")
    //@RequestMapping(value = "/welcome",method=RequestMethod.GET,params = "username")
    public String welcome(@RequestParam String username){
        logger.info("welcome,"+username);
        return "index";
    }

    @RequestMapping("/welcome1")
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
    public ModelAndView index1(String username){
      logger.info("welcome!username:"+username);
      ModelAndView mView=new ModelAndView();
      mView.addObject("username",username);
      mView.addObject(username);
      mView.setViewName("index");
      return mView;
    }

    /**
     * 参数传递：controller to -view -（Model）
     * @param username
     * @param model
     * @return
     */
    @RequestMapping("/index2")
    public String index2(String username, Model model){
        logger.info("welcome!SpringMVC!username:"+username);
        model.addAttribute("username",username);
        model.addAttribute(username);
        return "index";
    }

    /**
     * 参数传递：controller to -view -（Model）
     * @param username
     * @param model
     * @return
     */
    @RequestMapping("/index3")
    public String index3(String username, Model model){
        logger.info("welcome!SpringMVC!username:"+username);
        model.addAttribute("username",username);
        model.addAttribute(username);
        User user=new User();
        user.setUserName(username);
        model.addAttribute("currentUser",user);
        model.addAttribute(user);
        return "index";
    }

    /**
     * 参数传递：controller to -view -（Map）
     * @param username
     * @param model
     * @return
     */
    @RequestMapping("/index4")
    public String index4(String username,Map<String,Object> model){
        logger.info("welcome!SpringMVC!username:"+username);
        model.put("username",username);
        model.put("string",username);
        return "index";
    }


    @RequestMapping("/welcome3")
    public String welcome3(){
        System.out.println("学框架就学Spring MVC！");
        return "index";
    }

    @RequestMapping(value = "/welcome4")
    public ModelAndView welcome4(String name,String password){
        try {
            name = new String(name.getBytes("iso8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("userCode",name);
        mv.addObject("password",password);
        mv.setViewName("success");
        return mv;
    }
}
