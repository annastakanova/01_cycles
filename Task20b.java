//Даны числовой ряд и некоторое число е.
// Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
//a=1/((3n−2)(3n+1))

public class Task20b {
    public static void main(String[] args) {
        double e = 0.003;
        double sum = 0;

        for (int n = 1; n<=50; n++){
            double a = (double)1/((3*n-2)*(3*n+1));
            System.out.println("a = " + a);

            if (Math.abs(a) < e) {
                break;
            }
            else {
                //System.out.println("a(" + n + ") = " + a);
                sum += a;
            }
        }
        System.out.println("\nсумма членов ряда, модуль которых больше или равен е: " + sum);
    }

}
