package Mondai1;
import java.util.Scanner;

public class List4n15 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("左下直角の二等辺三角形を表示済ます。");
        System.out.print("段数は：");
        int n = stdIn.nextInt();
        for (int i =1; i <= n; i++){
            for (int j = 1; j <= i; j++)
              System.out.print('*');
            System.out.println();
        }
    }
}
