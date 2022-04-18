package javapractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Welcome to User Registration");
        System.out.println("Enter Your First Name: ");
        String firstName = get.nextLine();
        Pattern pattern = Pattern.compile("^([A-Z]{1})([a-z]{2})([a-z]*)$");
        Matcher matchName1 = pattern.matcher(firstName);
        if(!matchName1.find())
            System.out.println("Invalid First Name");
    }
}
