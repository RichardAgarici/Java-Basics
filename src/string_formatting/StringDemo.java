package string_formatting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String greetingsTemplate = "Hello, dear %s! Good %s!";

        String morning = "morning";
        String afternoon = "afternoon";
        String evening = "evening";

        String firstName = scanner.next();
        String formattedString = String.format(greetingsTemplate, firstName,morning);
        System.out.println(formattedString);

        System.out.printf("You have %d computers available at store \n", 10);
        // %d = formatting a digit

        System.out.println();
        System.out.println("===========================");
        System.out.println();

        String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
        Pattern p = Pattern.compile(gmailPattern);
        String sampletText = "Some random text that contains gmail adress" + "like this one some-email@gmail.com. And some other random.text";
        Matcher m =p.matcher(sampletText);

        m.find();
        String gmailAddress =m.group();
        System.out.println(gmailAddress);

        String sampleText2 = "There are three sentences in this string. Are you sure ? Yes!";
        String[] sentences = sampleText2.split("[\\.!?]");
        System.out.println(Arrays.toString(sentences));
    }
}
