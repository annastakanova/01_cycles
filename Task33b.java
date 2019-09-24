//Найдите наибольшую цифру данного натурального числа

public class Task33b {
    public static void main(String[] args) {
        int n = 397550875;
        int value_max = 0;
        int curr;
        while (n > 0 && value_max != 9) {
            if ((curr = n % 10) > value_max)
                value_max = curr;
            n /= 10;
        }
        System.out.println(value_max);
    }
}
