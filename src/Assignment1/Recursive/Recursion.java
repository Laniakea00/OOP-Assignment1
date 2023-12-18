package Assignment1.Recursive;

import java.util.Scanner;

public class Recursion {
    private int a,b;
    Scanner scan = new Scanner(System.in);

    public Recursion() {
        a = scan.nextInt();
        b = scan.nextInt();
    }

    public void Blyat(int a, int b) {
        if (a <= b) {
            System.out.println(a);
            if (a != b) {
                Blyat(a + 1, b);
            }
        } else if (a >= b) {
            System.out.println(a);
            Blyat(a - 1, b);
        }
    }

    public static void main(String[] arg){
        Recursion rec = new Recursion();
        System.out.println("Entered values: a = " + rec.a + ", b = " + rec.b);

        rec.Blyat(rec.a, rec.b);
    }
}
