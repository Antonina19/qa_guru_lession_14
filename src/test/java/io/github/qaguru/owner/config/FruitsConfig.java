package io.github.qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Separator(",")
    @DefaultValue("banana,orange")
    String[] getFruitsArray();

    @Separator(",")
    @DefaultValue("apple,lemon")
    List<String> getFruitsList();

    @Separator("/")
    @DefaultValue("banana/orange")
    List<String> getFruitsListSlash();

}
