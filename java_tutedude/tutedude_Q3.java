import java.util.Scanner;
public class tutedude_Q3 {

    public static int fact(int x){
        int ans=1;
        for(int i=1; i<=x; i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int r= sc.nextInt();

            int nfact =fact(n);
            int nmr = fact(n - r);

            int npr = nfact / nmr;
            System.out.println(n + "P" + r + " = " + npr);
        }
    }
}