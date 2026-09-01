import java.util.Scanner;
public class tutedude_Q2 {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
           
           /* for(int i=1; i<=n; i++){
                int t= sc.nextInt();
                int count=0;
                for(int j=1; j<=t; j++){
                    if(t%j==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Not Prime"); */
                
                while(n>0){
                    int dig=n%10;
                    n=n/10;
                    System.out.print(dig);
                }
                }
            }
    }
