package lk.ijse.dep7.spring.bean;

import lk.ijse.dep7.spring.entity.Student;
import lk.ijse.dep7.spring.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Component
public class SpELBean4 {

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).allStudents.?[getName() matches '.*[Aa].*']}")
    private List<Student> studentList1;

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).allStudents.?[getAddress() matches 'Colombo']}")
    private List<Student> studentList2;

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).allStudents.^[getAddress() matches 'Colombo']}")
    private Student first;

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).allStudents.$[getAddress() matches 'Colombo']}")
    private Student last;

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).allStudents.![getName()]}")
    private List<String> nameList;

    @Value("#{T(lk.ijse.dep7.spring.util.AppUtil).allStudents.?[getName() matches '.*[Aa].*'].![address]}")
    private List<String> addressList;

    @Value("#{@spELBean1.names.?[toString().contains('w') || toString().contains('u')]}")
    private List<String> nameList2;

//    @Value("#{@students.![value].?[getAddress() matches 'Galle'].![name]}")
    //@Value("#{@students.?[getValue().address matches 'Galle'].![value].![name]}")
    //private List<String> students;

    //@Value("#{@students.?[value.getAddress() matches 'Galle'].![value.name]}")
    @Value("#{@students.?[value.getAddress() matches 'Galle'].![value].![name]}")
    //private Map<String, Student> listOfStudents;
    private List<String> listOfStudents;

    @PostConstruct
    public void init(){
        System.out.println(studentList1);
        System.out.println(studentList2);
        System.out.println(first);
        System.out.println(last);
        System.out.println(nameList);
        System.out.println(addressList);
        nameList2.forEach(System.out::println);
        System.out.println("------------------------");
        System.out.println(listOfStudents);
    }
}
