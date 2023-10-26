package pl.codemiry.sptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class messageService {

    private MessageSource messageSource;

    @Autowired
    public messageService(MessageSource messageSource) {
        this.messageSource = messageSource;
        String text = messageSource.getMessage("hello", new Object[]{"Emilia","R"}, Locale.forLanguageTag("pl"));
        System.out.println(text);
    }
}
