package monu;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {

	public static void main(String[] args) {
		byte[] sample = new byte[67];

        try {
            InputStream input = new FileInputStream("C:\\Users\\Windows 10\\eclipse-workspace\\monu\\src\\monu\\sample.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream
            input.read(sample);
            for (int i = 0; i < sample.length; i++) {
				System.out.print((char)sample[i]);
			}
            System.out.println("");
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(sample);
            System.out.println(data);

            // Close the input stream
            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
