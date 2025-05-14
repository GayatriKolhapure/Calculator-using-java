import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        long n1;
        System.out.println("N1 = ");
        n1 = sc.nextLong();
       

        long n2;
        System.out.println("N2 = ");
        n2 = sc.nextLong();

        System.out.println("Enter Operator");

        char op;

        op = sc.next().charAt(0);
        sc.close();



        switch(op){
            case '+' :System.out.println(n1+n2); 
                      break;
            case '-' :System.out.println(n1-n2); 
                      break;
            case 'x' :System.out.println(n1*n2); 
                      break;
            case '/' :System.out.println(n1/n2); 
                      break;
            case '%' :System.out.println(n1%n2); 
                      break;
            default : System.out.println("Error");
        }



        
    }
    
}
