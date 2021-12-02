package lk.ijse.dep7.spring.bean;

import lk.ijse.dep7.spring.entity.Student;
import lk.ijse.dep7.spring.util.AppUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SpELBean4 {

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).allStudents.?[getName() matches '.*[Aa].*']}")
    private List<Student> studentList1;

    @PostConstruct
    public void init(){
        System.out.println(studentList1);
    }
}
