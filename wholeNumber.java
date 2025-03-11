
import java.util.Scanner;

class wholeNumber {
    public static void main(String[] args) {
    
        Scanner n=new Scanner(System.in);
        long t=n.nextLong();
        while(t-- >0){
            long N=n.nextLong();
            long K=n.nextLong();
            if(K==0){
                System.out.println(N);
            }
            else{
                System.out.println(N%K);
            }

        }
        n.close();
    }
    
}
