/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloggername;

import java.util.Scanner;

/**
 *
 * @author Douglas vinicius Dierings 2022322
 */
public class BloggerName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This program helps you to create a name for your blog using part of your name and string manipulation
        Scanner myInput = new Scanner(System.in);//Obtain the input (the user information)
        String firstName;//stores the first name (string)
        String lastName;//stores the surname (string)
        String myName;//stores the junction of the first and last name with a space between them (string)
        String userAnswer;//stores  the answer whether or not the user wants to enter the name again (string)
        String blogName;//stores the blog's name that the system generated (string)
        int blogChoice;//stores user choice after choosing blog type (integer number)
        System.out.println("====== BLOGGER NAME GENERATOR ======");//output the name of the program
        do {//will loop until the user enters Y, confirming that the name is correct
            while (true) {//loop until the user enters the name and surname according to the established standarts
                System.out.println("Enter just your FIRST name:");//output a message asking the user first name
                firstName = myInput.nextLine().trim();//get the user input (first name) and remove whitespace from both ends and store it in the variable firstName
                System.out.println("Enter just your SURNAME:");//output a message asking the user surname
                lastName = myInput.nextLine().trim();//get the user input (surname) and remove whitespace from both ends and store it in the variable lastName
                if (lastName.isEmpty() || firstName.isEmpty() || firstName.length() < 2 || lastName.length() < 2) {//check if the firstName or lastName are empty and at least both have 2 letters 
                    System.out.println("Please do not leave fields empty and enter at least 2 letters for name and surname.");//output a message in case the user leaves a fields empty or entered less then 2 letters on name and surname
                    continue;//return to the beginning of the loop while, asking the user to enter the name again
                }
                myName = firstName + " " + lastName;//concatenate the firstName and lastName with a space between them an store it in the variable myName
                if (myName.matches("([A-Za-z ]+)")) {//check if the full name (myName) of the user have only letters and at least one space
                    break;//means the input (myName) is valid and exit the loop
                } else {//means the user did not just enter letters and will show a message
                    System.out.println("Please do not enter numbers or special characters. Just your name and surname.");//if the user enters a number it will output a message asking him to enter just his name and surname
                }
            }
            while (true) {//loop until the user input Y or N
                System.out.println("Please, check if your name is correct: " + myName.toUpperCase() + ".");//output a message asking the user to check if the name is correct and shows the full name in uppercase
                System.out.println("Is your name correct? [Y/N]");//output a message asking the user to confirm if the name is correct
                userAnswer = myInput.nextLine().trim();//get the user input (if the name is correct) and removes whitespace from both ends and store in the variable userAnswer
                if (userAnswer.equalsIgnoreCase("Y") || userAnswer.equalsIgnoreCase("N")) {//check if the user entered Y or N, ignoring if they are uppercase or lowercase 
                    break;//means that the input is Y or N and exit the loop
                } else {//if the user input a number or letter other than Y and N
                    System.out.println("Please enter Y or N.");//output a message asking the user to enter just Y or N in case he enters an invalid input
                }
            }
        } while (userAnswer.equalsIgnoreCase("N"));//check if the userAnswer is N (ignoring if it is uppercase or lowercase), if not return to the top of the loop, so the user can enter the name again
        System.out.println("What will your blog be about?\nChoose one of the following options by entering a number: ");//output a message showing the user instructions
        System.out.println("1 - Fashion\n2 - Football\n3 - Travel\n4 - Food\n5 - Movies and series\n6 - Cars\n7 - Random name");//output a message with the blog options for the user to choose
        while (true) {//loop until the program output a blog name
            while (true) {//loop until the user entered a valid choise of the blog options
                try {//try to catch a valid input
                    blogChoice = Integer.parseInt(myInput.nextLine().trim());//get the input of the user and try to convert to a integer number and remove whitespace from both ends. Store in blogChoice
                    break;//means that the user entered a valid option, breaking the loop and continue the program (go to switch case)
                } catch (NumberFormatException e) {//if the user enters a invalid input it will catch (could not convert to an integer)
                    System.out.println("Please, you must enter a integer number from the above options.");//output a mesage if the user enters a invalid input and returns to the beginning of the while loop
                }
            }
            switch (blogChoice) {//determines the action to be performed depending on the user's choice
                case 1://Fashion
                    blogName = "In style with " + firstName.charAt(1) + lastName.charAt(1) + "look";//concatenate the message plus a character at a specific index position in the string firstName (index 1) and lastName (index 1) plus a message. Stores in blogName
                    System.out.printf("Your blog name is: %s.", blogName);//output a message with the blog name, using format output
                    return;//block execution completed successfully
                case 2://Football
                    if (lastName.contains("e")) {//check if the variable lastName contains the letter 'e'
                        lastName = lastName.replace('e', '&');//replace the letter 'e' to the letter '&'
                        blogName = lastName.toUpperCase() + "cool player 1";//concatenate the lasName in upper case plus the message. Stores in blogName
                        System.out.printf("Your blog name is: %s.", blogName);//output a message with the blog name, using format output
                        return;//block execution completed successfully
                    } else {//if the variable does not have the letter 'e'
                        blogName = lastName.toUpperCase() + " player 1";//concatenate the lasName in upper case plus the message. Stores in blogName
                        System.out.printf("Your blog name is: %s.", blogName);//output a message with the blog name, using format output
                        return;//block execution completed successfully
                    }
                case 3://Travel
                    blogName = firstName.substring(1) + lastName.substring(1) + "air TRIP";//concatenate the strings firstName and lastName starting at the index 1. Stores in blogName
                    System.out.printf("Your blog name is: %s.", blogName);//output a message with the blog name, using format output
                    return;//block execution completed successfully
                case 4://Food
                    firstName = new StringBuilder(firstName).reverse().toString();//get the firstName and put it backwards. Store in firstName.
                    blogName = "@>all x" + firstName.toLowerCase() + "s can eat<@";//concatenate the message plus firstName in lower case plus the message. Stores in blogName
                    System.out.printf("Your blog name is: %s.", blogName);//output a message with the blog name, using format output
                    return;//block execution completed successfully
                case 5://Movies and series
                    blogName = "Geek world of " + firstName.substring(0, 1) + lastName.substring(1) + "nerd.";//concatenate the message plus firstName satarting at the index 0 and ending at index 1 plus lastName starting on index 1 plus the message. Stores in blogName
                    System.out.printf("Your blog name is: %s.", blogName);//output a message with the blog name, using format output
                    return;//block execution completed successfully
                case 6://Cars
                    blogName = lastName.substring(1).toUpperCase() + "vrum in the road.";//concatenate the lastName in upper case starting at the index 1. Stores in blogName
                    System.out.printf("Your blog name is: %s.", blogName);//output a message with the blog name, using format output
                    return;//block execution completed successfully
                case 7://Random name
                    lastName = new StringBuilder(lastName).reverse().toString();//get the lastName and put it backwards. Stores in lastName.
                    blogName = "Spending time with " + lastName + firstName;//concatenate the message plus lastName and firstName
                    System.out.printf("Your blog name is: %s.", blogName);//output a message with the blog name, using format output
                    return;//block execution completed successfully
                default://if the user enters a invalid input (invalid number)
                    System.out.println("Please, enter a number from the options above.");//output a messege asking the user to enter a valid option
                    break;//returns to the top of the previus loop, so the user can enter a valid input
            }
        }
    }
}
