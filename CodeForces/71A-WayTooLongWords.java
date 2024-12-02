import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        
        for(int i = 0 ; i < count ; i++){
            String word = in.next();
            int n = word.length();
            
            if(n>10){
                System.out.print(word.charAt(0) + String.valueOf(n - 2) + word.charAt(n-1));
            }
            else{
                System.out.print(word);
            }
        }
        
    }
}
