package practice.practice_daytime.daytime04;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
          /*
    Interwiew Questions
     Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".... adet sayi girdiniz , toplami..." yazdirin
     */
        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;
        while (sayac<11&&toplam<501){
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz..");
            sayi = input.nextInt();
            toplam+=sayi;
            sayac++;


        }
        if (toplam>500){
            System.out.println(sayac+" adet sayi girdiniz . Toplami "+toplam);

        }else {
            System.out.println("Bu kadar sayi yeter. "+sayac+" adet sayi girdiniz Toplam "+toplam);
        }
    }
}