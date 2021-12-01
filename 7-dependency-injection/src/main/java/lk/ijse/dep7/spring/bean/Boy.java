package lk.ijse.dep7.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy implements DI{

    private GoodGirl gf;

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

    @Qualifier("sudu")
    @Autowired
    @Override
    public void inject(GoodGirl gf) {
        System.out.println("Invoked?");
        this.gf = gf;
    }
}
