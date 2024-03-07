package edu.bu.met.cs665;

public class FrequentEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        return "Sending email to frequent customer...";
    }
}
