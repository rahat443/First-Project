package switching;
import java.util.Scanner;

public class practiseSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        String name = scanner.nextLine();

        switch(name){
            case "Rahat":
            System.out.println("I am Rahat Chowdhury");
            break;
            case "Aftab":
            System.out.println("I am Afrab");
            break;
            case "Efat":
            System.out.println("I am Efath");
            break;
            case "Jamil":
            System.out.println("I am jamil");
            break;
            case "Siyam":
            System.out.println("I am Siyam");
            break;
        }
    }
}
