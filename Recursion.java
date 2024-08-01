public class Recursion {

    public static void printnumbs(int n) {
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        printnumbs(n - 1);    
    }

    public static void printNumbers(int n){
        if(n == 6){
            return;
        }

        System.out.println(n);
        printNumbers(n + 1);
    }

    public static void printSomeOfNaturalNumbers(int n, int i, int sum){
        if(i == n){
            sum += n;
            System.out.println(sum);
            return;
        }

        sum += i;
        printSomeOfNaturalNumbers(n, i + 1, sum);
    }

    public static int calculateFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        int fact_nm1 = calculateFactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void printFibonaci(int a, int b, int n){
        //This was my method
        // if(a == n){
        //     return;
        // }
        
        // System.out.println(a);
        // int next = a + b;
        // a = b;
        // b = next; 
        // printFibonaci(a, b, n);

        if(n == 0){
            return;
        }

        int c = a + b;
        System.out.println(c);
        printFibonaci(b, c, n-1);
    }

    public static int calculatePower(int x, int n){
        //Base case 1
        if(n == 0){
            return 1;
        }

        //Base case 2
        if(x == 0){
            return 0;
        }

        //Kaam
        int xPowerNm1 = calculatePower(x, n - 1);
        int xPowerN = x * xPowerNm1;
        return xPowerN;
    }

    public static void main(String[] args) {
        
        //To put it simply function that calls itself called as Recursion

        //print numbers from 5 t0 1
        int n = 5;
        printnumbs(n);

        //print numbers from 1 to 5
        int n = 1;
        printNumbers(n);

        //print sum of first n natural numbers

        printSomeOfNaturalNumbers(5, 1, 0);

        //Calculate of given number
        int n = 5;
        int ans = calculateFactorial(n);
        System.out.println(ans);

        //Print fibonaci series of given number;
    
        int a = 0, b =1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        
        printFibonaci(a, b, n - 2);

        //print x^n (stack heignt = n)

        int x = 2, n = 5;
        int ans = calculatePower(x, n);
        System.out.println(ans);
    }    
}