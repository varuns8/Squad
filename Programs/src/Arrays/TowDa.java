package Arrays;

import java.util.Scanner;
public class TowDa {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter : ");
    int matA[][]= {{1,2,3},{8,6,9},{8,1,0}};
    for(int row=0; row<matA.length; row++){
        for(int col=0; col<matA[row].length; col++){
            matA[row][col] = sc.nextInt();
        }
    } System.out.println();
}
}
