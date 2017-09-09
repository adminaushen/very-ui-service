package au.com.aushen.very.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@Import({
        ServletContainerConfiguration.class
})
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {

}
