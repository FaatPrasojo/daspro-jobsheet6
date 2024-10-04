import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        String jenisBuku;
        int jmlBuku;
        double diskon, jmlDiskon;

        System.out.print("Masukkan jenis buku yang dibeli : ");
        jenisBuku = input08.nextLine();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            System.out.print("Masukkan jumlah kamus yang dibeli : ");
            jmlBuku = input08.nextInt();
            if (jmlBuku <= 2) {
                System.out.println("Jumlah diskon yang diperoleh adalah " + diskon);
            }
            if (jmlBuku > 2) {
                jmlDiskon = diskon + 0.02;
                System.out.println("jumlah diskon yang diperoleh adalah " + jmlDiskon);
            } return;
        }
        if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            System.out.print("Masukkan jumlah novel yang dibeli : ");
            jmlBuku = input08.nextInt();
            if (jmlBuku <= 3) {
                System.out.println("Jumlah diskon yang diperoleh adalah " + diskon);
            }
            if (jmlBuku > 3) {
                jmlDiskon = diskon + 0.02;
                System.out.println("Jumlah diskon yang diperoleh adalah " + jmlDiskon);
            } return;
        }
        else 
        System.out.print("Masukkan jumlah buku yang dibeli : ");
        jmlBuku = input08.nextInt();
        if (jmlBuku > 3) {
        diskon = 0.05;
        System.out.println("Jumlah diskon yang diperoleh adalah " + diskon);
        }
    }
}
