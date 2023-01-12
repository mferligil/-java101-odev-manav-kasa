import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double kilo,kilo2,kilo3,kilo4,kilo5;




        Scanner girdi=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        kilo=girdi.nextInt();
        kilo=kilo*armut;
        System.out.println("Elma kaç kilo ? :");
        kilo2=girdi.nextInt();
        kilo2=kilo2*elma;
        System.out.println("Domates kaç kilo ? :");
        kilo3=girdi.nextInt();
        kilo3=kilo3*domates;
        System.out.println("Muz kaç kilo ?  :");
        kilo4=girdi.nextInt();
        kilo4=kilo4*muz;
        System.out.println("Patlıcan kaç kilo ?  :");
        kilo5=girdi.nextInt();
        kilo5=kilo5*patlican;



        System.out.println("Toplam Tutar :"+(kilo+kilo2+kilo3+kilo4+kilo5)+"TL");


    }
}
