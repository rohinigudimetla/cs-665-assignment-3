/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Main.java
 * Description: This is the main class. No significant output returned.
 */

package edu.bu.met.cs665;

public class BusinessEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        String productsAndServices = getProductsAndServices();
        return "Dear Valued Business Partner,\n\nWe are excited to bring you new opportunities for your business with our latest products and services: " + productsAndServices + "\n\nLet's grow together.\n\nBest Regards,\nYour Company";
    }

    private String getProductsAndServices() {
        // This is just a placeholder. In a real application, you might fetch this information from a database or another source.
        return "Product A, Product B, Service C";
    }
}
