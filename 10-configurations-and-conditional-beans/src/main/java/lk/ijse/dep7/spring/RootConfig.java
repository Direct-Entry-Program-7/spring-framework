package lk.ijse.dep7.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({AppConfig.class, AppConfig2.class})
@Configuration
public class RootConfig {
}
