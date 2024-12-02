import java.util.Scanner;
 
public class ElephantSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int fullSteps = x / 5;
        int remainder = x % 5;
        int totalSteps = fullSteps;
        if (remainder > 0) {
            totalSteps += 1;
        }
        System.out.println(totalSteps);
    }
}
