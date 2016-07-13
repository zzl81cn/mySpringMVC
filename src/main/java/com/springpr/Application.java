package com.springpr;

import com.springpr.service.MovieService;
import com.springpr.service.Cinema;
import com.springpr.service.DefaultMovieService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhouzilong on 2016/7/13.
 * 在Application.java中我们声明了一个类型为MovieService的Bean。并且标注Application.java为@Configuration,这是告诉Spring在Application.java中定义了一个或多个@Bean方法，让Spring容器可以在运行时生成这些Bean。@ComponentScan则会让Spring容器自动扫描当前package下的标有@Component的class，这些class都将由Spring托管。
 */
@Configuration
@ComponentScan
public class Application {
    @Bean
    public MovieService getMovieService(){
        return new DefaultMovieService();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationcontext = new AnnotationConfigApplicationContext(Application.class);
        Cinema cinema = applicationcontext.getBean(Cinema.class);
        cinema.printMovieName();
    }
}
