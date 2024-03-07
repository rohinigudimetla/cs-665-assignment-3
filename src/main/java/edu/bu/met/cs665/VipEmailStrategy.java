
/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: VipEmailStrategy.java
 * Description: This is the main class. No significant output returned.
 */

package edu.bu.met.cs665;

public class VipEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        String vipAcknowledgement = getVipAcknowledgement();
        String exclusiveOffers = getExclusiveOffers();
        String earlyAccess = getEarlyAccess();
        return vipAcknowledgement + "\n\n" + exclusiveOffers + "\n\n" + earlyAccess + "\n\nBest Regards,\nRohini's Company";
    }

    private String getVipAcknowledgement() {
        
        return "Dear VIP Customer,\n\nWe appreciate your continued support.";
    }

    private String getExclusiveOffers() {
        
        return "As a token of our appreciation, we're offering you these exclusive offers: 20% off your next purchase";
    }

    private String getEarlyAccess() {
        
        return "You also get early access to our new products and services: Product F, Service G";
    }
}
