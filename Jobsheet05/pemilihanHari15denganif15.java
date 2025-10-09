package Jobsheet05;
import java.util.Scanner;

public class pemilihanHari15denganif15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberType = 7;
        String weekday,weekend;
        System.out.println("masukkan numberType");
        numberType = sc.nextInt();

        if (numberType >=1 && numberType<= 5) 
        System.out.println("weekday");
        else if (numberType == 6 || numberType == 7)
        System.out.println("weekend");
        else 
        System.out.println("invalid number");
        
        
        
        

        
        }
         
        

        



            }
    
    

