import java.util.Scanner;
public class Tugas1Logika {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
         int a, b, c;
        
        System.out.print("Masukkan bilangan ke-1 : ");
        a = input08.nextInt();
        System.out.print("Masukkan bilangan ke-2 : ");
        b = input08.nextInt();
        System.out.print("Masukkan bilangan ke-3 : ");
        c = input08.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Bilangan terbesar adalah " + a);
        } else if (b >= a && b >= c) {
            System.err.println("Bilangan terbesar adalah " + b);
        } else {
            System.out.println("Bilangan terbesar adalah " + c);
        }
    }
}
