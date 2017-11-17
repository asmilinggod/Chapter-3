
/**
 * Write a description of class StarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StarDriver
{
    
        public static void main (String[] args){
        ChargeAccount charley = new ChargeAccount();
            
        charley.inputPreviousBalance();
        charley.inputAdditionalCharges();
        charley.computeInterest();
        charley.computeNewBalance();
        charley.computeMinimumPayment();
        charley.makeTable();
    }
    
}