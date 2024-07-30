import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // String Declaration
        String name = "Aniruddha";
        String fullName = "Aniruddha Ravindra Thakur";
        String sentence = "Hello! My name is Aniruddha";

        // Take input from user
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        System.out.println("Your Name is: " + userName);

        //Concatination
        String firtName = "Aniruddha";
        String lastName = "Thakur";
        String fullName = firtName + " " + lastName;
        System.out.println(fullName);

        //Length
        System.out.println(fullName.length());

        //charAt
        for(int i = 0; i < fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }

        //Compare
        String name1 = "Aniruddha";
        String name2 = "Aniruddha2";

        //Checks 3 cases
        //1. Str1 > Srt2 : +ve value
        //2. Str1 == Str2 : 0
        //3. Str1 < Str2 : -ve Value

        if(name1.compareTo(name2) == 0){
            System.out.println("\nStrings are equal");
        } else {
            System.out.println("\nNot equal");
        }

        //Using == menthod does compare but fails in many cases
        if(name1 == name2){
            System.out.println("\nStrings are equal");
        } else {
            System.out.println("\nNot equal");
        }

        //Example 1: this example does not return equal

        if(new String("Aniruddha") == new String("Aniruddha")){
            System.out.println("\nStrings are equal");
        } else {
            System.out.println("\nNot equal");
        }

        //Substring
        String sentence = "My name is Aniruddha";
        String name =  "AniruddhaThakur";
        
        String subString = sentence.substring(11, sentence.length());
        String subName = name.substring(0, 9);

        System.out.println(subString);
        System.out.println(subName);

        //Strings are immutable, you cannot modify string after storing it you have to create new string

        //Assignment 1
        //Take Array of strings from user and find the combined length

        System.out.print("Enter length of Array: ");
        int size = sc.nextInt();
        String nameArray[] = new String[size];
        
        int lengthOfStrings = 0;
        System.out.println("Now Enter Strings:");
        for(int i = 0; i < size; i++){
            nameArray[i] = sc.next();
            lengthOfStrings += nameArray[i].length();
        }

        System.out.println("Length of Array of String is: " + lengthOfStrings);

        //Assignment 2
        //take input from user and create a new string replacing e in original input with i

        System.out.print("Enter a string: ");
        String originalString = sc.next();

        String result = "";
        for(int i = 0; i < originalString.length(); i++){
            if(originalString.charAt(i) == 'e'){
                result += "i";
            } else {
                result += originalString.charAt(i);
            }
        }
        System.out.println(result);

        //Assignment 3
        //take a email from user and create a username based on it until @

        System.out.print("Enter your email: ");
        String userName = sc.next();

        int index = 0;
        for(int i = 0; i < userName.length(); i++){
            if(userName.charAt(i) == '@'){
                index = i;
            }
        }

        String username = userName.substring(0, index);
        System.out.println("Your username is: " + username);
    }
}