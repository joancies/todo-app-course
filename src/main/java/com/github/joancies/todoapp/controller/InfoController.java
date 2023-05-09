package com.github.joancies.todoapp.controller;

import com.github.joancies.todoapp.TaskConfigurationProperties;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InfoController {


    private DataSourceProperties datasource;

    private TaskConfigurationProperties myProp;

    public InfoController(DataSourceProperties datasource, TaskConfigurationProperties myProp) {
        this.datasource = datasource;
        this.myProp = myProp;
    }

    @GetMapping("/info/url")
    String url(){
        return datasource.getUrl();
    }
    @GetMapping("/info/prop")
    boolean myProp(){
        return myProp.getTemplate().isAllowMultipleTasks();
    }
}
