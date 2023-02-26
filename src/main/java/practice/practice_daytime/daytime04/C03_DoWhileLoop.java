package practice.practice_daytime.daytime04;

public class C03_DoWhileLoop {
    public static void main(String[] args) {



     /* INTERWIEW SORUSU
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

        */
        int numberOfBananas = 165;
        int survivaldays = 1;
        boolean monkeyalive = true;
        do {
            System.out.println("***************maymunlar gunde 4 muz yer**********");
            numberOfBananas -=4;

            System.out.println("Kalan muz Sayisi "+numberOfBananas);
            survivaldays++;
            if (numberOfBananas<4){
                monkeyalive=false;
                System.out.println("Bugun "+survivaldays+". gun yeterli muz kalmadi.Maymun rahmetli. Rest in peace");
                System.out.println("Maymun "+survivaldays+ ". gun oldu");

            }else {
                System.out.println("Bugun "+survivaldays+" .gun; maymun hala yasiyor ");
            }
        }while (monkeyalive);
    }



}
