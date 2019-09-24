//В трехзначном числе зачеркнули старшую цифру.
// Когда полученное число умножили на 7, то получили исходное число. Найти это число.

public class Task39b {
    public static void main(String[] args) {
        for (int n = 100; n < 1000; n++) {
            int a = n % 100;
            if (a*7 == n) System.out.println(n);
        }
    }
}
