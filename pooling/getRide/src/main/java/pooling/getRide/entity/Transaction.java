package pooling.getRide.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column (name = "txn_id")
    private int txnId;
    private Date starttime;
    private Date endtime;
    private String Status;
    private int fare;
}
