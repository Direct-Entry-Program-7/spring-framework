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

    @Value("#{@student.id matches 'S\\d{3}'}")
    private boolean validID;

    @Value("#{10 + T(lk.ijse.dep7.spring.util.AppUtil).age}")
    private int sum;

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).age ge 40}")
    private boolean isOld;

//    @Value("#{(T(lk.ijse.dep7.spring.util.AppUtil).getAllStudents2() ne null)? " +
//            "T(lk.ijse.dep7.spring.util.AppUtil).getAllStudents2() : " +
//            "T(lk.ijse.dep7.spring.util.AppUtil).getAllStudents()}")
    @Value("#{(T(lk.ijse.dep7.spring.util.AppUtil).getAllStudents2())?:T(lk.ijse.dep7.spring.util.AppUtil).getAllStudents()}")
    private List<Student> studentList2;

    @PostConstruct
    public void init() {
        studentList.forEach(System.out::println);
        System.out.println(age);
        System.out.println(student);
        System.out.println(name);
        System.out.println(validID);
        System.out.println(sum);
        System.out.println(isOld);
        studentList2.forEach(System.out::println);
    }
}
