package com.github.orimajp.docman.system.modelmapper;

import com.github.rozidan.springboot.modelmapper.ConfigurationConfigurer;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperConfig extends ConfigurationConfigurer {

    @Override
    public void configure(Configuration configuration) {
        configuration.setMatchingStrategy(MatchingStrategies.STRICT);
    }

}
