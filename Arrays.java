import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //method 1
        int[] marks = new int[3];
        
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        
        //method 2
        int age[] = new int[5];

        age[0] = 21;
        age[1] = 20;
        age[2] = 19;
        age[3] = 18;
        age[4] = 15;

        //method 3
        int numbers[] = {1,2,3,4,5,6,7,8,9};

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i = 0; i < 3; i++){
            System.out.println(marks[i] + " ");
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println(age[i] + " ");
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        //method 4: taking input from user
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int nums[] = new int[size];

        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print(nums[i] + " ");
        }

        //Assignment 1
        //Take Array from user and search x number

        System.out.print("Enter Size of array: ");
        int size2 = sc.nextInt();
        
        int userArray[] = new int[size2];
        
        System.out.println("Enter Array Elements: ");
        for(int i = 0; i < size2; i++){
            userArray[i] = sc.nextInt();
        }

        System.out.print("Enter Number to search: ");
        int x = sc.nextInt();

        //Used arrayName.length if there us no size
        for(int i = 0; i < userArray.length; i++){
            if(userArray[i] == x){
                System.out.print("Found at index: " + i);
            }
        }
    }
}