import api.IOrder;
import api.IPizza;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
<<<<<<< HEAD
import config.Config;
import impl.InnaPizza;
import impl.MyOrder;
import impl.MyPizza;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("mojeZamowienie")
=======
import impl.InnaPizza;
import impl.MyOrder;
import impl.MyPizza;

>>>>>>> d62083fb5d87ac058bde384760dc4f6cea59d103
public class Pizzeria {
    public static void main(String[] args) {

        // Podejście klasyczne
        // To jest konfiguracja programu
<<<<<<< HEAD
       // IPizza pizza = new InnaPizza();
      //  IOrder order = new MyOrder(pizza);

        // Logika biznesowa

       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ( "konfiguracja.xml" );
      //  MyOrder order =(MyOrder) context.getBean ( "myOrder");
       // MyOrder order2 = context.getBean("innyOrder", MyOrder.class);

        // Rozwiązania na stringu z klasą konfiguracyjną

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext ( Config.class );
        MyOrder order = context.getBean ( "mojeZamowienie", MyOrder.class );

=======
        IPizza pizza = new InnaPizza();
        IOrder order = new MyOrder(pizza);

        // Logika biznesowa
>>>>>>> d62083fb5d87ac058bde384760dc4f6cea59d103
        order.printOrder();

    }
}
