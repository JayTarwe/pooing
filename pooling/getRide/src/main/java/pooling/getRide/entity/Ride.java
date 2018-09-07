package pooling.getRide.entity;

import  java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Ride")
public class Ride {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="member_car_id")
    private int memberCarId;
    @Column (name = "travel_start_time")
    private Date start_time;
    @Column (name = "source_location")
    private String sourceLocation;
    @Column (name="destination_location")
    private String destinationLocation;
    @Column (name="seats_offered")
    private int seats_offered;
    @Column (name="contribution_per_head")
    private int contributionPerHead;
    @Column (name="luggage")
    private  String luggage;
    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberCarId() {
        return memberCarId;
    }

    public void setMemberCarId(int memberCarId) {
        this.memberCarId = memberCarId;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public int getSeats_offered() {
        return seats_offered;
    }

    public void setSeats_offered(int seats_offered) {
        this.seats_offered = seats_offered;
    }

    public int getContributionPerHead() {
        return contributionPerHead;
    }

    public void setContributionPerHead(int contributionPerHead) {
        this.contributionPerHead = contributionPerHead;
    }

    public String getLuggage() {
        return luggage;
    }

    public void setLuggage(String luggage) {
        this.luggage = luggage;
    }

}
