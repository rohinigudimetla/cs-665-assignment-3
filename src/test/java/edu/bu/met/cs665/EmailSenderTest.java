/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: EmailSenderTest.java
 * Description: This is the main class. No significant output returned.
 */
package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmailSenderTest {
    @Test
    public void testSendBusinessEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new BusinessEmailStrategy());
        String expectedEmail = "Dear Valued Business Partner,\n\nWe are excited to bring you new opportunities for your business with our latest products and services: Product A, Product B, Service C\n\nLet's grow together.\n\nBest Regards,\nRohini's Company";
        assertEquals(expectedEmail, emailSender.sendEmail());
    }

    @Test
    public void testSendReturningEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new ReturningEmailStrategy());
        String expectedEmail = "Dear Customer,\n\nThank you for your previous purchases with us.\n\nBased on your purchase history, we recommend these products for you: Product D, Product E\n\nAs a token of our appreciation for your loyalty, we're offering you these special offers: 10% off your next purchase\n\nBest Regards,\nRohini's Company";
        assertEquals(expectedEmail, emailSender.sendEmail());
    }

    @Test
    public void testSendVipEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new VipEmailStrategy());
        String expectedEmail = "Dear VIP Customer,\n\nWe appreciate your continued support.\n\nAs a token of our appreciation, we're offering you these exclusive offers: 20% off your next purchase\n\nYou also get early access to our new products and services: Product F, Service G\n\nBest Regards,\nRohini's Company";
        assertEquals(expectedEmail, emailSender.sendEmail());
    }
    @Test
    public void testSendNewEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new NewEmailStrategy());
        String expectedEmail = "Dear Customer,\n\nWelcome to our company! We're excited to have you with us.\n\nHere are some of our most popular products and services: Product A, Product B, Service C\n\nAs a welcome gift, we're offering you a 10% discount on your first purchase! Use the code WELCOME10 at checkout.\n\nBest Regards,\nRohini's Company";
        assertEquals(expectedEmail, emailSender.sendEmail());
    }

    @Test
    public void testSendFrequentEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new FrequentEmailStrategy());
        String expectedEmail = "Dear Valued Customer,\n\nBased on your purchase history (Product A, Product B, Product C), we recommend these products for you: Product D, Product E\n\nAs a token of our appreciation for your loyalty, we're offering you these rewards: 10% off your next purchase\n\nBest Regards,\nRohini's Company";
        assertEquals(expectedEmail, emailSender.sendEmail());
    }

}
