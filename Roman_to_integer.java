import java.util.Scanner;

public class RomanToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanInput = scanner.nextLine().toUpperCase();

        int result = 0;

        for (int i = 0; i < romanInput.length(); i++) {
            char currentChar = romanInput.charAt(i);
            int currentValue = getRomanValue(currentChar);

            if (i + 1 < romanInput.length()) {
                char nextChar = romanInput.charAt(i + 1);
                int nextValue = getRomanValue(nextChar);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        System.out.println("The integer equivalent is: " + result);
    }

    private static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; 
        }
    }
}