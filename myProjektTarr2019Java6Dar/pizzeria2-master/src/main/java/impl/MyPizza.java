package impl;

import api.IPizza;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

//@Component
@PropertySource("pizza.properties")
=======

>>>>>>> d62083fb5d87ac058bde384760dc4f6cea59d103
public class MyPizza implements IPizza {

    private String name;
    private double price;

<<<<<<< HEAD
    public MyPizza(@Value ( "${name}" ) String name,@Value("${price}") double price) {
        this.name = name;
        this.price = price;
    }

    //public MyPizza() {
      //  setName("Margherita");
        //setPrice(12.5);
   // }

=======
    public MyPizza() {
        setName("Margherita");
        setPrice(12.5);
    }

>>>>>>> d62083fb5d87ac058bde384760dc4f6cea59d103
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
