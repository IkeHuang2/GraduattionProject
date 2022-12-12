package com.hyz.controller;

import com.hyz.pojo.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class a {



    @RequestMapping("/1")
        public String name(){
            return "1";
        }


    @RequestMapping("/2")
    public String test(){
        return "2";
    }


}
