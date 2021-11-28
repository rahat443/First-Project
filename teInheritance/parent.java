package teInheritance;




class Animal{
    void Bulk(){
        System.out.println("Animal is bulking");
    }void Sleep(){
        System.out.println("Animal is Sleeping");
    }void Walking(){
        System.out.println("Animal is Walking");
    }
}
class Dog extends Animal{
    void Gau(){
        System.out.println("Dog id gauing");
    }void bau(){
        System.out.println("Dog is bauing");
    }void sau(){
        System.out.println("Dog is sauing");
    }
}

class Cat extends Dog{
    String name;
    void mau(){
        System.out.println("Cat is mauing");
    }
    void gau(){
        System.out.println("Cat is gauing");
    }void lau(){
        System.out.println("Cat is lauing");
    }
    
}

public class parent {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.Bulk();
        animal.Sleep();
        animal.Walking();

        Dog dog = new Dog();
        dog.Gau();
        dog.Bulk();
        dog.sau();

        Cat cat = new Cat();
        cat.Bulk();
        cat.Gau();
        cat.Sleep();
        cat.Sleep();
        cat.Walking();
        cat.sau();
        
    }
}
