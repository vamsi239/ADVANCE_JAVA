package oneToone;

import jakarta.persistence.*;

@Entity
public class SmartPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;

    @OneToOne(mappedBy = "phone", cascade = CascadeType.ALL)
    private SIMLock simLock;

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public SIMLock getSimLock() {
        return simLock;
    }

    public void setSimLock(SIMLock simLock) {
        this.simLock = simLock;
    }
}