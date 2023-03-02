public class Address {
    // number: string;
    // street: string;
    // city: string;
    // country: string;
    private String number;
    private String street;
    private String city;
    private String country;
    
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
    return this.city;
}
public String getCountry(){
    return this.country;
}

}
