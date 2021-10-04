package com.task_4;

import java.util.Scanner;

public class IznemtNaudu
    {
        System.out.print ("Vai Jus velaties iznemt 20 EUR?");
        Scanner iznemtNaudu = new Scanner(System.in);
        String iznemtNaudu = esvelosiznemtnaudu.nextLine();

        switch (IznemtNaudu) {
            case "esvelosiznemtnaudu":
                System.out.println("Ja, velos");
                break;
            case "E":
                System.out.println("Ne, nevelos");
                break;
        }
