//С помощью оператора while напишите программу вывода всех четных чисел
// в диапазоне от 2 до 100 включительно

public class Task04b {
    public static void main(String[] args) {
        int i=2;
        while (i <= 100) {
            System.out.print (i + " ");
            i= i+2;
        }
    }
}
