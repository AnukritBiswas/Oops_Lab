package Day_9;

import java.io.*;

class CompareBinaryFiles {
    public static void main(String[] args) {
        String file1 = "file1.bin";
        String file2 = "file2.bin";
        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);
            int b1, b2;
            int position = 1;
            boolean areEqual = true;
            while (true) {
                b1 = fis1.read();
                b2 = fis2.read();
                if (b1 != b2) {
                    areEqual = false;
                    break;
                }
                if (b1 == -1 && b2 == -1) {
                    break;
                }
                position++;
            }
            fis1.close();
            fis2.close();
            if (areEqual) {
                System.out.println("Two files are equal");
            } else {
                System.out.println("Two files are not equal: byte position at which two files differ is " + position);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
