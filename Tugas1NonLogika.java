import java.util.Scanner;
public class Tugas1NonLogika {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int a, b, c;

        System.out.print("Masukkan Bilangan ke-1 : ");
        a = input08.nextInt();
        System.out.print("Masukkan Bilangan ke-2 : ");
        b = input08.nextInt();
        System.out.print("Masukkan Bilangan ke-3 : ");
        c = input08.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println("Bilangan Terbesar adalah " + a);
            }
        }
        if (b >= a ) {
            if (b >= c) {
                System.out.println("Bilangan Terbesar adalah " + b);
            }
        else {
            System.out.println("Bilangan Terbesar adalah " + c);
        } 
        }
    } 
    
}
