package string_formatting;

import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class HomeWork {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        String strDouble = String.format("%.1f", Math.PI);
        String strDouble2 = String.format("%.2f", Math.PI);
        String strDouble3 = String.format("%.3f", Math.PI);
        String strDouble4 = String.format("%.4f", Math.PI);
        String strDouble5 = String.format("%.5f", Math.PI);
        System.out.println(strDouble);
        System.out.println(strDouble2);
        System.out.println(strDouble3);
        System.out.println(strDouble4);
        System.out.println(strDouble5);

        String userInput = scanner.nextLine();
        String[] input = userInput.split(" ");
        System.out.println(Arrays.toString(input));

    }

}
