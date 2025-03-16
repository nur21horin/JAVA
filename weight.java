
import java.util.Scanner;

class weight{
public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int t=n.nextInt();
    while(t-->0){
        
        int initialWeight=n.nextInt();
        int finalWeinght=n.nextInt();
        int minMonthlyIncrease=n.nextInt();
        int maxMonthlyIncrease=n.nextInt();
        int months=n.nextInt();

        int weightDifference=finalWeinght-initialWeight;
        int minPossibleIncreases=minMonthlyIncrease*months;
        int maxPosibleIncreases=maxMonthlyIncrease*months;

        
        if(weightDifference>=minPossibleIncreases && weightDifference<=maxPosibleIncreases) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
    n.close();
}
}