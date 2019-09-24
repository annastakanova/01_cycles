//Даны числовой ряд и некоторое число е.
//Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид:
//a = ((−1)^(n−1))/n


public class Task18b {

    public static void main(String[] args) {
        double e = 0.001;
        double sum = 0;

        for (int n = 1; n < 50; n++) {
            double a = (Math.pow(-1, n - 1)) / n;
            if (Math.abs(a) < e) {
                break;
            } else {
                //System.out.println("a(" + n + ") = " + a);
                sum += a;
                System.out.println("\nсумма членов ряда, модуль которых больше или равен е: " + sum);
            }

        }
    }
}


/*
for (int n = 1; n<=50; n++){
        double a =  (1/Math.pow(2,n))+ (1/Math.pow(3,n));

        if (Math.abs(a) < e) {
        break;
        }
        else {
        //System.out.println("a(" + n + ") = " + a);
        sum += a;
        }
        }*/
