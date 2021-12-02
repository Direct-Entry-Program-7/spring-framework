package lk.ijse.dep7.spring.bean;

import lk.ijse.dep7.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SpELBean3 {

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).getAllStudents()}")
    private List<Student> studentList;

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).age}")
    private int age;

//    @Value("#{new lk.ijse.dep7.spring.entity.Student('S001', 'Nuwan')}")
    @Value("#{@student}")
    private Student student;

    @Value("#{@student.getName().toUpperCase()}")
    private String name;

    @PostConstruct
    public void init() {
        studentList.forEach(System.out::println);
        System.out.println(age);
        System.out.println(student);
        System.out.println(name);
    }
}
