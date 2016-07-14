package com.springpr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zhouzilong on 2016/7/13.
 * 本例子中主要使用Annotation功能来实现对MoviceService的注入。
 * 我们将Cinema.java的头部标注为@Component说明该类交由Spring托管。而Cinema.java中的属性MoviceService标注为@Autowired，则Spring在初始化Cinema类时会从Application Context中找到类型为MovieService的Bean，并赋值给Cinema。
 * 关于@Resource
 * 建议使用@Resource注解，而不要使用@Autowired注解。因为@Autowired注解是Spring提供的，而@Resource注解是J2EE提供的 ，在JDK6中就已经包含@Resource注解了，所以它没有跟Spring紧密耦合，并且在使用Spring时，若使用了JSR-250中的注解，如@Resource//@PostConstruct//@PreDestroy ，那么还需要Spring安装目录中的SPRING_HOME\\lib\\j2ee\\common-annotations.jar包的支持。
 */

@Component
public class Cinema {

//    @Autowired
    @Resource
    private MovieService movieService;

    public void printMovieName(){
        System.out.println(movieService.getMovieName());
    }
}
