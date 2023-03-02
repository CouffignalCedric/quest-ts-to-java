import java.util.Date;
import java.util.List;

public class User {
    // birthdate: Date;
    // size: number;
    // photos: Photo[];
    // address: Address;  
    public Date birthdate;
    public int size;
    public List<Photo> photos;
    public Address address;


    public Date getBirthdate() {
        return this.birthdate;
    }

    public int getSize() {
        return size;
    }

    public List<Photo> getPhoto() {
        return this.photos;
    }

    public Address getAddress() {
        return address;
    }
}

