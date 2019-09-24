//Для каждого натурального числа в промежутке от m до n вывести все делители,
//кроме единицы и самого числа.
// m и n вводятся с клавиатуры

import java.util.Scanner;

public class Task27b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число - начало промежутка");
        int m = sc.nextInt();
        System.out.println("Введите натуральное число - конец промежутка");
        int n = sc.nextInt();

        while (m <= n) {
            System.out.print("\n делители числа " + m + ":");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m = m + 1;
        }
    }
}
