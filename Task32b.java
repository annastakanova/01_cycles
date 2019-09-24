//Проверить введенную пользователем строку на наличие недопустимых символов.
// В качестве первого символа допустимы только буквы и знак подчеркивания.
// Остальные символы могут быть буквами, цифрами и знаком подчеркивания.

//не дорешала

import java.util.Scanner;

public class Task32b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = sc.nextLine();

        for(int i = 0; i < a.length(); i++){
            if (i==0) {
                if (a.matches("[a-zA-Zа-яА-Я_]")) {
                    break;
                }
                else {
                    System.out.println("присутствуют недопустимые символы");
                    break;
                }
            }
            if (i>0) {
                if (a.matches("[a-zA-Zа-яА-Я0-9_]+")) {
                    break;
                }
                else {
                    System.out.println("присутствуют недопустимые символы");
                    break;
                }
            }
        }
    }
}
