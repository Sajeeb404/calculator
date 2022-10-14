
/**************This is my first calculator project **************/
import java.util.*;
public class Calculator {   
    public static void main(String[] args){
        
        Scanner sce = new Scanner(System.in);
               
        System.out.println("Enter 1st number ");
        int a = sce.nextInt();
        System.out.println("Enter oparator.");
        char b = sce.next().charAt(0);
        System.out.println("Enter 2nd number ");
        int c = sce.nextInt();
                
        switch(b){
            
            case '+' : System.out.println(a + c);
                break;
            case '-' : System.out.println(a - c);
                break;
            case '*' : System.out.println(a * c);
                break;
            case '/' : System.out.println(a / c);
                break;
            case '%' : System.out.println(a % c);
                break;
            default : System.out.println("Please correct oparator.");
    
    
    }
    
    }
    
}
