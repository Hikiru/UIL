import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Emily {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner emily = new Scanner(new File("2023B/emily.dat"));
        int lines = emily.nextInt();
        int result = 0;
        int remainder = 0;
        for (int i = 0; i < lines; i++) {
            int num1 = emily.nextInt();
            String operator = emily.next();
            int num2 = emily.nextInt();
            switch (operator) {
                case "+":
                    result = (num1 + num2);
                    break;
                case "-":
                    result = (num1 - num2);
                    break;
                case "x":
                case "X":
                case "*":
                    result = (num1 * num2);
                    break;
                case "/":
                    result = (num1 / num2);
                    remainder = num1 % num2;
                    break;
            }
            if (operator.equals("/")) {
                System.out.println(num1 + " / " + num2 + " = " + result + " remainder " + remainder);
            } else {
                System.out.println(num1 + " + " + num2 + " = " + result);
                emily.nextLine();
            }
        }   
    }
}