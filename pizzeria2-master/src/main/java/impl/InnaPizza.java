package impl;

import api.IPizza;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Primary
@Repository
@Service
@Qualifier("innaPizza")
@PropertySource ("pizza.properties" )

public class InnaPizza implements IPizza {
    @Value( "Hawajska z pola" )
    private String name;
    @Value ("40")
=======

public class InnaPizza implements IPizza {
    private String name;
>>>>>>> d62083fb5d87ac058bde384760dc4f6cea59d103
    private double price;

    public InnaPizza() {
        setName("Hawajska");
        setPrice(15.5);
    }
<<<<<<< HEAD
@Value("${inna name}")
    public String getName() {
        return name;
    }
@Value ( "${inna price}")
=======

    public String getName() {
        return name;
    }

>>>>>>> d62083fb5d87ac058bde384760dc4f6cea59d103
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
