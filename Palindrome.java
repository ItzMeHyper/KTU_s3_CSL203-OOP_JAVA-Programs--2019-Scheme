import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        int i, len, flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        len = str.length();
        sc.close();

        for (i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Given string " +str+ " is palindrome");
        } else {
            System.out.println("Given string " +str+ " is not a palindrome");
        }
    }
}