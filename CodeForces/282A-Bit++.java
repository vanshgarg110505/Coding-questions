import java.util.Scanner;
 
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0;
        for(int i = 0 ; i < n ; i++){
            String word = in.next();
            if(word.contains("++")){
                x++;
            }
            else if(word.contains("--")){
                x--;
            }
        }
        System.out.println(x);
    }
}
