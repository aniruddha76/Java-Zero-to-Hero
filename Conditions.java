import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //if else statement
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }

        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        //method 1 new method
        if(num1 == num2){
            System.out.println("Numbers are Equal");
        } else if(num1 > num2){
            System.out.println("Number 1 is grater");
        } else {
            System.out.println("Number 2 is geater");
        }

        //method 2 this method is older
        if(num1 == num2){
            System.out.println("Equal");
        } else {
            if(num1 > num2){
                System.out.println("number 1 is greater");
            } else {
                System.out.println("number 2 is greater");
            }
        }

        //Switch Statement
        int button = sc.nextInt();

        // lets do it first with if else statement
        if(button == 1){
            System.out.println("hello");
        } else if(button == 2){
            System.out.println("namaste");
        } else if(button == 3){
            System.out.println("Bonjour kuch lassan");
        } else {
            System.err.println("Invalid");
        }

        //now with Switch Statement
        switch (button) {
            case 1: System.out.println("Hello");
                
                break;
            case 2: System.out.println("Namaste");
                
                break;
            case 3: System.out.println("Bonjour kuch lassan");
                
                break;
        
            default: System.out.println("invalid");
                break;
        }


        //Assignment 1 Calculator
        System.out.println("Provide 2 Numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("Choose Operation\n1.Add\n2.Sub\n3.Multiply\n4.Modulo\n5.Devide");
        int option = sc.nextInt();

        switch (option) {
            case 1: System.out.println(number1 + number2);
                
                break;
            case 2: System.out.println(number1 - number2);
                
                break;
            case 3: System.out.println(number1 * number2);
                
                break;
            case 4: System.out.println(number1 % number2);
                
                break;
            case 5: System.out.println(number1 / number2);
                
                break;
        
            default: System.out.println("Invalid Option");
                break;
        }

        //Assignment 2
        System.out.println("Enter Month Number");
        int month = sc.nextInt();

        switch (month) {
            case 1: System.out.println("January");
                
                break;
            case 2: System.out.println("February");
                
                break;
            case 3: System.out.println("March");
                
                break;
            case 4: System.out.println("April");
                
                break;
            case 5: System.out.println("May");
                
                break;
            case 6: System.out.println("June");
                
                break;
            case 7: System.out.println("July");
                
                break;
            case 8: System.out.println("August");
                
                break;
            case 9: System.out.println("September");
                
                break;
            case 10: System.out.println("October");
                
                break;
            case 11: System.out.println("November");
                
                break;
            case 12: System.out.println("Deember");
                
                break;
        
            default: System.out.println("Invalid Month");
                break;
        }
    }
}
