import java.util.Scanner;
import java.lang.*;
import java.io.*;
class developer {
    private static void swap(int[] pair){
        if(pair[0]>pair[1]){
            int temp=pair[0];
            pair[0]=pair[1];
            pair[1]=temp;
        }
    }
    public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    int t=n.nextInt();
    while(t--> 0){
        int[] pair1={n.nextInt(),n.nextInt()};
        int[] pair2={n.nextInt(),n.nextInt()};
        int[] pair3={n.nextInt(),n.nextInt()};
        swap(pair1);
        swap(pair2);
        swap(pair3);
        if(pair1[0]==pair2[0] && pair1[1]==pair2[1]){
            System.out.println(1);
        }else if(pair1[0]==pair3[0] && pair1[1]==pair3[1]){
            System.out.println(2);
        }else{
            System.out.println(0);
        }
    }
}}

