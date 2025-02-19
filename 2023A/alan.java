import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class alan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner temp = new Scanner(new File("2023A/alan.dat"));
        int F = temp.nextInt();
        while (temp.hasNext()) {
            F = temp.nextInt();
            double K = (5 / 9) * (F - 32) + 273.15;
            System.out.println(F + " degrees Fahrenheit is equal to " + K + " Kelvin");
        }
    }
}
