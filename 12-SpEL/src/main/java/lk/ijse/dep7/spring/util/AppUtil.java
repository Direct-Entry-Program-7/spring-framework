package lk.ijse.dep7.spring.util;

import lk.ijse.dep7.spring.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class AppUtil {

    public static int age = 25;

    public static List<Student> getAllStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("S001", "Aruni"));
        studentList.add(new Student("S002", "Randunu"));
        studentList.add(new Student("S003", "Pethum"));
        studentList.add(new Student("S004", "Sovis"));
        studentList.add(new Student("S005", "Hamza"));
        return studentList;
    }

}
