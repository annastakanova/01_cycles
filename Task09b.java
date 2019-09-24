//Найти сумму квадратов первых ста чисел

public class Task09b {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        while (i <= 100) {
            sum += i*i;
            i ++;
        }
        System.out.print ("сумма квадратов = " + sum);
    }
}

/*
for (int i=1; i<=100; i++ ){
    sum += i*i;
}
*/
