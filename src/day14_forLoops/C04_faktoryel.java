package day14_forLoops;

import java.util.Scanner;

public class C04_faktoryel {
    public static void main(String[] args) {

        //Kullanicidan 20'den kucuk bir sayi alin ve faktoriyrl degerini hesaplayin.
        // Or: 6!=6.5.4.3.2.1= 720

       /* Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 20 den kucuk bir sayi giriniz");

        int girilenSayi= scan.nextInt();


        int carpim=1;

        for(int i = 1; i<=girilenSayi ;  i++);{

            //carpim *=i;
        }
        System.out.println("Girilen sayi olan" + girilenSayi+"!="+carpim);


        */
        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();
        int carpim = 1;
        for (int i = 1; i <=sayi ; i++) {
            carpim *= i ;
        }
        System.out.println("girilen sayi olan " + sayi+"! = " + carpim);

    }
}