/* 
Lucas Walker
Mr. Menezes
AT CS - C
9/19/26
*/

public class Homework5 {
    public static void main(String[] args) {
        String type = args[0];
        String argOne = args[1];
        String argTwo = args[2];
        String argThree = args[3];
        if (type.equals("respondToRSVP")) {
            String argFour = args[4]; // If it is RSVP type, then must also parse an 4th argument. This is only done
                                      // for respondToRSVP because drawSquare only takings in 3 arguemnts.
            boolean rsvp = Boolean.parseBoolean(argOne);
            int selection = Integer.parseInt(argTwo);
            respondToRSVP(rsvp, selection, argThree, argFour);
        } else if (type.equals("drawSquare")) {
            int x = Integer.parseInt(argOne);
            int y = Integer.parseInt(argTwo);
            int len = Integer.parseInt(argThree);
            drawSquare(x, y, len);
        } else {
            throw new IllegalArgumentException("Illegal input for argument number 1, type");
        }
    }

    public static void drawLine(int x1, int y1, int x2, int y2) {
        if (x1 < 0 || x1 > 10 || y1 < 0 || y1 > 10 || x2 < 0 || x2 > 10 || y2 < 0 || y2 > 10) {
            // Invalid coordinate provided, print an error message to the user
            System.out.println("One of the input coordinates is not in the 10x10 grid");
        } else {
            // Draws line in hidden grid, print confirmation message to the user
            System.out.println("Drew a line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        }
        // This is Mr. Menezes starter code
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
            option1 = "Sorry you can't make it.";
        }
        System.out.println(choice);
        if (option1.equals(option2)) {
            System.out.println("true"); // Basically if the string option1 is equal to the string option2 then print
                                        // true. Note that the value of option one can change
        } else {
            System.out.println("false");
        }
    }

    public static void drawSquare(int x, int y, int len) {
        int pointOne = x + len;
        while (pointOne < 0 || pointOne > 10) {
            len = len - 1;
            pointOne = x + len;
        }
        int pointTwo = y - len;
        while (pointTwo < 0 || pointTwo > 10) {
            len = len - 1;
            pointOne = x + len;
            pointTwo = y - len;
        }
        int pointThree = pointOne - len;
        while (pointThree < 0 || pointThree > 10) {
            len = len - 1;
            pointOne = x + len;
            pointTwo = y - len;
            pointThree = pointOne - len;
        }
        int pointFour = pointTwo + len;
        while (pointFour < 0 || pointFour > 10) {
            len = len - 1;
            pointOne = x + len;
            pointTwo = y - len;
            pointThree = pointOne - len;
            pointFour = pointTwo + len;
        }
        // The above well loops check if the square is to large. If so, it creates a
        // smaller value of len
        drawLine(x, y, pointOne, y);
        drawLine(pointOne, y, pointOne, pointTwo);
        drawLine(pointOne, pointTwo, pointThree, pointTwo);
        drawLine(pointThree, pointTwo, pointThree, pointFour); // Calls the draw line method to create the square
        double area = Math.pow(len, 2);
        int areaInt = (int) (area);
        String lenAndArea = "side length = " + len + ", area = " + areaInt;
        System.out.println(lenAndArea);
    }
}