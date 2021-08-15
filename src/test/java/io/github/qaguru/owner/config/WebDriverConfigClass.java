package io.github.qaguru.owner.config;

public class WebDriverConfigClass {

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (browser == null) {
            return Browser.CHROME;
        } else {
            return Browser.valueOf(browser);
        }
    }

    public String getBaseUrl() {
        String baseUlr = System.getProperty("baseUrl");
        if (baseUlr == null) {
            return "https://github.com";
        } else {
            return baseUlr;
        }

    }
}
