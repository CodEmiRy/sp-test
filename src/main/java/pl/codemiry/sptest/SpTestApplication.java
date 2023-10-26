package pl.codemiry.sptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class SpTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpTestApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("hello word");
    }

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename("classpath:i18n/messanges");
        source.setDefaultEncoding("UTF-8");
        return source;

    }
}