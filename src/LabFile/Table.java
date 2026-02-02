package LabFile;

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number =  scanner.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(number+"*"+i +" = "+(number*i));
        }
    }

}
