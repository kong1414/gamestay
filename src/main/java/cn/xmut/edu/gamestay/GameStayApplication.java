package cn.xmut.edu.gamestay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
@tk.mybatis.spring.annotation.MapperScan(basePackages = "cn.xmut.edu.gamestay.dao")
public class GameStayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameStayApplication.class, args);
    }

}
