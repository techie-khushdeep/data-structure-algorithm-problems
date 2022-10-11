package input.scanner;

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char ch1 = sc.next().charAt(1);

        System.out.println(ch+""+ch1);
    }
}
