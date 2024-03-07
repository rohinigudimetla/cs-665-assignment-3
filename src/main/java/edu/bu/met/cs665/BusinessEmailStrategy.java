package edu.bu.met.cs665;

public class BusinessEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        return "Sending email to business customer...";
    }
}
