import java.util.Scanner;
public class MM {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner (System.in)) {
            int r1 = sc.nextInt();  
            int c1 = sc.nextInt();
            int[][] arr_one = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    arr_one[i][j] = sc.nextInt();
                }
            }

            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            int[][] arr_two = new int[r2][c2];
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    arr_two[i][j] = sc.nextInt();
                }
            }

            if (r1!=c2){
                System.out.println("Invalid input");
                return;
            }

            int[][] product = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] += arr_one[i][k] * arr_two[k][j];
                    }
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}