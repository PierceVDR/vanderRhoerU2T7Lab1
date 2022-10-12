import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first string: ");
        String first = scan.nextLine();

        int len1 = first.length();
        System.out.println("Your string is " + len1 + " characters long.");
        System.out.println("The first half is: " + first.substring(0, (len1 + 1) / 2));
        System.out.println("The second half is: " + first.substring(len1 / 2));

        System.out.print("Enter your second string: ");
        String second = scan.nextLine();

        scan.close();

        int len2 = second.length();
        if (len1 != len2) {

            if (len1 > len2) {
                System.out.print(first);
            } else {
                System.out.print(second);
            }
            System.out.println(" is longer");

        } else {
            System.out.println("Both strings have the same length");
        }

        int dif = first.compareTo(second);
        if (dif < 0) {
            System.out.println(first + " is first alphabetically");
        } else if (dif>0) {
            System.out.println(second + " is first alphabetically");
        }

        if ( first.equals(second) ) {System.out.println("Both strings have the exact same characters");}

        int idx = first.indexOf(second);
        System.out.print(second + " is ");
        if (idx == -1) {
            System.out.print("NOT found in " + first);
        } else {
            System.out.print("found in " + first + " at index " + idx);
        }

    }
}
