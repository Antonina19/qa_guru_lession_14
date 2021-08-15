package io.github.qaguru.owner.config;

import org.aeonbits.owner.Config;

public interface PrimitiveTypesConfig extends Config {

    @DefaultValue("hello")
    String getString();

    @DefaultValue("1")
    long getLong();

    @DefaultValue("1")
    int getInteger();

    @DefaultValue("1.1")
    double getDouble();

    @DefaultValue("true")
    boolean getBoolean();
}
