package khurana.week1homework.baker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "cake.flavor.syrup", havingValue ="Chocolate")
public class ChoclateSyrup implements Syrup{

    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}
