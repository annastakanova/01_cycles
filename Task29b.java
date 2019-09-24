//29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class Task29b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        String a = sc.nextLine();
        System.out.println("Введите число b: ");
        String b = sc.nextLine();

        for (int f = 0; f < a.length(); f++) {
            a.charAt(f);
        }
        for (int g = 0; g < b.length(); g++) {
            b.charAt(g);
        }
        System.out.println("\n цифры, входящие в запись обоих чисел: ");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print(b.charAt(j) + " ");
                    break;
                }
            }
        }
    }
}
