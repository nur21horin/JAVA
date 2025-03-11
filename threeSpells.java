
import java.util.Scanner;
class threeSpells {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        //p=>0
        int t=n.nextInt();
        while(t-- >0){
           int  abc=n.nextInt();
           int abc1=n.nextInt();
           int abc2=n.nextInt();
           int sum=abc+abc1;
           int sum1=abc+abc2;
           int sum2=abc1+abc2;
           int maximu=Math.max(sum,Math.max((sum1),(sum2)));
           System.out.println(maximu);
        }
    }
    
}
