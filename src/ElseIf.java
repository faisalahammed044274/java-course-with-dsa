
import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("A & B are equals.");
        } else if (a > b) {
            System.out.println("A is greater than B.");
        } else if (a < b) {
            System.out.println("A is smaller than B.");
        } else {
            System.out.println("Somthing Massed up");
        }
    }
}