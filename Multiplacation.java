package com.Atelier.lesboucles;
import java.util.Scanner;
public class Multiplacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int a=1;
        System.out.println("Saisir le nombre");
        Float b=scanner.nextFloat();
        if((b>2) && (b<100))
        {
            while (a < 30) {
                  System.out.println(a*b);
                  a++;
                }

        }
        else {
             System.out.println("entre le nombre compris 2 et 100");
        }
    }
}