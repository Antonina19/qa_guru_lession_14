package io.github.qaguru.owner;

import io.github.qaguru.owner.config.FileSourceConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class FileSourceTest {
    @Test
    public void testFromClassPath() {
        FileSourceConfig config = ConfigFactory.create(FileSourceConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.username()).isEqualTo("classpath-user");
        assertThat(config.password()).isEqualTo("classpath-pass");
    }

    @Test
    public void testFromClassPathInHomeDirectory() {
        // создай файлик в директории /tmp/local.properties
        // добавь туда свой логин и пароль по примеру ...
        FileSourceConfig config = ConfigFactory.create(FileSourceConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.username()).isEqualTo("local-user");
        assertThat(config.password()).isEqualTo("local-pass");
    }
}
