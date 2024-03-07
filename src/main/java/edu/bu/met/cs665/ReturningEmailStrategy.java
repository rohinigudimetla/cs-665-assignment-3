package edu.bu.met.cs665;

public class ReturningEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        // Implementation for sending email to returning customers
        return "Sending email to returning customer...";
    }
}
