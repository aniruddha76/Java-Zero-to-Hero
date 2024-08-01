public class Backtracking {
    public static void printPermutation(String str, String permutation, int index){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permutation + current, index + 1);
        }
    }

    public static void main(String[] args) {
        
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
