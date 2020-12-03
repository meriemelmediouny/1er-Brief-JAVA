package com.company;
import java.util.Scanner; // import the Scanner class
public class TVA {

    public static void main(String[] args) {
        Scanner yourPrix=new Scanner (System.in);

        double HT=0, TVA=0, TTC=0, R=0, NETC=0;

        System.out.println("Entry Number");
        int n=yourPrix.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre Prix");
            double prix=yourPrix.nextDouble();
            HT+=prix;

        }
        if (HT>2000) {
            R = HT*0.1;
            NETC=HT-R;

        }
        TVA=NETC*0.2;
        TTC=NETC+TVA;
        System.out.println("the amount is "+HT+"MAD");
        System.out.println("the discount is"+R+"MAD");
        System.out.println("net commerciel"+NETC+"MAD");
        System.out.println("TVA"+TVA+"MAD");
        System.out.println("TTC"+TTC+"MAD");
    }


}
