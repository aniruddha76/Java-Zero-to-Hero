import java.util.*;

public class Loops {
    public static void main(String[] args) {
        //for loop
        for(int i = 0; i < 3; i++){
            System.out.println("Hello");
        }

        // Mid video Assignment
        // print numbers from 0 to 10
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //while Loop
        // int i = 0;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }

        //Do while loop
        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i <= 10);

        //Assignment 1
        //sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);

        //Assignment 2
        // Table of given number
        int number = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(number * i);
        }

        //Assignment 3
        //print all even numbers till given number
        int num1 = sc.nextInt();
        for(int i = 1; i <= num1; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
