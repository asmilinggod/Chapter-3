
/**
 * Write a description of class ChargeAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ChargeAccount
{
    double previousBalance;    
    double additionalCharges;
    double interest;
    double newBalance;
    double minimumPayment;
    Scanner scan = new Scanner(System.in);

    public void inputPreviousBalance(){
        System.out.print ("Enter the Previous Balance: ");
        previousBalance = scan.nextDouble();
    }
    public void inputAdditionalCharges(){
        System.out.print ("Enter the Additional Charges: ");
        additionalCharges = scan.nextDouble();
    }
    public void computeInterest(){
        interest = 0.02 * (previousBalance + additionalCharges);
    }
    public void computeNewBalance(){
        newBalance = previousBalance + additionalCharges + interest;
    }
    public void computeMinimumPayment(){
        
        if (newBalance < 50){
            minimumPayment = newBalance;
        }
        if (newBalance >= 50 && newBalance <= 300){
            minimumPayment = 50;
        }
        if (newBalance > 300) {
            minimumPayment = newBalance/5;
        }
    }
    public void makeTable(){
        System.out.println("CS CARD International Poop");
        System.out.println("==========================");
        System.out.println();
        System.out.println("Previous Balance:\t$" + previousBalance);
        System.out.println("Additional Charges:\t$" + additionalCharges);
        System.out.println("interest:\t$" + interest);
        System.out.println();
        System.out.println("New Balance: \t$" + newBalance);
        System.out.println();
        System.out.println("Minimum Payment:\t$" + minimumPayment);
    }
        
    public void makeHeader(){

    }
    public void printOneLine(){
        
    }
}


