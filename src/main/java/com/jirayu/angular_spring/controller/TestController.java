package com.jirayu.angular_spring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class TestController {
    @RequestMapping("/getlistData")
    @CrossOrigin(origins = "*")
    public List<HashMap<String, Object>> getlistData() {
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>(); // Use the generic type List<HashMap<String, Object>>

        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("firstname", "Jirayu");
        data.put("lastname", "tatea");
        data.put("id", "64143169");
        data.put("Date", new Date());
        list.add(data);
        
        HashMap<String, Object> data1 = new HashMap<String, Object>();
        data1.put("firstname", "natthawut");
        data1.put("lastname", "sriwong");
        data1.put("id", "64143121");
        data1.put("Date", new Date());
        list.add(data1);

        return list;
    }
}
