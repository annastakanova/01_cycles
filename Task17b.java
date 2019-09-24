//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17b {

    static double calculate (){
        int n = 5;
        double a = 0.5 ;
        double mult = 1;
        double sum = 0;
        for (int i=0; i < n; i++) {
            sum = ++a;
            mult *= sum; }
        return mult;
    }

    public static void main(String[] args) {

        System.out.print ("произведение = " + calculate ());
    }
}
