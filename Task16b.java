//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)

public class Task16b {
    static double calculate () {
        int i = 2;
        long tempSum = 1 + i;
        long mult = tempSum;
        for (i = 3; i <= 10; i++) {
            tempSum += i;
            mult *= tempSum;
        }
        return mult;
    }
    public static void main(String[] args){
            System.out.print("произведение = " + (long)calculate());   //почему меняет тип??
        }
}