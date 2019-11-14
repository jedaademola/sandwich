package wawa.hackerearth.sandwich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import wawa.hackerearth.sandwich.model.entity.CustomerPdf;
import wawa.hackerearth.sandwich.service.CustomerPdfService;
import wawa.hackerearth.sandwich.util.AuditorAwareImpl;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class SandwichApplication {
    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }
    public static void main(String[] args) {
        SpringApplication.run(SandwichApplication.class, args);
    }

}
