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
        System.out.println("Enter your Second Name: ");
        String secondName = get.nextLine();
        Pattern name = Pattern.compile("^([A-Z])([a-z]{2})([a-z]*)$");
        Matcher matchName1 = name.matcher(firstName);
        Matcher matchName2 = name.matcher(secondName);
        if(!matchName1.find())
            System.out.println("Invalid First Name");
        if(!matchName2.find())
            System.out.println("Invalid Second Name");
    }
}
