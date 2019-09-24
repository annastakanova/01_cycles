//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
// Результат представить в виде таблицы, первый столбец которой – значения аргумента,
// второй - соответствующие значения функции: F(x) = sin^2(x)


public class Task22b {
    public static void main(String[] args) {
        System.out.println("x: \tf(x):");
        int a = -3;
        int b = 16;
        int h = 3;
        for (int x = a; x<=b; x+=h){
            double f = Math.pow (Math.sin(x), 2);
            System.out.println(x + "\t" +f);
        }
    }
}
