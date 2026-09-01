import java.util.Scanner;
public class tutedude_Q4 {

    
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();//number
            int d= sc.nextInt();//digit we input to find frequency of
            int ans=0;
            while(n>0){ 
                int digit = n%10;
                n=n/10;
                if(digit==d){
                    ans++;
                }
               
            }
            System.out.println("Frequency of " + d + " in the given number is " + ans);
        }

    }     
        
    }
    

