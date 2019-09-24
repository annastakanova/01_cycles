//Получить все числа, не превышающие заданного числа N,
// которые делятся без остатка на все свои цифры.

public class Task40b {
    public static void main(String[] args) {
        int n = 5555;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            if(temp%10 == 0 || temp%(temp%10)!=0){
                break;
            }
            else temp /= 10;
        //не дорешала
        }
    }
}
