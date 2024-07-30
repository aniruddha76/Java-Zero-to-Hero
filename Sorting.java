public class Sorting {

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args){

        //Bubble sort
        //Time complexity = O(n to the power of 2)

        int arr[] = {7, 8, 3, 1, 2};

        //there will be 2 loops
        //outer loop
        for(int i = 0; i < arr.length - 1; i++){

            //this length - i - 1 means i represents number of elements which are already sorted
            //that's why we are excluding them
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){

                    ///swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);

        //Selection sort
        //selection sorts sorts one smallest per loop;
        //Time complexity = O(n to the power of 2)

        int arr[] = {7, 8, 3, 1, 2};

        for(int i = 0; i < arr.length - 1; i++){
            int smallest = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);

        //Insertion Sort
        //we divide array into 2 parts sorted and unsorted
        //Time complexity = O(n to the power of 2)
        
        //This is kind of confusing but let's try
        
        //First alter
        
        // 7 | 8 3 1 2
        // current will be = 8;
        // j = 7  because of i - 1;
        // while j >=0 = true and current = 7 < arr[j] = 7
        // arr[j + 1]:8 = arr[j]:7 

        //Second alter
        //now current  = arr[i] = 3
        //int j = i - 1 = 8
        //while 8 > 0 = true and current: 3 < arr[j]: 8 == Yes
        //arr[j + 1]: 3 == arr[j]:8


        int arr[] = {7, 8, 3, 1, 2};

        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            //placement of elements
            arr[j + 1] = current;
        }

        printArray(arr);
    }
}
