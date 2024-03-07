package edu.bu.met.cs665;

public class VipEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        // Implementation for sending email to VIP customers
        return "Sending email to VIP customer...";
    }
}
