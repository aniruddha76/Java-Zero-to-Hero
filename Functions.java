import java.util.Scanner;

public class Functions {
    public static void printMyname(String name){
        System.out.print("Your Name is: ");
        System.out.print(name);
        return;
    }
    
    public static int addTwoNumbers(int a, int b){
        int sum = a + b;
        System.out.print("Total is: ");
        return sum;
    }

    public static int multiplyTwoNumbers(int a, int b){
        return a * b;
    }
    
    public static void printFactorial(int n){
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }
        
        int factorial = 1;
        for(int i = n; i >=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyname(name);

        System.out.print("\nNumber 1: ");
        int a = sc.nextInt();
        
        System.out.print("Number 2: ");
        int b = sc.nextInt();

        int sum = addTwoNumbers(a, b);
        System.out.println(sum);

        System.out.print("Multplication: " + multiplyTwoNumbers(a, b));

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
