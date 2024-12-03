import java.util.Scanner;
 
public class Main{
    public static void main(String args[]){
        int row= 0, col=0;
        Scanner in = new Scanner(System.in);
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
                int value = in.nextInt();
                if(value==1){
                    row = i;
                    col = j;
                }
            }
        }
        
        int result = Math.abs(row-3) + Math.abs(col-3);
        System.out.println(result);
    }
}
