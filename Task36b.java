//Два двузначных числа, записанных одно за другим ,
// образуют четырёхзначное число, которое делится на их произведение.
// Найти эти числа.

public class Task36b {
    public static void main(String[] args) {
//        int n;
//        int m;
        for (int i = 10; i < 100; i++){
            for (int j = 10; j < 100; j++){
                int mult = i*j;
                int nm = 100*i + j;

                if ((nm % mult) == 0) {
                    System.out.println(nm);
                }
            }
        }
    }
}
