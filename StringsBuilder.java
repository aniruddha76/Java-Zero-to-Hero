import java.util.Scanner;

public class StringsBuilder {
    public static void main(String[] args) {

        //Declaring String Builder
        StringBuilder sb = new StringBuilder("Aniruddha");

        //Chat at index 0
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        //Set char at index
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        //Insert into string
        sb.insert(0, 'A');
        System.out.println(sb);

        sb.insert(2,'N');
        System.out.println(sb);

        //Delete from string starting index and ending index(non-exclusive)
        sb.delete(1, 3);
        System.out.println(sb);

        //Append to string
        sb.append(" Ravindra");
        sb.append(" Thakur");

        System.out.println(sb);

        //Length
        System.out.println(sb.length());

        //Assignment 1
        //reverse a given string

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String userString = sc.next();

        StringBuilder sb = new StringBuilder(userString);

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
