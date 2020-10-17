package entity;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

@Entity

public class Project<members> {
    @IgnoreForBinding
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany
    private Set<Person> members = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public getSet() {
        return Set;
    }

    public <set> void setSet(private set) {
        Set = set;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '' +
                ", Set=" + Set +
                '}';
    }
}
