import java.util.Scanner;
public class tutedude_Q5 { 
    public static int anybasetodecimal(int n , int b){  //if decimal to any base
        int ans=0;
        int p=1;
        while(n>0){
            int digit= n%10; //n%b
            n=n/10;          //n/b

            ans= ans+digit*p;
            p=p*b;            //p*10
        }
        return ans;
    }
    public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
        int n= sc.nextInt();
        int b= sc.nextInt();

         System.out.println(anybasetodecimal(n,b));  
    
    }
    
}
}
