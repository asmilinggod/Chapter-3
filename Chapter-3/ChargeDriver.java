
/**
 * Write a description of class ChargeDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChargeDriver
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
