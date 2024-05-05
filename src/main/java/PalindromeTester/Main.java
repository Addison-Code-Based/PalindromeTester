package PalindromeTester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean palindromeTester(String input)
    {
        String palindrome = input.toLowerCase();
        if (palindrome.equals("quit"))
            System.exit(0);
        if (!(palindrome.length() % 2 == 0)) {
            return false;}
        for (int i = 0, j = palindrome.length() - 1; i < palindrome.length(); i++, j--) {
            if (i <= j)
                return true;
            if (palindrome.charAt(i) != palindrome.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            while (true) {
                // Reading data using readLine
                String palindrome = reader.readLine();
                System.out.println(palindromeTester(palindrome));
            }
        }
        catch (IOException e) {
            System.exit(0);
        }
    }
}
