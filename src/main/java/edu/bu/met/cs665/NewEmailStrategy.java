/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: NewEmailStrategy.java
 * Description: This is the new user email class. The user is sent a welcome message,
 * introduction to the company, and a first purchase offer.
 */


package edu.bu.met.cs665;

public class NewEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        String welcomeMessage = getWelcomeMessage();
        String introduction = getIntroduction();
        String firstPurchaseOffer = getFirstPurchaseOffer();
        return welcomeMessage + "\n\n" + introduction + "\n\n" + firstPurchaseOffer + "\n\nBest Regards,\nRohini's Company";
    }

    private String getWelcomeMessage() {
        
        return "Dear Customer,\n\nWelcome to our company! We're excited to have you with us.";
    }

    private String getIntroduction() {
        
        return "Here are some of our most popular products and services: Product A, Product B, Service C";
    }

    private String getFirstPurchaseOffer() {
        
        return "As a welcome gift, we're offering you a 10% discount on your first purchase! Use the code WELCOME10 at checkout.";
    }
}