package edu.bu.met.cs665;

public class NewEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        return "Sending email to new customer...";
    }
}
