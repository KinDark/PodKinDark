package config;

import api.IOrder;
import api.IPizza;
import impl.MyOrder;
import impl.MyPizza;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("impl")
//@ImportResource("konfiguracja.xml")
public class Config {

//    @Bean(name ="mojaPizza")
//    IPizza myPizza(){
//        return new MyPizza ("Margherita", 22);

//    }
//    @Bean(name="mojeZamowienie")
//    IOrder myOrder(IPizza pizza){
//        return new MyOrder (pizza);
//
//    }
}

