//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Task14b {
    public static void main(String[] args){
        float sum = 0;
        for (int n=1; n <= 10; n++) {
            sum += (float)1/n;
            System.out.print("сумма = " + sum + "\n");
        }
    }
}