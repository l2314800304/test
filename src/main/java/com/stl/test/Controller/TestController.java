package com.stl.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 *
 */
@Controller
public class TestController {
    @RequestMapping(value = "/indexs")
    public String test(Map<String,Object> map){
        map.put("name","STL");
        map.put("message","123");
        return "index";
    }
}
