package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    static public void printTowerOfHanoi(int n, String start, String aux, String end){
        if(n ==1){
            System.out.println("Move plate 1 from "+start +" to " +end);
            return;
        }
        printTowerOfHanoi(n-1,start,end,aux);
        System.out.println("move "+n+" from "+start+" to "+end);
        printTowerOfHanoi(n-1,aux,start,end);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of plates");
        int plates = input.nextInt();
        printTowerOfHanoi(plates,"Start","Aux","End");
    }
}
