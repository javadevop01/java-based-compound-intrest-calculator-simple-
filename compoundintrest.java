//import java.security.Principal;
import java.util.*;
public class compoundintrest {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

       System.out.print("ENTER THE PRINCIPAL VALUE:: ");
       double PRINCIPAL = input.nextDouble();

       System.out.print("ENTER THE RATE :: ");
       double RATE = input.nextDouble();

       System.out.print("ENTER THE TIME:: ");
       double TIME = input.nextDouble();

       System.out.print("enter the times the intrest is compounded :: ");
       int number = input.nextInt();

       double intrest = PRINCIPAL * (Math.pow((1+ (RATE/100)),(TIME *number)))-PRINCIPAL;
       //double anual_INTREST = PRINCIPAL*(Math.pow((1+RATE),(number)))- PRINCIPAL;
       double anual_INTREST = Math.pow(1+(RATE/number),(number-1));
       double additional__payment= (PRINCIPAL * RATE) / (1 - Math.pow(1 + RATE, -TIME));
       System.out.println("YOUR PRINCIPAL IS :: " + PRINCIPAL);
       System.out.println("YOUR INTREST RATE IS :: " + RATE);
       System.out.println("YOUR TIME DURATION IS :: " + TIME);
       System.out.println("YOUR NUMBER OR VALUE OF N IS :: " + number);
       System.out.println("YOUR COMPOUND INTREST IS :: " + intrest);
       System.out.println("YOUR ANUAL INTREST RATE :: "+ anual_INTREST);
       System.out.println("YOUR ADDITIONAL PAYMENT IS  :: "+additional__payment);
    }

    
}
