package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class SpELBean2 {

    @Value("#{{'ijse','nsbm', 'esoft', 'sliit'}}")
    private List<String> names;

    @Value("#{{10,20,30}}")
    private List<Integer> numbers;

    @Value("#{{id:'C001',name:'Kasun', address: 'Galle'}}")
    private Map<String, String> properties;

    @Value("#{new String[]{'galle', 'panadura', 'kalutara'}}")
    private String[] addresses;

    @Value("#{new int[2][2]}")
    private int[][] matrixArray;

    @PostConstruct
    public void init(){
        System.out.println(names);
        System.out.println(numbers);
        System.out.println(properties);
        System.out.println(Arrays.toString(addresses));
        matrixArray[0][0] = 10;
        System.out.println(matrixArray[0][0]);
    }
}
