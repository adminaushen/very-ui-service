package au.com.aushen.very.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletContainerConfiguration {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(ServletContainerConfiguration.class);

    @Bean
    public UndertowEmbeddedServletContainerFactory embeddedServletContainerFactory() {
        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory();
        factory.addBuilderCustomizers(x -> {
            LOGGER.info("UNDERTOW - Set buffer size to 32k");
            x.setBufferSize(32 * 1024);
        });
        return factory;
    }

}
