package pl.codemiry.sptest;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

@Service
@Primary
public class VisaService implements Card {
    public VisaService() {
    }

    @Override
    public String getInfo() {
        return "VisaService";
    }
}
