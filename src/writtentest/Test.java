package writtentest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/19.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int avg = scanner.nextInt();
        ArrayList<Integer> list_left = new ArrayList<>();
        ArrayList<Integer> list_right = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list_left.add(scanner.nextInt());
            list_right.add(scanner.nextInt());
        }
    }
}
