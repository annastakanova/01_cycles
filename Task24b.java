//Вводится натуральное число.
// Найти сумму четных цифр, входящих в его состав.
// Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.

import java.util.Scanner;

public class Task24b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите натуральное число:  ");
        int n;

        double sum = 0;
        for(n = scanner.nextInt(); n != 0; n /= 10) {
            if ((n%10)%2 == 0)
            sum += (n % 10);
        }
        System.out.println("сумма четных цифр: " + sum);
    }
}