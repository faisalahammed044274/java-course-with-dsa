import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        // int n = 4;
        // int m = 8;

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int m = sn.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("*");
                }
                System.out.print("\n");
        }

    }}