package oneToone;

import jakarta.persistence.*;

@Entity
public class SIMLock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String carrierName;

    @OneToOne
    @JoinColumn(name = "phone_id")   // FK column
    private SmartPhone phone;

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public SmartPhone getPhone() {
        return phone;
    }

    public void setPhone(SmartPhone phone) {
        this.phone = phone;
    }
}