//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.

public class Task13b {
    public static void main(String[] args){
        double y;
        double a = 0.5 ;
        for (double x=-5; x<= 5; x += a) {
            y = 5 - Math.pow(x, 2)/2;
            System.out.print("значение функции = " + y + "\n");
        }
    }
}
