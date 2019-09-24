//Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1
// Составьте программу нахождения произведения первых 10 членов этой последовательности.

public class Task12b {
    public static void main(String[] args){
        long mult = 1;

        for (int n=1; n <= 10; n++) {
            long a = (n - 1)*6 + 1;
            mult = mult*a;
            //System.out.print("произведение " +n+ " чл. последвательности = " + mult + "\n");
        }
        System.out.print("произведение чл. последвательности = " + mult + "\n");
    }
}