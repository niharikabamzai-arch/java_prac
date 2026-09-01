import java.util.Scanner;
public class array_2 {
    public static void swap(int arr[] , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in);){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20; 
        arr[2] = 30;
        arr[3] = 40;
        swap ( arr, 0,3);

        for (int i = 0; i < arr.length; i++) {
            System.out.println( + arr[i]);
        }

    }
}
}