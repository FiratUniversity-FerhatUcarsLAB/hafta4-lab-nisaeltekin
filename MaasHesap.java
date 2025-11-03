/*
 * Ad Soyad: [Nisanur Eltekin]
 * Ogrenci No: [250541100]
 * Tarih: [03/11/2025]
 * Aciklama: Gorev 3 - Maaş Hesaplama Sistemi
 * Bu program, kullanıcının çalışan adı ve soyadı, aylık brüt maaşı, 
 * haftalık çalışma saati ve mesai saati sayısını girmesini ister. 
 * Girilen bu bilgilerle, çalışanın maaş bordrosu hesaplanır. 
 * Program, brüt maaş üzerinden net maaş, mesai ücreti gibi ek hesaplamalar yaparak 
 * tüm maaş bilgilerini düzenli bir şekilde ekrana yazdırır. 
 * Böylece kullanıcı, çalışanın maaşına dair tüm detayları rahatça görebilir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class MaasHesap {

    // Sabit oranlar
    static final double SGK_ORANI = 0.14;
    static final double GELIR_VERGISI_ORANI = 0.15;
    static final double DAMGA_VERGISI_ORANI = 0.00759;

    public static void main(String[] args) {

        // Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan veriler alınıyor
        System.out.print("Çalışan adı soyadı: ");
        String calisanAdi = scanner.nextLine();

        System.out.print("Aylık brüt maaş (TL): ");
        double brutMaas = scanner.nextDouble();

        System.out.print("Haftalık çalışma saati (saat): ");
        int haftalikCalismaSaati = scanner.nextInt();

        System.out.print("Mesai saati sayısı: ");
        int mesaiSaati = scanner.nextInt();

        // Mesai ücreti hesaplaması
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintilerin hesaplanması
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        // Net maaş hesaplaması
        double netMaas = toplamGelir - toplamKesinti;

        // İstatistik hesaplamaları
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;  // 22 gün * 8 saat = 176 saat / ay
        double gunlukNetKazanc = netMaas / 22;    // 22 gün

        // Çıktılar ekrana bastırılıyor
        System.out.println("\n====================================");
        System.out.println("            MAAS BORDROSU          ");
        System.out.println("====================================");
        System.out.println("Çalışan: " + calisanAdi);
        System.out.println();

        // GELIRLER kısmı
        System.out.println("GELIRLER:");
        System.out.printf("Brüt Maaş             : %.2f TL\n", brutMaas);
        System.out.printf("Mesai Ücreti (%d saat): %.2f TL\n", mesaiSaati, mesaiUcreti);
        System.out.println("----------------------------------");
        System.out.printf("TOPLAM GELIR          : %.2f TL\n", toplamGelir);
        System.out.println();

        // KESINTILER kısmı
        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%) : %.2f TL\n", SGK_ORANI * 100, sgkKesintisi);
        System.out.printf("Gelir Vergisi (%.1f%%) : %.2f TL\n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%)  : %.2f TL\n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("----------------------------------");
        System.out.printf("TOPLAM KESINTI        : %.2f TL\n", toplamKesinti);
        System.out.printf("\nNET MAAS              : %.2f TL\n", netMaas);

        // İSTATISTIKLER kısmı
        System.out.println("\nİSTATISTIKLER:");
        System.out.printf("Kesinti Oranı (%%)     : %.1f %%\n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç    : %.2f TL/saat\n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç     : %.2f TL/gün\n", gunlukNetKazanc);
        System.out.println("\n====================================");

        scanner.close();
    }
}
