package lk.ijse.dep7.spring;

import java.util.Properties;

public class JVMEnvDemo {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (Object property : properties.keySet()) {
            System.out.printf("%s: %s \n", property, properties.get(property));
        }
    }
}
