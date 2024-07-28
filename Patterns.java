//Also Example of nested loop
import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        //Solid Rectangle
        // ****
        // ****
        // ****
        // ****
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 rectangle dimentions");
        int n = sc.nextInt();
        int m = sc.nextInt();

        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j<= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Hollow Rectangle
        // ****
        // *  *
        // *  *
        // ****
        
        for(int i = 1; i <= n; i++){
            for(int j=1; j <= m; j++){
                //cell position -> (i,j)
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Half Pyramid
        // *
        // **
        // ***
        // ****
        
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted half pyramid
        // ****
        // ***
        // **
        // *
       
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //half pyramid but rotated 180 degree
        //    *
        //   **
        //  ***
        // ****
        
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            
            //another loop -> star print
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //half pyramid with numbers
        // 1
        // 12
        // 123
        // 1234
        
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //inverted half pyramids with numbers
        // 12345
        // 1234
        // 123
        // 12
        // 1

        // method 1
        int n = 5;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // method 2
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //Floyd's Triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        
        int n = 5;
        int number = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        //0-1 triangle
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        //Assignment 1
        //Solid Rhombus
        //    ****
        //   **** 
        //  ****
        // ****   

        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Assignment 2
        //Print pyramid
        //        1
        //       2  2
        //     3   3   3
        //   4   4   4   4
        // 5   5   5   5   5

        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }

            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }

            System.out.println();
        }


    }
}