package series;

import java.util.Scanner;

public class firstClPra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i = i+1){
            sum = sum*i;

            System.out.println(i+"X"+i + "="+i*i);
        }
        System.out.println();
        System.out.println(sum);

        
       
    }
}
