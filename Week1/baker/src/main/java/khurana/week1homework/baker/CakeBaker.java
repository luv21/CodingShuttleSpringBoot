package khurana.week1homework.baker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Frosting frosting;
    @Autowired
    Syrup syrup;

    void bakeCake(){
        frosting.getFrostingType();
        syrup.getSyrupType();


    }
}
