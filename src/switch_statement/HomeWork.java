package switch_statement;

import java.util.Scanner;

public class HomeWork {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput = scanner.nextLine();
        switch (userInput) {
            default -> {
                System.out.println("please enter one of these values : login, sign_up, terminate_program, main_menu, about_menu");
            }
            case "login" -> System.out.println("Please enter your username");
            case "sign_up" -> System.out.println("Welcome");
            case "terminate_program" -> System.out.println("Thank you! Good bye");
            case "main_menu" -> System.out.println("Main menu");
            case "about_menu" -> System.out.println("this app is created by me with the support of it-bulls.com");
        }
    }
}
