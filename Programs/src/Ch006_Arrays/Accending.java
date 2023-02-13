package Ch006_Arrays;

import java.util.Scanner;
public class Accending {
    public static void main(String[] args){

    	int num[] = {10,30,20,40};
        int temp=0;

        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[j]<num[i]){
                temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                }
            } System.out.println(num[i]);
        }

    }
}
