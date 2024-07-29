import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];
        
        //Outer loop will control numbers of rows
        for(int i = 0; i < rows; i++){
            
            //inner loop will control cols ->
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        //Assignment 1
        //take a matrix from user and search number x

        for(int i = 0; i < rows; i++){
            for(int j = 0;  j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter Number to search: ");
        int x = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(numbers[i][j] == x){
                    System.out.print("Found at index: " + i + " " + j);
                }
            }
        }
    }
}
