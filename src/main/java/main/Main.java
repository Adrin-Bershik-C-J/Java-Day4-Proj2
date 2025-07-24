package main;

import java.util.Scanner;

import exceptions.InvalidAgeException;
import services.TicketService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketService obj = new TicketService();

        while (true) {
            try {
                System.out.println("\nEnter your choice:");
                System.out.println("1. Book Ticket");
                System.out.println("2. Display Tickets");
                System.out.println("3. Exit");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter name:");
                        String name = sc.nextLine();

                        System.out.println("Enter age:");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter title:");
                        String title = sc.nextLine();

                        obj.createTicket(name, age, title);
                        break;

                    case 2:
                        obj.displayTicket();
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Enter a valid choice! Else you get stuck in a loop forever 😈");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            } catch (InvalidAgeException e) {
                System.out.println("Error occurred: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}
