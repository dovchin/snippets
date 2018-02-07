package dovchin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("dovchin.drools")
public class DroolsApiConfig {

    @PostConstruct
    public void post() {
        this.hashCode();
    }
}
