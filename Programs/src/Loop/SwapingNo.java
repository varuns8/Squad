package Loop;

import java.util.Scanner;

    public class SwapingNo{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num1,num2,temp;

            do{
                System.out.println("Enter First No: ");
                num1 = sc.nextInt();
                System.out.println("Enter First No: ");
                num2 = sc.nextInt();

                System.out.println("Number Before Swap: ");
                System.out.println("Num1 = "+num1);
                System.out.println("Num2 = "+num2);

                temp=num1;
                num1=num2;
                num2=temp;

                System.out.println("Number After Swap: ");
                System.out.println("Num1 = "+num1);
                System.out.println("Num2 = "+num2);
                }
                while(num1==num2);
}
}
