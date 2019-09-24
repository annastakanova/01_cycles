//С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне
//от 1 до 99 включительно.

public class Task05b {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        while (i <= 99) {
            sum += i;
            i += 2;
            //System.out.print ("сумма = " + sum + "\n");
        }
        System.out.print ("сумма нечетных чисел = " + sum + "\n");
    }
}