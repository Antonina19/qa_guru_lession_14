package io.github.qaguru.owner.config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {
    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();
}
