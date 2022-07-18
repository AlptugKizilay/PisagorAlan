import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;
        double u;
        double alan;
        double alanU;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dik kenar1 = ");
        a = inp.nextDouble();
        System.out.print("Dik kenar2 = ");
        b = inp.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs = " + c);

        alan = (a * b) / 2;
        System.out.println("Alan: " + alan);

        u = (a+b+c) / 2;
        alanU = Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Alan2: " + alanU);



    }
}