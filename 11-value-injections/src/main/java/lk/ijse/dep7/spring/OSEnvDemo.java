package lk.ijse.dep7.spring;

import java.util.Map;

public class OSEnvDemo {

    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        for (String var : env.keySet()) {
            System.out.printf("%s: %s \n", var, env.get(var));
        }
    }
}
