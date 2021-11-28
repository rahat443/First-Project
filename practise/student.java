package practise;

import java.util.Scanner;

import javax.script.ScriptEngineFactory;
import javax.sound.sampled.SourceDataLine;

public class student {
    
    private String Name;
    private String section;
    private String group;
    private int roll;
    private long amount;
    public String getName() {
        return Name;
    }
    public void setName(String name) 
    {
        Name = name;
    }
    public String getSection() 
    {
        return section;
    }
    public void setSection(String section) 
    {
        this.section = section;
    }
    public String getGroup() 
    {
        return group;
    }
    public void setGroup(String group) 
    {
        this.group = group;
    }
    public int getRoll() 
    {
        return roll;
    }
    public void setRoll(int roll) 
    {
        this.roll = roll;
    }
    public long getAmount() 
    {

        System.out.print("Enter your Name :");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.print("Enter your section :");
        String section1 = sc.nextLine();
        System.out.println("Enter your Group :");
        String group1 = sc.nextLine();
        System.out.println("Enter your roll :");
        int roll1 = sc.nextInt();
        if(name1.equals(Name)){
            if(section1 == section){
                if (group1 == group) {
                    if (roll1 == roll) {
                        System.out.println("Your Amount is "+50000);
                    }
                }
            }
        }else{
            System.out.println("Your information are envalide");
        }
    
        return amount;
    }
    public void setAmount(long amount) 
    {
        this.amount = amount;
    }


    
}
