package io.github.qaguru.owner;

import io.github.qaguru.owner.config.DeviceConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeviceTest {
    @Test
    public void testAndroid() {
        System.setProperty("type", "android");
        DeviceConfig config = ConfigFactory.create(DeviceConfig.class, System.getProperties());

        assertThat(config.appUrl()).isEqualTo("https://<>/android.apk");
        assertThat(config.platform()).isEqualTo("Android");
        assertThat(config.device()).isEqualTo("Google Pixel");
    }

    @Test
    public void testIOS() {
        System.setProperty("type", "ios");
        DeviceConfig config = ConfigFactory.create(DeviceConfig.class, System.getProperties());

        assertThat(config.appUrl()).isEqualTo("https://<>/ios.apk");
        assertThat(config.platform()).isEqualTo("IOS");
        assertThat(config.device()).isEqualTo("iPhone mini");

    }
}
