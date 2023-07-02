import java.util.Scanner;

public class Main {
    /*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
    örnek çıktı
    Armut Kaç Kilo ? :0
    Elma Kaç Kilo ? :1
    Domates Kaç Kilo ? :1
    Muz Kaç Kilo ? :2
    Patlıcan Kaç Kilo ? :3
    Toplam Tutar : 21.68 TL*/
    public static void main(String[] args) {

        double Armut,Elma,Domates,Muz,Patlican;
        Scanner kg= new Scanner(System.in);


        System.out.println(" Kaç kilo armut aldınız?: ");
        Armut=kg.nextDouble();
        System.out.println(" Kaç kilo Elma aldınız?: ");
        Elma=kg.nextDouble();
        System.out.println(" Kaç kilo Domates aldınız?: ");
        Domates=kg.nextDouble();
        System.out.println(" Kaç kilo Muz aldınız?: ");
        Muz=kg.nextDouble();
        System.out.println(" Kaç kilo Patlican aldınız?: ");
        Patlican=kg.nextDouble();

        double total = (Armut*2.14)+(Elma*3.67)+(Domates*1.11)+(Muz*0.95)+(Patlican*5.00);

        System.out.println("Toplam Meyvelerin tutarı : "+total);





    }
}