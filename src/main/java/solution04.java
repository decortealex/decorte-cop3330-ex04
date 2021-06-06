/*
 * UCF COP3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class solution04 {
    public static void main(String[] args) {
        String noun, verb, adjective, adverb;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        noun = in.nextLine();

        System.out.print("Enter a verb: ");
        verb = in.nextLine();

        System.out.print("Enter an adjective: ");
        adjective = in.nextLine();

        System.out.print("Enter an adverb: ");
        adverb = in.nextLine();

        System.out.printf("Do you %s your %s %s %s? that's hilarious!", verb, adjective, noun, adverb);
    }
}
