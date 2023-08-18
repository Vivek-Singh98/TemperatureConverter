package AIntenship;
import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Make your choice :");
        System.out.println("For Celsius  to Fahrenheit press  ---> 1");
        System.out.println("For Fahrenheit to Celsius  press ---->2");
        int n = sc.nextInt();
        if(n ==1){
            System.out.println("You have chosen Celsius  to Fahrenheit");
             System.out.println("Enter the Celsius value ");
            double m = sc.nextDouble();
           
            double result = (m*9/5)+32;
            System.out.print("Fahrenheit is : " );
            System.out.println(Math.round(result*10.0)/10.0);

        }
        else if (n==2){
            System.out.println("you have chosen Fahrenheit to Celsius ");
            System.out.println("Enter your Fahrenheit value");
            double m = sc.nextDouble();
            System.out.print("Celsius value is :");
            Double result = (m-32)*5/9;
            System.out.println(Math.round(result*10.0)/10.0);


        }
        else {
            System.out.println("PLEASE!!! ENTER A VALID CHOICE!");
        }
    }
}
