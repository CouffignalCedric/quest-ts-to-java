public class User {
    // birthdate: Date;
    // size: number;
    // photos: Photo[];
    // address: Address;  
    public String birthdate;
    public int size;
    public Photo photos;
    public Address address;

    public User(String birthDate,int size, Photo photos, Address address) {
        this.birthdate = "birthdate";
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public int getSize() {
        return size;
    }

    public Photo getPhoto() {
        return getPhoto();
    }

    public Address getAddress() {
        return address;
    }
}

