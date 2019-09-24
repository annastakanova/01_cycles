//Составить программу нахождения разности кубов первых двухсот чисел

// задание: от 1^3=1 отнять все последующие кубы????

public class Task11b {
    public static void main(String[] args) {
        long diff = 0;
        for (int i = 1; i <= 200; i++) {
            diff -= Math.pow(i, 3);
        }
        System.out.print ("разность кубов = " + diff);
    }
}
