package lesson;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int fact = 1;
        while (number > 0){
            fact *= number;
            number--;
        }
        System.out.println(fact);
    }
}
