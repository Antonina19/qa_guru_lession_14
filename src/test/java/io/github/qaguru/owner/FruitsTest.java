package io.github.qaguru.owner;

import io.github.qaguru.owner.config.FruitsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {
    @Test
    public void testFruits() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsArray()).contains("banana", "orange");
        assertThat(config.getFruitsList()).contains("apple", "lemon");
        assertThat(config.getFruitsListSlash()).contains("banana", "orange");

    }
}
