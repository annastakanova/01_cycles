//Составить программу нахождения произведения квадратов первых двухсот чисел

public class Task10b {
    public static void main(String[] args) {
        long multi = 1;
        for (int i = 1; i <= 200; i++) {
            multi *= Math.pow(i, 2);
        }
        System.out.print ("произведение квадратов = " + multi);
    }
}
