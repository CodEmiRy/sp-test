package pl.codemiry.sptest;

import org.springframework.stereotype.Service;

@Service
public class MasterCarService implements Card {
    public MasterCarService() {
    }

    @Override
    public String getInfo() {
        return "MasterCardService";
    }
}
