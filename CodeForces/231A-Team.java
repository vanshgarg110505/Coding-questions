import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int count = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0 ; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            if(a+b+c >=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
