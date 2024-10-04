import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int ukuranSepatu;
        String merk, kategori;
        double harga;

        System.out.print("Masukkan merk sepatu yang diinginkan (Specs/910/Ortus) : ");
        merk = input08.nextLine();

        if (merk.equalsIgnoreCase("Specs")){
            System.out.print("Masukkan kategori sepatu yang diinginkan (Slip On/High Top) : ");
            kategori = input08.nextLine();
            if (kategori.equalsIgnoreCase("Slip On")) {
                System.out.print("Masukkan ukuran sepatu yang diinginkan (36-40) : ");
                ukuranSepatu = input08.nextInt();
                if ( ukuranSepatu >= 36) {
                    harga = 800000;
                    System.out.println("Harga Sepatu = " + harga);
                } else if (ukuranSepatu <= 40) {
                    harga = 800000;
                    System.out.println("Harga Sepatu = " + harga);
                } else if (ukuranSepatu > 40) {
                    System.out.println("Ukuran sepatu tidak sesuai");
                } else if (ukuranSepatu < 36) {
                    System.out.println("Ukuran sepatu tidak sesuai");
                }

            }if  (kategori.equalsIgnoreCase("High Top")) {
                System.out.print("Masukkan ukuran sepatu yang diinginkan (40-44) : ");
                    ukuranSepatu = input08.nextInt();
                    if ( ukuranSepatu >= 40) {
                        harga = 1200000;
                        System.out.println("Harga Sepatu = " + harga);
                    } else if (ukuranSepatu <= 44) {
                        harga = 1200000;
                        System.out.println("Harga Sepatu = " + harga);
                    } else if (ukuranSepatu > 44) {
                        System.out.println("Ukuran sepatu tidak sesuai");
                    } else if (ukuranSepatu < 40) {
                        System.out.println("Ukuran sepatu tidak sesuai");
                    }
        }

        }if (merk.equalsIgnoreCase("910")) {
            System.out.print("Masukkan kategori sepatu yang diinginkan (Woman/Man): ");
            kategori = input08.nextLine();
            if (kategori.equalsIgnoreCase("Woman")) {
                System.out.print("Masukkan ukuran sepatu yang diinginkan (36-41) : ");
                ukuranSepatu = input08.nextInt();
                if ( ukuranSepatu >= 36) {
                    harga = 1000000;
                    System.out.println("Harga Sepatu = " + harga);
                } else if (ukuranSepatu <= 41) {
                    harga = 1000000;
                    System.out.println("Harga Sepatu = " + harga);
                } else if (ukuranSepatu > 41) {
                    System.out.println("Ukuran sepatu tidak sesuai");
                } else if (ukuranSepatu < 36) {
                    System.out.println("Ukuran sepatu tidak sesuai");
                }
        }if (kategori.equalsIgnoreCase("man")) {
            System.out.print("Masukkan ukuran sepatu yang diinginkan (41-44) : ");
            ukuranSepatu = input08.nextInt();
            if ( ukuranSepatu >= 41) {
                harga = 1800000;
                System.out.println("Harga Sepatu = " + harga);
            } else if (ukuranSepatu <= 44) {
                harga = 1800000;
                System.out.println("Harga Sepatu = " + harga);
            } else if (ukuranSepatu > 44) {
                System.out.println("Ukuran sepatu tidak sesuai");
            } else if (ukuranSepatu < 41) {
                System.out.println("Ukuran sepatu tidak sesuai");
            }
        
         }
    }if (merk.equalsIgnoreCase("ortus")) {
        System.out.print("Masukkan kategori sepatu yang diinginkan (Kids/Adult) : ");
        kategori = input08.nextLine();
        if (kategori.equalsIgnoreCase("kids")) {
            System.out.print("Masukkan ukuran sepatu yang diinginkan (36-40) : ");
            ukuranSepatu = input08.nextInt();
            if ( ukuranSepatu >= 36) {
                harga = 750000;
                System.out.println("Harga Sepatu = " + harga);
            } else if (ukuranSepatu <= 40) {
                harga = 750000;
                System.out.println("Harga Sepatu = " + harga);
            } else if (ukuranSepatu > 40) {
                System.out.println("Ukuran sepatu tidak sesuai");
            } else if (ukuranSepatu < 36) {
                System.out.println("Ukuran sepatu tidak sesuai");
            }
    }if (kategori.equalsIgnoreCase("adult")) {
        System.out.print("Masukkan ukuran sepatu yang diinginkan (40-44) : ");
        ukuranSepatu = input08.nextInt();
        if ( ukuranSepatu >= 40) {
            harga = 1500000;
            System.out.println("Harga Sepatu = " + harga);
        } else if (ukuranSepatu <= 44) {
            harga = 1500000;
            System.out.println("Harga Sepatu = " + harga);
        } else if (ukuranSepatu > 44) {
            System.out.println("Ukuran sepatu tidak sesuai");
        } else if (ukuranSepatu < 40) {
            System.out.println("Ukuran sepatu tidak sesuai");
        }
    
      }
    } 
 }
}