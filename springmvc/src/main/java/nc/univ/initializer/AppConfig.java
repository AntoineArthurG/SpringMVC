package nc.univ.initializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * AppConfig
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "nc.univ")
public class AppConfig {

    
}