import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj zdanie. Sprawdźmy czy podane zdanie jest palindronem.");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String sentence = scanner.nextLine();
            if (sentence .equals("koniec")) {
                break;
            }

            boolean isPalindrome = true;
            for (int i = 0; i < sentence.length() /2; i++) {
                char currentChar = sentence.charAt(i);
                char otherChar = sentence.charAt(sentence.length() - i - 1);

                if (currentChar != otherChar) {
                    isPalindrome = false;
                    System.out.println("Przekazane zdanie/wyraz \"" + sentence + "\" nie jest palindronem.");
                    System.out.println("Spróbój z innym.");

                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Przekazane zdanie/wyraz \"" + sentence + "\" jest palindronem.");
            }


        }

        System.out.println("Koniec działania programu.");
    }


}