/*
 * Ad Soyad: [Nisanur Eltekin]
 * Ogrenci No: [250541100]
 * Tarih: [03/11/2025]
 * Aciklama: Gorev 2 - Geometrik Hesaplayıcı
 * Bu program, kullanıcının dairenin yarıçapını girmesini ister. 
 * Kullanıcı tarafından girilen yarıçap değeriyle dairenin alanı hesaplanır.
 * Ayrıca dairenin çevresi, küre hacmi gibi hesaplamalar yapılır ve 
 * tüm bu bilgiler düzenli bir formatta ekrana yazdırılır. 
 * Programda, matematiksel hesaplamalar için gerekli formüller kullanılarak 
 * doğru sonuçlara ulaşılır ve kullanıcıya anlamlı bir şekilde sunulur.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Daire yaricapini giriniz (cm): ");

        double r = input.nextDouble();

        //pi sayısı tanımlama
        final double pi = 3.14159;

        //matematiksel işlemler
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double cap = 2 * r;
        double kure_hacmi = (4.0/3.0) * pi * r * r * r;
        double kure_yuzey_alani = 4 * pi * r * r;

        //bilgiler ekrana bastırılıyor
        System.out.println("\nSONUCLAR:");
        System.out.println("=================");
        System.out.printf("Daire Alanı: %.2f cm^2", alan);
        System.out.printf("\nDaire Cevresi: %.2f cm", cevre);
        System.out.printf("\nDaire Capi: %.2f cm", cap);
        System.out.printf("\nKüre Hacmi: %.2f cm^3", kure_hacmi);
        System.out.printf("\nKüre Yüzey Alani: %.2f cm^2", kure_yuzey_alani);

        input.close();

    }
}

