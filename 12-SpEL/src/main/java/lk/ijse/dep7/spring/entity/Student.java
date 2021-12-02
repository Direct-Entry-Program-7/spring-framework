package lk.ijse.dep7.spring.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private String id;
//    @Setter(AccessLevel.NONE)
    private String name;

//    public String getId(){
//        return "S001";
//    }
}
