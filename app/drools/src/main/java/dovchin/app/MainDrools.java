package dovchin.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dovchin.config")
public class MainDrools implements ApplicationRunner {
    private static Logger LOG = LoggerFactory.getLogger(MainDrools.class);

    public static void main(String[] args) {
        LOG.info("Starting java application...");
        SpringApplication.run(MainDrools.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        LOG.info("Running Spring-Boot application...");
    }
}
