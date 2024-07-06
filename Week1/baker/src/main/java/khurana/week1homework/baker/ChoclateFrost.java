package khurana.week1homework.baker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cake.flavor.frost", havingValue ="Chocolate")
public class ChoclateFrost implements Frosting {

    @Override
    public void getFrostingType() {
        System.out.println("Chocolate Frosting");
    }
}
