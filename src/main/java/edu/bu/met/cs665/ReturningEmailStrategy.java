/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Main.java
 * Description: This is the main class. No significant output returned.
 */


package edu.bu.met.cs665;

public class ReturningEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        // Implementation for sending email to returning customers
        return "Sending email to returning customer...";
    }
}
