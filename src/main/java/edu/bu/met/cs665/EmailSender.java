/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: EmailSender.java
 * Description: This is the main class. No significant output returned.
 */

package edu.bu.met.cs665;


public class EmailSender {
    private EmailStrategy strategy;

    public void setEmailStrategy(EmailStrategy strategy) {
        this.strategy = strategy;
    }

    public String sendEmail() {
        return this.strategy.send();
    }
}