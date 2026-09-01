import java.util.Scanner;
public class tutedude_Q5b {
    public static int anybasetodecimal(int n , int b){  
        int ans=0;
        int p=1;
        while(n>0){
            int digit= n%10; 
            n=n/10;          

            ans= ans+digit*p;
            p=p*b;            
        }
        return ans;
    }
    public static int decimaltoanybase(int n , int b){
        int ans=0;
        int p=1;
        while(n>0){
            int digit= n%b; 
            n=n/b;          

            ans= ans+digit*p;
            p=p*10;            
        }
        return ans;
    }
    public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
        int n= sc.nextInt();
        int b= sc.nextInt();

         System.out.println(anybasetodecimal(n,b));
         System.out.println(decimaltoanybase(n,b));  
    
    }
    
}
}

