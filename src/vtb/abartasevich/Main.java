package vtb.abartasevich;

public class Main {

    public static void main(String[] args) {
        int a = -1;
        if(a>0) {
            System.out.print(+ a + " положительное");
        } else if(a==0){
            System.out.print( + a + " равно нулю");
        } else {
            System.out.print( + a + " отрицательное");
        }
        if(a%2==0) {
            System.out.println(" четное");
        }else {
            System.out.println(" нечетное");
        }

        System.out.println(" ");

    }
}
