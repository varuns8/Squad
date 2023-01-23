package Pattern;

public class CharP2 {
    public static void main(String[] args){
        int alphabet=65;
        for(int i=5; i>=1;i--){
            for(int j=0; j<i; j++){
                System.out.print((char)(alphabet+j)+" ");
            }
            System.out.println();
}
}
}
