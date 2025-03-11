import java.util.Scanner;

class Easy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        while(input-->0){
            int t=sc.nextInt();
            if(t>=1 && t<100) System.out.println("Easy");
            else if(t>=100 && t<200) System.out.println("Medium");
            else if(t>=200 && t<=300) System.out.println("Hard");
        }
    }
}