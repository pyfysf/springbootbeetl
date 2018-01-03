package top.wintp.demo.springbootbeetl.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 类描述：测试Beetl代码
 * Created by apk2sf on 2018/1/3.
 * email: apk2sf@163.com
 * QQ：337081267
 */
@Controller
@RequestMapping("/home")
public class HelloBeetlController {

    private static Logger logger = LoggerFactory.getLogger(HelloBeetlController.class);

    /**
     * 测试beetl模板
     *
     * @return
     */
    @RequestMapping("/add")
    public ModelAndView home() {

        ModelAndView modelAndView = new ModelAndView();
        logger.info("add request");
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("add");

        return modelAndView;
    }


}