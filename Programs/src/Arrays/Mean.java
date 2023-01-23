package Arrays;

public class Mean {
    public static void main(String[] args){

    int num[]= {55,87,10,1,52,9,12,7,12,98,789,0,45,30,998};
    int total=0;
    for(int i=0;i<num.length;i++){
    total=total+num[i];
    }

    int avg = total/num.length;
    System.out.println("Mean: "+avg);
}
}
