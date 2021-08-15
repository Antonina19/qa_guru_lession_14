package io.github.qaguru.owner;

import io.github.qaguru.owner.config.PrimitiveTypesConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrimitiveTypesTest {
    @Test
    public void testTypes() {
        PrimitiveTypesConfig config = ConfigFactory.create(PrimitiveTypesConfig.class, System.getProperties());

        assertThat(config.getString()).isEqualTo("hello");
        assertThat(config.getLong()).isEqualTo(1L);
        assertThat(config.getInteger()).isEqualTo(1);
        assertThat(config.getDouble()).isEqualTo(1.1);
        assertThat(config.getBoolean()).isEqualTo(true);

    }
}
