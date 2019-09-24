//Найдите количество четных цифр данного натурального числа

public class Task35b {
    public static void main(String[] args) {
        int n = 2222526;
        int count = 0;
        int t = n;
        while (t > 0) {
            if ((t % 10) % 2 == 0)
                count++;
            t /= 10;
        }
        System.out.print("в числе " +n+" "+count + " четных цифр ");
    }
}
