package student;
import java.util.Scanner;


class placement{
    static void calculator(int a, int b, char choice){
        switch (choice) {
            case '+':
                System.out.println("Addition:" +(a+b));
                break;
        
            case '-':
                System.out.println("Subtraction:" +(a-b));
                break;

            case '*':
                System.out.println("Multiplication:" +(a*b));
                break;    
                				
            case '/':
                try {
                	System.out.println("Division:" +(a/b));
                } catch(ArithmeticException e){
                	System.out.println("Cannot be divided by 0");
                }
            break;
            default:
                System.out.println("-----Invalid choice------");
        }
    }
    public static void main(String[] args){
    			
        Scanner ma = new Scanner(System.in);
        System.out.println("a=");
        int a = ma.nextInt();
        System.out.println("b=");
        int b = ma.nextInt();
        System.out.println("choice=");
        System.out.println("1.addition: +");
        System.out.println("2.Subtraction: -");
        System.out.println("3. Multiplication: *");
        System.out.println("4. Division: /");
        char choice = ma.next().charAt(0);
        calculator(a, b, choice);
    }
}