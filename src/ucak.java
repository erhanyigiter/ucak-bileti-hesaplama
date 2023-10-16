import java.util.Scanner;

public class ucak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi (KM cinsinden) giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        input.close();

        double biletFiyati = mesafe * 0.10; // Mesafe başına ücret

        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            if (yas < 12) {
                biletFiyati *= 0.5; // 12 yaşından küçükse %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                biletFiyati *= 0.9; // 12-24 yaş arası ise %10 indirim
            } else if (yas >= 65) {
                biletFiyati *= 0.7; // 65 yaşından büyükse %30 indirim
            }

            if (yolculukTipi == 2) {
                // Gidiş-dönüş biletler için fiyatı iki katına çıkar
                biletFiyati *= 2;
                // Ve ardından %20 indirim uygula
                biletFiyati *= 0.8;
            }

            System.out.println("Toplam Tutar = " + biletFiyati + " TL");
        }
    }
}
