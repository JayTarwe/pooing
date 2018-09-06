package pooling.getRide.entity;

import javax.persistence.*;

@Entity
@Table(name = "Riders")
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;
    @Column (name = "name")
    private String name;
    @Column (name = "address")
    private String address;
    @Column (name = "email")
    private String email;
    @Column (name = "ct_no")
    private String ctNo;
    @Column (name = "rating")
    private float rating;
    @Column (name = "ride_count")
    private int rideCount;

    public int getRideCount() {
        return rideCount;
    }

    public void setRideCount(int rideCount) {
        this.rideCount = rideCount;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCtNo() {
        return ctNo;
    }

    public void setCtNo(String ctNo) {
        this.ctNo = ctNo;
    }
}
