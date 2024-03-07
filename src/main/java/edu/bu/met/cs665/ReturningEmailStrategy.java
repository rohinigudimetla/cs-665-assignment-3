/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: ReturningEmailStrategy.java
 * Description: This is the returning user class. For these users, the email is sent with the recommendations and special offers.
 * They are also acknowledged for their previous purchases.
 */


package edu.bu.met.cs665;

public class ReturningEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        String acknowledgement = getAcknowledgement();
        String recommendations = getRecommendations();
        String specialOffers = getSpecialOffers();
        return acknowledgement + "\n\n" + recommendations + "\n\n" + specialOffers + "\n\nBest Regards,\nRohini's Company";
    }

    private String getAcknowledgement() {
        
        return "Dear Customer,\n\nThank you for your previous purchases with us.";
    }

    private String getRecommendations() {
        
        return "Based on your purchase history, we recommend these products for you: Product D, Product E";
    }

    private String getSpecialOffers() {
        
        return "As a token of our appreciation for your loyalty, we're offering you these special offers: 10% off your next purchase";
    }
}
