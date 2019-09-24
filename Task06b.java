//Напишите программу, где пользователь вводит любое целое положительное число.
//программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task06b {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int  sum = 0;
        for (int i = 1; i <= number; i++)
        {
            sum+=i;
        }
        System.out.print ("сумма чисел = " + sum);
        sc.close();
    }
}
