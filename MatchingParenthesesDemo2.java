import java.util.Scanner;

public class MatchingParenthesesDemo2 {
    final private static String QUIT = "q";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter math expression (q to quit): ");

            String expression = in.nextLine();
            if (expression.equals(QUIT))
                break;

            MatchingParentheses2 matcher = new MatchingParentheses2(expression,"{([<", "})]>");

            MatchState state = matcher.check();

            if (state == MatchState.MISSING_RIGHT)
                System.out.println("Missing right parenthesis");
            else if (state == MatchState.MISSING_LEFT)
                System.out.println("Missing left parenthesis");
            else
                System.out.println("Parentheses are balanced");

            System.out.println();
        }

        System.out.println("Done checking");

        in.close();
    }
}
