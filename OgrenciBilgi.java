/*
 * Ad Soyad: [Nisanur Eltekin]
 * Ogrenci No: [250541100]
 * Tarih: [03/11/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;
public class OgrenciBİlgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Adinizi girin: ");
        String ad = input.nextLine();

        System.out.print("Soyadi girin: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci numaranız: ");
        int ogrenci_no = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        float gpa = input.nextFloat();

        //bilgiler ekrana bastırılıyor
        System.out.println("\n === OGRENCİ BİLGİ SİSTEMİ === ");
        System.out.printf("Ad Soyad: %s %s" ,ad,soyad);
        System.out.printf("\nOgrenci No: %d" ,ogrenci_no);
        System.out.printf("\nYas: %d" ,yas);
        System.out.printf("\nGPA: %2f " ,gpa);

        input.close();

    }
}
