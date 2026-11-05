import java.util.Scanner;
public class ST {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int minr =0;
            int minc=0;
            int maxr= arr.length-1;
            int maxc = arr[0].length-1;
            int count =0;
            int total = n*m;

            while(count < total){
                //left wall
                for( int i = minr, j = minc; i<= maxr && count< total; i++){
                    System.out.println(arr[i][j] +" ");
                }
                minc++;

                //bottom wall
                for( int j =minc, i = maxr; j<=maxc && count< total ; j++){
                    System.out.println(arr[i][j] +" ");
                }
                maxr--;
                //right wall
                for( int i = maxr, j = maxc; i>=minr && count< total; i--){
                    System.out.println(arr[i][j] +" ");
                }
                maxc--;
                //top wall
                for( int j = maxc, i = minr; j>=minc && count< total; j--){
                    System.out.println(arr[i][j] +" ");
                }
                minr++;
            } 
            
    }
}
}

