
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if(button == 1 ){
        // System.out.println("Button 1 is pressed");
        // } else if(button == 2){
        // System.out.println("Button 2 is pressed");
        // } else if(button == 3){
        // System.out.println("Button 3 is pressed");
        // } else if (button == 4){
        // System.err.println("Button 4 is pressed");
        // } else {
        // System.out.println("Invalid button");
        // }

        switch (button) {
            case 1:
                System.out.println("Button 1 is pressed");
                break;
            case 2:
                System.out.println("Button 2 is pressed");
                break;
            case 3:
                System.out.println("Button 3 is pressed");
                break;
            case 4:
                System.out.println("Button 4 is pressed");
                break;
            default:
                System.out.println("Invalid button");
        }
    }
}
