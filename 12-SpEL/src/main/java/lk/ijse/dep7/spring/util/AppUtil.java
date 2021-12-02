package lk.ijse.dep7.spring.util;

import lk.ijse.dep7.spring.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class AppUtil {

    public static int age = 50;

    public static List<Student> getAllStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("S001", "Aruni"));
        studentList.add(new Student("S002", "Randunu"));
        studentList.add(new Student("S003", "Pethum"));
        studentList.add(new Student("S004", "Sovis"));
        studentList.add(new Student("S005", "Hamza"));
        return studentList;
    }

    public static List<Student> getAllStudents2(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("S006", "Gayal"));
        studentList.add(new Student("S007", "Dinusha"));
        studentList.add(new Student("S008", "Dulanga"));
        studentList.add(new Student("S009", "Manoj"));
        studentList.add(new Student("S010", "Chaminda"));
        return studentList;
//        return null;
    }

}
