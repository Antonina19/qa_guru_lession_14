package io.github.qaguru.owner.config;


import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${type}.properties"
})
public interface DeviceConfig extends Config {

    @Key("appUrl")
    String appUrl();

    @Key("platform")
    String platform();

    @Key("device")
    String device();

}
