package Day_9;

import java.io.*;
import java.util.Scanner;

class StudentFileProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Accept student details
            System.out.println("Enter Roll No:");
            int rollNo = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            System.out.println("Enter Subject:");
            String subject = sc.nextLine();
            System.out.println("Enter Marks:");
            double marks = sc.nextDouble();
            sc.nextLine();
            // Enter file name
            System.out.println("Enter the name of existing file:");
            String fileName = sc.nextLine();
            // Write to file
            FileWriter fw = new FileWriter(fileName, true);
            fw.write("Roll No: " + rollNo + "\n");
            fw.write("Name: " + name + "\n");
            fw.write("Subject: " + subject + "\n");
            fw.write("Marks: " + marks + "\n");
            fw.write("--------------------------\n");
            fw.close();
            // Read and display file content
            System.out.println("\nDisplaying file content:\n");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
