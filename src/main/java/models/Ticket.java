package models;

public class Ticket {

    private static int counter = 1;
    private int id;
    private String title;
    private User user;

    public Ticket(String title, User user) {
        this.id = counter++;
        this.title = title;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Title: " + title + ", Booked by: " + user.getName();
    }
}
