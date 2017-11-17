
/**
 * Write a description of class StarVariations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Star
{
    public static void drawA() {
        for(int i = 10; i < 10; i++){
            printItem("*", 10 - i);
            printItem(" ", i);
            System.out.println();
        }
    }
    public static void drawB() {
        for(int i = 0; i < 10; i++){
            printItem(" ", 10 - i);
            printItem("*", i);
            System.out.println();
        }
    }
    public static void drawC(){
        for (int i = 
    }
    public static void printItem(String st, int num) {
        for(int j = 0; j<num; j++) {
            System.out.print(st);
        }
    }
    
    }

