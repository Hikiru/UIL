import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Jacob {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner jacob = new Scanner(new File("2023B/jacob.dat"));
        int lines = jacob.nextInt();
        double pi = 3;
        for (int i = 0; i < lines; i++) {
            pi = 3;
            int n = 2;
            double b = 0;
            int terms = jacob.nextInt();
            for (int j = 0; j < terms; j++) {
                System.out.println(n);
                double a = 4.0/((n) + (++n) + (++n)) * Math.pow((-1), j);
                b += a;
            }
            System.out.println(pi + b);
        }
    }
}