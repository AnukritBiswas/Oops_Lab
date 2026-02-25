package Day_8;

import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        String changedCase = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                changedCase += Character.toLowerCase(ch);
            else
                changedCase += Character.toUpperCase(ch);
        }
        System.out.println("The string after changing the case is " + changedCase);
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("The string after reversing is " + reversed);
        System.out.print("\nEnter the second string for comparison : ");
        String str2 = sc.nextLine();
        int ascii1 = 0, ascii2 = 0;
        for (int i = 0; i < str.length(); i++)
            ascii1 += str.charAt(i);
        for (int i = 0; i < str2.length(); i++)
            ascii2 += str2.charAt(i);
        System.out.println("The difference between ASCII value is " + Math.abs(ascii1 - ascii2));
        System.out.print("\nEnter the string to be inserted into first string : ");
        String insertStr = sc.nextLine();
        String inserted = str + " " + insertStr;
        System.out.println("The string after insertion is : " + inserted);
        System.out.print("\nEnter a String : ");
        String str3 = sc.nextLine();
        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Lowercase: " + str3.toLowerCase());
        System.out.print("\nEnter a String : ");
        String str4 = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        int position = str4.indexOf(ch);
        if (position >= 0)
            System.out.println("Position of entered character: " + position);
        else
            System.out.println("Entered character is not present");
        sc.nextLine();
        System.out.print("\nEnter a String : ");
        String str5 = sc.nextLine();
        String rev = new StringBuilder(str5).reverse().toString();
        if (str5.equalsIgnoreCase(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
        System.out.print("\nEnter a String : ");
        String str6 = sc.nextLine();
        int words = str6.trim().isEmpty() ? 0 : str6.trim().split("\\s+").length;
        int vowels = 0, consonants = 0;
        str6 = str6.toLowerCase();
        for (int i = 0; i < str6.length(); i++) {
            char c = str6.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
        sc.close();
    }
}
