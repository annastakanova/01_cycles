//Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *).
// Вычислить результат Z в зависимости от знака.
// Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении.
// Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл).
// В качестве символа прекращения вычислений принять ‘0’.


// не удается сделать возможным смену операций (при попытках перестает радотать выход из цикла по введению "0")

import java.util.Scanner;

public class Task28b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите символ арифметической операции или 0 для завершения работы: ");
        char sign = sc.next().charAt(0);

        if (sign == '0')
            System.out.println("вы ввели символ окончания работы программы (0)");
            else {

            switch (sign) {
                case '+':
                    System.out.print("введите первое число: ");
                    int num1 = sc.nextInt();
                    System.out.print("введите второе число: ");
                    int num2 = sc.nextInt();

                    int sum = num1 + num2;
                    System.out.println("сумма = " + sum);
                    //break;

                case '-':
                    System.out.print("введите первое число: ");
                    int num3 = sc.nextInt();
                    System.out.print("введите второе число: ");
                    int num4 = sc.nextInt();

                    int diff = num3 - num4;
                    System.out.println("разность = " + diff);
                    //break;

                case '*':
                    System.out.print("введите первое число: ");
                    int num5 = sc.nextInt();
                    System.out.print("введите второе число: ");
                    int num6 = sc.nextInt();

                    int mult = num5 * num6;
                    System.out.println("произведение = " + mult);
                    //break;

                case '/':
                    System.out.print("введите первое число: ");
                    int num7 = sc.nextInt();
                    System.out.print("введите второе число: ");
                    int num8 = sc.nextInt();
                    if (num8 != 0) {
                        double div = (double) num7 / num8;
                        System.out.println("деление = " + div);
                    } else System.out.println("деление на ноль запрещено");
                    //break;

                default:
                    System.out.println("неверная арифметическая операция");
                    break;
            }}
        sc.close();
    }
}