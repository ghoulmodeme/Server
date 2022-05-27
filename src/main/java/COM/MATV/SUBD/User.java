package COM.MATV.SUBD;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public User() {
    }

    public User(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
