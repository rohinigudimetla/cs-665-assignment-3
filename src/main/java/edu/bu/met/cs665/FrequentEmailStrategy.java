/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: FrequentEmailStrategy.java
 * Description: This is the main class. No significant output returned.
 */


package edu.bu.met.cs665;

public class FrequentEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        String recommendations = getRecommendations();
        String rewards = getRewards();
        String purchaseHistory = getPurchaseHistory();
        return "Dear Valued Customer,\n\nBased on your purchase history (" + purchaseHistory + "), we recommend these products for you: " + recommendations + "\n\nAs a token of our appreciation for your loyalty, we're offering you these rewards: " + rewards + "\n\nBest Regards,\nRohini's Company";
    }

    private String getRecommendations() {
        
        return "Product D, Product E";
    }

    private String getRewards() {
        
        return "10% off your next purchase";
    }

    private String getPurchaseHistory() {
        
        return "Product A, Product B, Product C";
    }
}
