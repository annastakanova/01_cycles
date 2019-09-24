//Вычислить значения функции на отрезке [а,b] c шагом h:
//y=(x+c)*2, x=15
//y=(x-c)+6, x!=15

public class Task08b {
    public static void main(String[] args) {
        int a = -3;
        int b = 20;
        int c = 7;
        int h = 3;

        for (int x = a; x <= b; x += h) {
            if (x != 15) {
                int y = (x+c)+6;
                System.out.print("\nx = " + x + ", y = " + y);
            }
            else {
                int y = (x+c)*2;
                System.out.print("\nx = " + x + ", y = " + y);
            }
        }
    }
}
