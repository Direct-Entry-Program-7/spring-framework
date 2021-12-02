package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PropertyInjection {

    @Value("${DESKTOP_SESSION}")
    private String osEnv;

    @Value("${java.io.tmpdir}")
    private String tempPath;

    @Autowired
    private Environment env;

    @Value("${dep7.name}")
    private String dep7Description;

    @Autowired
    @PostConstruct
    public void init() {
        System.out.println("OS Env Injections");
        System.out.println("-----------------");
        System.out.println(osEnv);
        System.out.println("------------------");
        System.out.println("JVM Env Injections");
        System.out.println("-----------------");
        System.out.println(tempPath);
        System.out.println("------------------");
        System.out.println("Resource Bundle Injections");
        System.out.println("-----------------");
        System.out.println(env.containsProperty("dep7.name"));
        System.out.println(dep7Description);
        //System.out.println(env.getProperty("dep7.name123"));
        //System.out.println(env.getRequiredProperty("dep7.name123"));
    }
}
