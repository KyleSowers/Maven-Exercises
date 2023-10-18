import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {




    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);

//
        System.out.println("Enter Something");
        String input = scanner.nextLine();

        if (StringUtils.isNumeric(input)) {
            System.out.println(input + " is a number.");
        } else {
            System.out.println("You Entered: " + input);
        }

        System.out.println(StringUtils.swapCase(input));

        System.out.println(StringUtils.reverse(input));


    }




}
