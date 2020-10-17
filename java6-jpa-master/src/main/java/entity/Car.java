package entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Car {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegiesterNumber() {
        return regiesterNumber;
    }

    public void setRegiesterNumber(String regiesterNumber) {
        this.regiesterNumber = regiesterNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String regiesterNumber;
    private String model;

}
