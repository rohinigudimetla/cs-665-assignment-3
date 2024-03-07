/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: BusinessEmailStrategy.java
 * Description: This is the business user email class. Here, there is also a method to return the products and services offered by the company. 
 * The email is sent to the business partners.
 */

package edu.bu.met.cs665;

public class BusinessEmailStrategy implements EmailStrategy {
    @Override
    public String send() {
        String productsAndServices = getProductsAndServices();
        return "Dear Valued Business Partner,\n\nWe are excited to bring you new opportunities for your business with our latest products and services: " + productsAndServices + "\n\nLet's grow together.\n\nBest Regards,\nRohini's Company";
    }

    private String getProductsAndServices() {

        return "Product A, Product B, Service C";
    }
}
