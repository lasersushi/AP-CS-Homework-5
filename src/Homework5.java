/* 
Lucas Walker
Mr. Menezes
AT CS - C
9/19/26
*/

public class Homework5 {
    public static void main(String[] args) {

    }

    public static void drawLine(int x1, int y1, int x2, int y2) {
        if (x1 < 0 || x1 > 10 || y1 < 0 || y1 > 10 || x2 < 0 || x2 > 10 || y2 < 0 || y2 > 10) {
            // Invalid coordinate provided, print an error message to the user
            System.out.println("One of the input coordinates is not in the 10x10 grid");
        } else {
            // Draws line in hidden grid, print confirmation message to the user
            System.out.println("Drew a line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        }
    }

    public static void respondToRSVP(boolean rsvp, int selection, String option1, String option2) {
        String choice = null;
        if (selection == 1) {
            choice = "beef";
        } else if (selection == 2) {
            choice = "chicken";
        } else if (selection == 3) {
            choice = "pasta";
        } else {
            choice = "fish";
        }
        if (rsvp) {
            System.out.println("attending");
            option1 = "Thanks for attending. You will be served " + choice + ".";
        } else {
            System.out.println("not attending");
            option1 = "Sorry you can't make it";
        }
        System.out.println(choice);
        if (option1.equals(option2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}