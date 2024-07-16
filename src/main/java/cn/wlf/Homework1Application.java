package cn.wlf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("cn.wlf.mapper")
public class Homework1Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Homework1Application.class, args);
    }

    //重写⼀个⽗类中的⽅法configure(),执⾏初始化的项⽬启动类是谁(Homework1Application)
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Homework1Application.class);
    }
}
