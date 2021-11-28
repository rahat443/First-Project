package aggreation;

public class Employ {
    int id;
    String name;
    Address address;
    public Employ(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    void display(){
        System.out.println(id+ " "+ name);
        System.out.println(address.getCity() + " " + address.getCountry() + " " + address.getDivis 
        Address address1 = new Address("Habiganj,","Dhak,","Bangladesh");
        Employ employ = new Employ(101, "Rahat", address1);

        employ.display();

    }

    
    
}
