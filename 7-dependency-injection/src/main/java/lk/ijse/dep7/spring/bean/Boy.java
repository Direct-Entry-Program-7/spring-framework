package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Boy implements DI{

    private GoodGirl gf;

//    @Qualifier("sudu")
    @Autowired
//    private Map<String, GoodGirl> goodGirls;
//    private List<GoodGirl> goodGirls;
    private GoodGirl[] goodGirls;

//    public void listAllGirlFriends(){
//        goodGirls.forEach((beanId, goodGirl) -> System.out.println(beanId + ": " + goodGirl));
//    }

    public void listAllGirlFriends(){
        for (GoodGirl goodGirl : goodGirls) {
            System.out.println(goodGirl);
        }
    }

    //@Autowired
//    public Boy(GoodGirl gf) {
//       this.gf = gf;
//    }


//    @Autowired
//    public void setGf(GoodGirl gf) {
//        System.out.println("Invoked?");
//        this.gf = gf;
//    }

    public void kissHer(){
        gf.kiss();
    }

    @Usai
    @Qualifier("sudu")
    @Autowired
    @Override
    public void inject(GoodGirl gf) {
        System.out.println("Invoked?");
        this.gf = gf;
    }
}
