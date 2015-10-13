import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputNum = input.nextInt();

        String convertNumToHex = Integer.toHexString(inputNum);

        System.out.printf("The hexadecimal representation of %d is %s", inputNum, convertNumToHex.toUpperCase());
    }
}
