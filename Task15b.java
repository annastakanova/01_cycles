//Вычислить : 1+2+4+8+...+ 2 в 10 степени

public class Task15b {
    static double calculate () {
        int sum = 0;
        for (int i=0; i <= 10; i++) {
            sum += Math.pow(2, i);
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.print("сумма = " + (int)calculate());  //почему меняет тип??
    }
}