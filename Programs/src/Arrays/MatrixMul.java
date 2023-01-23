package Arrays;

import java.util.Scanner;
public class MatrixMul{
    public static void main(String args[]){

    Scanner sc= new Scanner(System.in);

    int r1,r2, c1, c2, row,col,temp;
    
    System.out.println("Enter Size of Mat A: ");
    System.out.println("Row's: ");
    r1=sc.nextInt();
    System.out.println("Col's: ");
    c1=sc.nextInt();

    System.out.println("Enter Size of Mat B: ");
    System.out.println("Row's: ");
    r2=sc.nextInt();
    System.out.println("Col's: ");
    c2=sc.nextInt();

    float MatA [][] = new float[r1][c1];
    float MatB [][] = new float[r2][c2];
    float MatMul [][];
    if(r1 == c2){

    // Initilization size of Matrix Multiplication
    MatMul = new float[r1][c2];
    // Taking Values For Matrix A
    System.out.println("Enter Values For Matrix A: ");
    for (row=0; row<r1; row++){
        for(col=0; col<c1; col++){
            MatA[row][col] = sc.nextFloat();
        }
    }

    // Display Matrix A
    System.out.println("Matrix A: ");
    for (row=0; row<r1; row++){
        for(col=0; col<c1; col++){
            System.out.print(MatA[row][col] + " ");
        }
    System.out.println();
    }

    // Taking Values For Matrix B
    System.out.println("Enter Values For Matrix B: ");
    for (row=0; row<r2; row++){
        for(col=0; col<c2; col++){
            MatB[row][col] = sc.nextFloat();
        }
    }

    // Display Matrix B
    System.out.println("Matrix B: ");
    for (row=0; row<r2; row++){
        for(col=0; col<c2; col++){
            System.out.print(MatB[row][col] + " ");
        }
    System.out.println();
    }

    // Main Logic
    if (r1<c1){
        for (row=0; row<r1; row++){
            for (col=0; col<c2; col++){
                for (temp=0; temp<r1; temp++){
                    MatMul[row][col] += MatA[row][temp] * MatB[temp][col];
                }
            }
        }
    }
    else {
        for (row=0; row<r1; row++){
            for (col=0; col<c2; col++){
                for (temp=0; temp<c1; temp++){
                    MatMul[row][col] += MatA[row][temp] * MatB[temp][col];
                }
            }
        }
    }
    System.out.println();

    // Display Matrix
    System.out.println("Matrix Multiplication");
    for(row=0;row<MatMul.length;row++){
        for(col=0;col<MatMul[row].length;col++){
            System.out.print(MatMul[row][col] + " ");
        }
        System.out.println();
    }
    }
    else {
    System.out.println("Matrix Multiplication Not Possible.");
    }

    }
}

