package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


public class Addres {
    private String street;
    private String city;
    private String email;

    Addres address;
    @OneToOne(cascade= CascadeType.REMOVE)
    private Car car;
    @OneToMany(mappedBy = "person", fetch  = FetchType.EAGER")
    private Set<Order> orders = new HashSet<> ();

    @ManyToMany (mappedBy = "Members", fetch= FetchType.LAZY)
    private Set<Project> projects = new HashSet<> ();





    public Addres(String street, String city, String email) {
        this.street = street;
        this.city = city;
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Addres{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", car=" + car +
                ", orders=" + Orders () +
                ", projects=" + projects +
                       '}';
    }

}

    public void setEmail(String email) {
        this.email = email;

    }
}


