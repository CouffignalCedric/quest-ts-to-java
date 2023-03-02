public class Address {
    // number: string;
    // street: string;
    // city: string;
    // country: string;
    public String number;
    public String street;
    public String city;
    public String country;
    
 // constructor
 public Address(String number ){
    this.city="";
    this.country="";
    this.number="";
    this.street="";
 }
public String getNumber(){
    return this.number;
}
public String getStreet(){
    return this.street;
}
public String getCity(){
    return this.street;
}
public String getCountry(){
    return this.country;
}

}
