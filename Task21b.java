//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
//Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:
//F(x) = x − sin(x)


public class Task21b {
    public static void main(String[] args) {
        System.out.println("x: \tf(x):");
        int a = 2;
        int b = 10;
        int h = 2;
        for (int x = a; x<=b; x+=h){
            double f = x - Math.sin(x);
            System.out.println(x + "\t" +f);
        }
    }
}


