package com.rishiramgolam;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String name, String number) {

        // existing contact check
        boolean exists = false;
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().equals(name.toLowerCase())) {
                exists = true;
                System.out.println("Sorry, contact already exists");
                break;
            }
        }

        if (!exists) {
            // add contact
            Contact contact = new Contact(name, number);
            contacts.add(contact);
            System.out.println("Contact " + name + " with number " + number + " has been added.");
        }

    }

    public void removeContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().equals(name.toLowerCase())) {
                contacts.remove(contact);
                System.out.println("Contact found, and removed.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Contact not found.");
    }

    public void modifyContact(String name, String updatedName, String updatedNumber) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().equals(name.toLowerCase())) {
                contact.setName(updatedName);
                contact.setPhoneNumber(updatedNumber);
                System.out.println("Contact " + contact.getName() + " with number "
                        + contact.getPhoneNumber() + "has been updated.");
                found = true;
            }
        }
        if (!found) System.out.println("Contact not found");

    }

    public void printContactList() {

        if (contacts.size() == 0) System.out.println("No contacts.");
        for (Contact contact : contacts) {
            System.out.println("Name : " + contact.getName() + " , " + contact.getPhoneNumber());
        }
    }

    public boolean findContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().equals(name.toLowerCase())) return true;
        }
        return false;
    }
}
