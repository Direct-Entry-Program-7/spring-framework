package lk.ijse.dep7.spring;

import lk.ijse.dep7.spring.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    public Student student(){
        return new Student("S010", "Gayal", "Galle");
    }

    @Qualifier("map")
    @Bean
    public Map<String, Student> students(){
        HashMap<String, Student> students = new HashMap<>();
        students.put("S001", new Student("S001", "Gayal", "Galle"));
        students.put("S002", new Student("S002", "Ruwan", "Matara"));
        students.put("S003", new Student("S003", "Kasun", "Colombo"));
        students.put("S004", new Student("S004", "Supun", "Galle"));
        return students;
    }

}
