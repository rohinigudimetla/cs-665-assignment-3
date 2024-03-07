/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Main.java
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
        String expectedEmail = "Dear Valued Business Partner,\n\nWe are excited to bring you new opportunities for your business with our latest products and services: Product A, Product B, Service C\n\nLet's grow together.\n\nBest Regards,\nYour Company";
        assertEquals(expectedEmail, emailSender.sendEmail());
    }

    @Test
    public void testSendReturningEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new ReturningEmailStrategy());
        assertEquals("Sending email to returning customer...", emailSender.sendEmail());
    }

    @Test
    public void testSendVipEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new VipEmailStrategy());
        assertEquals("Sending email to VIP customer...", emailSender.sendEmail());
    }
    @Test
    public void testSendNewEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new NewEmailStrategy());
        assertEquals("Sending email to new customer...", emailSender.sendEmail());
    }

    @Test
    public void testSendFrequentEmail() {
        EmailSender emailSender = new EmailSender();
        emailSender.setEmailStrategy(new FrequentEmailStrategy());
        assertEquals("Sending email to frequent customer...", emailSender.sendEmail());
    }

}
