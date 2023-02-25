package task3;

import java.util.Scanner;

import java.util.*;

public class Exchenge {
    public static void main(String[] args) {
        int a ;

        System.out.println("Введите сумму $" );

        Scanner suma = new Scanner(System.in);
        a = suma.nextInt();
        System.out.println(" Ваша сумма в  € :"   + ( a * 0.94));

    }
}
