package javapractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Welcome to User Registration");
        System.out.println("Enter Your First Name: ");
        String firstName = get.nextLine();
        System.out.println("Enter your Second Name: ");
        String secondName = get.nextLine();
        System.out.println("Enter your Mail Id");
        String mail = get.nextLine();
        System.out.println("Enter your Phone Number");
        String number = get.nextLine();
        System.out.println("Enter your PassWord");
        String passWord = get.nextLine();
        Pattern name = Pattern.compile("^([A-Z])([a-z]{2})([a-z]*)$");
        Pattern email = Pattern.compile("^([a-z0-9]+)([.+_-][a-z0-9]*)*@([a-z0-9]+)(.[a-z]{2,4})?(.[a-z]{2,4})$");
        Pattern phoneNumber = Pattern.compile("^91 [0-9]{10}$");
        Pattern passCode = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$).{8,}$");
        Matcher matchName1 = name.matcher(firstName);
        Matcher matchName2 = name.matcher(secondName);
        Matcher matchEmail = email.matcher(mail);
        Matcher matchPhoneNo = phoneNumber.matcher(number);
        Matcher matchPassWord = passCode.matcher(passWord);
        if(!matchName1.find())
            System.out.println("Invalid First Name");
        if(!matchName2.find())
            System.out.println("Invalid Second Name");
        if(!matchEmail.find())
            System.out.println("Invalid Email Id");
        if(!matchPhoneNo.find())
            System.out.println("Invalid Phone Number");
        if(!matchPassWord.find())
            System.out.println("Invalid PassWord");
    }
}
