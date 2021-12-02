package lk.ijse.dep7.spring.util;

import lk.ijse.dep7.spring.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class AppUtil {

    public static int age = 50;

    public static List<Student> getAllStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("S001", "Aruni", "Matara"));
        studentList.add(new Student("S002", "Randunu", "Colombo"));
        studentList.add(new Student("S003", "Pethum", "Galle"));
        studentList.add(new Student("S004", "Sovis", "Moratuwa"));
        studentList.add(new Student("S005", "Hamza", "Colombo"));
        return studentList;
    }

    public static List<Student> getAllStudents2(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("S006", "Gayal", "Kandy"));
        studentList.add(new Student("S007", "Dinusha", "Colombo"));
        studentList.add(new Student("S008", "Dulanga", "Colombo"));
        studentList.add(new Student("S009", "Manoj", "Galle"));
        studentList.add(new Student("S010", "Chaminda", "Matara"));
//        return studentList;
        return null;
    }

}
