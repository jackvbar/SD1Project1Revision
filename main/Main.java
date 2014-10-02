/*
Jack Barry
Software development 1 Project 1
9-18-2014
*/

package com.company;

import java.util.Arrays;

public class Main {
    /*Declare arrays to hold values of the events and olympians at the class level so they may be references across methods.*/
    public static String[] eventsArray = {"Washoos", "CanJam", "Horseshoes", "Cornhole", "Ladderball", "Stickgame", "ThreeLegged Race"};
    public static String[][] olympiansArray = {{"Jack", "Kristen", "Reid", "Jess", "Nicole\n",
            "Yury", "Claire", "Joe", "Katie", "Denis\n",
            "Arianna", "John", "Christine", "Peter", "Theresa", "Virg\n"},
            {"(Jack, 19, male)", "(Kristen, 17, female)", "(Reid, 20, male)", "(Jess, 30, female)\n",
                    "(Nicole, 27, female)", "(Yury, 22, male)", "(Claire, 25, female)", "(Joe, 26, male)\n",
                    "(Katie, 21, female)", "(Denis, 26, male)", "(Arianna, 24, female)", "(John, 18, male)\n",
                    "(Christine, 36, female)", "(Peter, 42, male)", "(Theresa, 57, female)", "(Virg, 60, male)\n"
            }};

    public static void InitializeAndWelcome(){
        /*Initialize events array and olympian matrix*/
        String[] events = new String[7];
        String[][] olympians = new String[16][16];
        events = eventsArray;
        olympians = olympiansArray;

        /* Print welcome message */
        System.out.println("Welcome to the Annual Lawn Game Olympics, Please read the following instructions." +
                "\nEnter the letter e or the word events for a list of today's events.\nEnter the letter o or the word olympians for a list of the competing olympians." +
                "\nEnter the letter h or the word help to display some helpful tips if you are having trouble. ");

    }
    public static void main(String[] args) {
        /*call initialize and welcome method*/
        Main.InitializeAndWelcome();
        /*Create userInput variable based on the first position in the args array*/
        String userInput = args[0];
        /*Use main method to check the arguments passed into the program and return the corresponding values*/
        System.out.println("Enter e for a list of events, o for a list of the olympians, or h for help");

        if (userInput.equals("e")){
            /*make a call to displayEvents method*/
            displayEvents();
        } else if (userInput.equals("events")){
            displayEvents();
        } else if (userInput.equals("o")){
            /*make a call to the displayOlympians method*/
            displayOlympians();
        } else if (userInput.equals("olympians")) {
            /*make a call to the displayOlympians method*/
            displayOlympians();
        } else if (userInput.equals("h")){
            displayHelp();
        } else if (userInput.equals("help")){
            displayHelp();
        } else {
            System.out.println("Invalid input, entering the letters e, o, or h or the words events, olympians, or help as they appear before you.");
        }}
    public static void displayEvents(){
        System.out.println(Arrays.toString(eventsArray));
    }
    public static void displayOlympians(){
        System.out.println(Arrays.deepToString(olympiansArray));
    }
    public static void displayHelp(){
        System.out.println("Your input is case sensitive, make sure you are using lowercase letters and try again.\n" +
                "Remember, entering the letter e or the word events will display a list of today's events.\n" +
                "Entering the letter o or the word olympians will display a list of the olympians competing today.\n" +
                "Entering the letter h or the word help brings you to this message.\n" +
                "Entering anything other than the above arguments will not work.");
    }}
