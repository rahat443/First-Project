package Inheritance;


class Animal{

    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
    void moving(){
        System.out.println("Animal is moving");
    }
}


class Dog extends Animal{
    void bulking(){
        System.out.println("Dog is bulking");

    }
}





public class testInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bulking();
        dog.eat();
        dog.sleep();

    }
    
}
