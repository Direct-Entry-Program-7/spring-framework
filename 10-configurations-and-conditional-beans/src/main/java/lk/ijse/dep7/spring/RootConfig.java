package lk.ijse.dep7.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


@ImportResource({"classpath:beans.xml", "file:/home/ranjith-suranga/Desktop/beans.xml"})
@Import({AppConfig.class, AppConfig2.class})
@Configuration
public class RootConfig {
}
