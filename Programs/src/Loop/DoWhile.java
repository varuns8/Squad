package Loop;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number squ: ");
            a = sc.nextInt();
            System.out.println(a*a);
        }while(a>0);
}
}
