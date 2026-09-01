import java.util.Scanner;
public class array_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // input array from user
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int data = sc.nextInt();
            int idx = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == data) {
                    idx = i;
                    break;
                }
            }
            System.out.println( "element at index: " + idx);
        }
    }
}

