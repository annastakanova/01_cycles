//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15

public class Task34b {
    public static void main(String[] args) {
        for(int i=1000;i<10000; i++){
            int[] sb=new int[4];
            sb[0] = i / 1000;
            sb[1] = (i / 100) % 10;
            sb[2] = (i % 100)/10;
            sb[3] = i % 10;
            if (sb[0]+sb[1]+sb[2]+ sb[3]== 15) {
                System.out.print(i + ", ");
            }
        }
    }
}
