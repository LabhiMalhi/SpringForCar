package springboot.malhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class LabhiApplication {

    public static void main(String[] args) {

       ApplicationContext run = SpringApplication.run(LabhiApplication.class, args);
        System.out.println(run.getBean(Car.class));
    }

}
