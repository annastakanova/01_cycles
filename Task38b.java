//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
// Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.

public class Task38b {
    public static void main(String[] args) {
        int n = 147;
        int length = (int) (Math.log10(n) + 1);
            //System.out.println(length);
        int[] array = new int[length];

        for (int i = 0; i <= length-1; i++) {
            array[(length-1) - i] = n % 10;
            System.out.print(array[(length-1) - i] + ", ");
            n /= 10;

        }
        System.out.print("\n");
        int step = array[2] - array[1];
        for (int i = 1; i < length-1; i++) {
            if (step == array[i] - array[i - 1]) {
                System.out.println("цифры образуют арифметическую прогрессию");
            } else System.out.println("цифры не образуют арифметическую прогрессию");
        }
    }
}

//            int a = n%10;
//            int b = n/10;
//            int step = a - b;