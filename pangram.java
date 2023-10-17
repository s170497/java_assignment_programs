import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        
        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram!");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    private static boolean checkPangram(String sentence) {
        boolean[] hasLetter = new boolean[26];

    
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                hasLetter[c - 'a'] = true;
            }
        }

        
        for (boolean has : hasLetter) {
            if (!has) {
                return false;
            }
        }

        return true;
    }
}