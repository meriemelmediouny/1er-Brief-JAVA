package com.company;
import java.util.Scanner; // import the Scanner class
public class yourName {
    public static void main(String[] args) {
        Scanner firstAt = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("What's your name ?");
        userName = firstAt.nextLine();

        System.out.println("Hello " + userName);
    }

}
