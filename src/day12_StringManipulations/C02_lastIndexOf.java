package day12_StringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        // a' harfinin ilk kullanim indexi ni yazdirin.

        System.out.println(str.indexOf("a"));//1

        // a harfinin son kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf("a")); //24
        System.out.println(str.indexOf("J"));//0
        System.out.println(str.lastIndexOf("J"));//0

        // Metne bakmadan e harfinin 2 kere veya daha fazla kullnilip kullanilmadigini kontrol edin.

        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        if (ilkIndex == -1) {
            System.out.println("Hic e kullanilmamis");
        } else if (ilkIndex == sonIndex) {
            System.out.println("sadece 1 kere e kullanilmis");

        }else {
            System.out.println("2 veya daha fazla e harfi kullanilmis");
        }

        // "Javayi ogrenecegiz, baska yolu yok";

        // o harfinin son index'ini yazdirin
        System.out.println(str.lastIndexOf("o")); // 32

        // o harfinin son kullanimindan bir onceki kullaniminin index'ini yazdirin

        System.out.println(str.lastIndexOf("o", 31)); // 27

        // k harfinin son kullaniminin indexini yazdiralim

        System.out.println(str.lastIndexOf('k')); // 33





    }
}
