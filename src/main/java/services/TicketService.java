package services;

import java.util.*;

import exceptions.InvalidAgeException;
import models.Ticket;
import models.User;

public class TicketService {

    private List<Ticket> list = new ArrayList<>();

    public void createTicket(String name, int age, String title) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Insufficient age to book a ticket!\n");
        }
        User obj = new User(name, age);
        Ticket ticket = new Ticket(title, obj);
        list.add(ticket);
        System.out.println("Ticket booked successfully");
    }

    public void displayTicket() {
        if (list.isEmpty()) {
            System.out.println("No tickets to display! Book one to get started! 😁😎");
        } else {
            for (Ticket t : list) {
                System.out.println(t);
            }
        }
    }
}
