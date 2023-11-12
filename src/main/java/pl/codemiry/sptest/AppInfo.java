package pl.codemiry.sptest;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app-info")
public class AppInfo {

    private String appName;
    private int appVersion;

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setAppVersion(int appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppName() {
        return appName;
    }

    public int getAppVersion() {
        return appVersion;
    }

    @EventListener(ApplicationReadyEvent.class)
    private void get() {
        System.out.println(appName);
        System.out.println(appVersion);
    }
}