package encapsulation;

import java.util.Scanner;

public class Employ {

   private String empName;
   private long empAcno;
   private double empBalance;
/*
   public void setempName(String empName){
       this.empName = empName;
   }

   public String getempName(){
       return empName;

   }

*/
public String getEmpName() 
{
    return empName;
}
public void setEmpName(String empName) 
{
    this.empName = empName;
}
public long getEmpAcno()
{

    return empAcno;
}
public void setEmpAcno(long empAcno) 
{
    this.empAcno = empAcno;
}
public double getEmpBalance() 
{

    System.out.print("Rnter your Account Name ");
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    System.out.print("Enter your Account Number");
    long lo = sc.nextLong();

    if(st.equals(empName) && lo == 1947584574){

        System.out.print("Your Balanca is :"+5000);
    }
    else{
        System.out.println("Wrong name or passoword");
    }

    return empBalance;
}
public void setEmpBalance(double empBalance) 
{
    this.empBalance = empBalance;
}








}
