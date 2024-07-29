import java.util.Scanner;

public class Exercise{

    public static void sumOfAllOddNumbers(int n){
        int sumOfOdd = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                sumOfOdd += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sumOfOdd);
    }

    public static int greaterNumber(int num1, int num2){
        if(num1 > num2){
            return num1;
        } else if(num2 > num1){
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Enter 3 numbers from users and print average
        System.out.println("Enter 3 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = (a + b + c) / 2;
        System.out.println("Average of given numbers: " + sum);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sumOfAllOddNumbers(n);

        //Greater Number among 2
        System.out.println("Enter 2 Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int greaterNumber = greaterNumber(num1, num2);
        System.out.println("Greater Number is: " + greaterNumber);

        //write a program to take number from user and print fibonaci series
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        
        int first = 0; 
        int second = 1;
        for(int i = 0; i <= number; i++){
            
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        //infinite loop using do while
        do{
            System.out.println("infinite");
        } while (true);
    }
}