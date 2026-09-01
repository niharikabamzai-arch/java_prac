import java.util.Scanner;
public class array_4 {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt(); 
            int arr[] = new int[n]; //
            for(int i=0; i< arr.length ; i++){
                arr[i] = sc.nextInt();
            }
             int max = arr[0]; // Initialize max with the first element
            for(int i=0; i< arr.length ; i++){
               if(arr[i]>max){
                   max=arr[i];
             }
            }
         /*int second_largest = arr[0]; // Initialize second max with the first element
            for (int i=0; i < arr.length; i++) {   
                if (arr[i] > second_largest && arr[i] != max) {
                    second_largest = arr[i];
                }
            } 
            System.out.println("Maximum element in the array is: " + max);
            System.out.println("Second maximum element in the array is: " + second_largest);*/

            int minimum = arr[0]; // Initialize minimum with the first element
            for(int i=0; i< arr.length ; i++){
                if(arr[i]<minimum){
                    minimum=arr[i];
                }
            }
            int second_min = arr[0]; // Initialize second minimum with the first element
            for (int i=0; i < arr.length; i++) {
                if (arr[i] < second_min && arr[i] != minimum) {
                    second_min = arr[i];
                }
            }
            System.out.println("Minimum element in the array is: " + minimum);
            System.out.println("Second minimum element in the array is: " + second_min);
        }

    }
}
