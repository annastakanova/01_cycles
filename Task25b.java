//Требуется определить факториал числа, которое ввел пользователь

import java.util.Scanner;

public class Task25b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите натуральное число:  ");
        int n = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        System.out.println("факториал " +n+ " = " + result);
    }
}
