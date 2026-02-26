package Day_9;

import java.io.*;
import java.util.Scanner;

class FileStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();
        int characters = 0;
        int words = 0;
        int lines = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] wordList = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordList.length;
                }
            }
            br.close();
            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
