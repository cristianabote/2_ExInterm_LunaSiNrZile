package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Scrie un program care accepta un String care e denumirea unei luni si afiseaza cate zile are acea luna.
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti luna pentru care doriti sa stiti numarul total de zile: ");
        String luna=scan.nextLine();
        luna=luna.toLowerCase();
        switch (luna){
            case "ianuarie": case "martie" : case "mai": case"iulie": case "august": case "octombrie": case"decembrie":
                System.out.println("Luna "+ luna+" are 31 de zile.");
                break;
            case"aprilie": case"iunie": case "septembrie": case "noiembrie":
                System.out.println("Luna "+ luna+" are 30 de zile.");
                break;
            case"februarie":
                System.out.println("Luna "+ luna+" are 28 de zile , iar in anii bisecti 29 de zile.");
                break;
            default:
                System.out.println("Nu ati introdus numele unei luni corect.");
        }

    }
}
