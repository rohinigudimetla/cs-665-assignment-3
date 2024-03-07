/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: EmailSender.java
 * Description: This is the email sender class. 
 * It has a method to set the email strategy and another method to send the email.
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