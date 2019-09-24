//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
// Результат представить в виде таблицы,
// первый столбец которой – значения аргумента, второй - соответствующие значения функции:
//F(x) = ctg(x/3)+1/2(sinx)

public class Task23b {
    public static void main(String[] args) {
        System.out.println("x: \tf(x):");
        int a = -8;
        int b = 27;
        int h = 5;

        for (int x = a; x<=b; x+=h){
            double ctg = 1.0/Math.tan(x/3);
            double f =  ctg + (Math.sin(x))/2;
            System.out.println(x + "\t" +f);
        }
    }
}
