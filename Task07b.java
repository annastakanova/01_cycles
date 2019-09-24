//Вычислить значения функции на отрезке [а,b] c шагом h:
//y=x, x>2
//y=-x,x<=2

public class Task07b {
    public static void main(String[] args) {
        int a = -5;
        int b = 10;
        int h = 1;

        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                int y = x;
                System.out.print("\nx = " + x + ", y = " + y);
            }
                else {
                    int y = -x;
                    System.out.print("\nx = " + x + ", y = " + y);
                }
        }
    }
}

