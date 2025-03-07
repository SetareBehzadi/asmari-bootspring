package asmari_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


//@SpringBootApplication
//public class PrgApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(PrgApplication.class, args);
//    }
//}
@SpringBootApplication
@EntityScan(basePackages = "asmari_demo.model")
public class PrgApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrgApplication.class, args);
    }
}