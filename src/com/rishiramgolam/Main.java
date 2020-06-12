package com.rishiramgolam;

import java.awt.*;
import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {

        MobilePhone mobile = new MobilePhone();
//
//        mobile.addContact("Rishi Ramgolam", "12345 6789");
//        mobile.removeContact("rishi Ramgolam");
//
//        mobile.addContact("Rishi Ramgolam", "12394349038409");
//        mobile.addContact("Bobby McJim", "48732479837497");
//
//        mobile.modifyContact("Rishi Ramgolam","Ricky Moonz", "9999999");
//
//        mobile.printContactList();

        boolean quit = false;
        while (!quit) {

            System.out.println("\n\t 1. Print Contact list");
            System.out.println("\t 2. Add New Contact");
            System.out.println("\t 3. Remove Contact");
            System.out.println("\t 4. Update Contact");
            System.out.println("\t 5. Quit\n");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    mobile.printContactList();
                    break;
                case 2:
                    System.out.println("Enter Full Name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Enter Phone Number");
                    String number = scanner.nextLine();
                    mobile.addContact(name, number);
                    break;
                case 3:
                    System.out.println("Enter Full Name of the contact you want to remove.");
                    scanner.nextLine();
                    String target = scanner.nextLine();
                    mobile.removeContact(target);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact you want to modify");
                    scanner.nextLine();
                    String targetName = scanner.nextLine();
                    if (mobile.findContact(targetName)) {
                        System.out.println("Enter the new name:");
                        String newName = scanner.nextLine();
                        System.out.println("Enter the new phone number:");
                        String newNumber = scanner.nextLine();
                        mobile.modifyContact(targetName, newName, newNumber);
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                default:
                    quit = true;
            }
        }

    }


}
