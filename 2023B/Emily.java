import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Emily {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner emily = new Scanner(new File("2023B/emily.dat"));
        int lines = emily.nextInt();
        for (int i = 0; i < lines; i++) {
            int num1 = emily.nextInt();
            String operator = emily.next();
            System.out.println(num1);
            emily.nextLine();

        }
    }
}