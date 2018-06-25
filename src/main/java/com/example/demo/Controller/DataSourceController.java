package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
public class DataSourceController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/DruidDataSource")
    @ResponseBody
    public String dataSourcePage() throws Exception{
        System.out.println(dataSource.getConnection());
        System.out.println(dataSource);
        return "Hello SpringBoot DataSource!";
    }
}
