/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Main.java
 * Description: This is main class. There is an example of sending an email to a VIP customer.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    EmailSender emailSender = new EmailSender();
    emailSender.setEmailStrategy(new VipEmailStrategy());
    String emailContent = emailSender.sendEmail();
    System.out.println("This is an example of sending an email to a VIP customer:");
    System.out.println(emailContent);
  }

}
