package com.springpr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhouzilong on 2016/7/13.
 * 本例子中主要使用Annotation功能来实现对MoviceService的注入。
 * 我们将Cinema.java的头部标注为@Component说明该类交由Spring托管。而Cinema.java中的属性MoviceService标注为@Autowired，则Spring在初始化Cinema类时会从Application Context中找到类型为MovieService的Bean，并赋值给Cinema。
 */

@Component
public class Cinema {

    @Autowired
    private MovieService movieService;

    public void printMovieName(){
        System.out.println(movieService.getMovieName());
    }
}
