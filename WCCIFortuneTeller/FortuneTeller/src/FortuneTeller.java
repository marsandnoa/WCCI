import java.util.Scanner;

public class FortuneTeller {
    public static String fName;
    public static String lName;
    public static int age;
    public static int bMonth;
    public static char color;
    public static int numSib;

    public static void promptInfo(Scanner termScanner) {
        System.out.println("What is your first name?");
        fName = termScanner.nextLine();
        System.out.println("What is your last name?");
        lName = termScanner.nextLine();
        System.out.println("How Old are you?");
        age = Integer.parseInt(termScanner.nextLine());
        System.out.println("What month is your birthday? Enter as integer 1-12");
        bMonth = Integer.parseInt(termScanner.nextLine());
        System.out.println(
                "What is your favorite ROYGBIV color?Answer with first letter. Enter help for more information");

        boolean validInput = false;
        while (validInput != true) {
            String inputParse = termScanner.nextLine();
            if (inputParse.length() == 1) {
                color = inputParse.toUpperCase().charAt(0);
                validInput = true;Noa
            } else {
                System.out.println("ROYGBIV refers to red,orange,yellow,green,blue,indigo,violet");
            }
        }
        System.out.println("How many siblings?");
        numSib = Integer.parseInt(termScanner.nextLine());
    }

    public static void outputInfo() {
        String outputString = fName + " " + lName + " will retire in ";
        if (age % 2 == 0) {
            outputString = outputString + "12 years";
        } else {
            outputString = outputString + "14 years";
        }
        outputString = outputString + " with ";
        if (bMonth < 5) {
            outputString = outputString + "$256,000.76";
        } else if (bMonth < 9) {
            outputString = outputString + "$3,687,105.42";
        } else if (bMonth < 13) {
            outputString = outputString + "$86.23";
        } else {
            outputString = outputString + "$0.00";
        }
        outputString = outputString + " in the bank, a vacation home in ";
        if (numSib < 0) {
            outputString = outputString + "Chernobyl, Ukraine";
        } else if (numSib == 0) {
            outputString = outputString + "Boca Raton, FL";
        } else if (numSib == 1) {
            outputString = outputString + "Nassau, Bahamas";
        } else if (numSib == 2) {
            outputString = outputString + "Ponta Negra,Brazil";
        } else if (numSib == 3) {
            outputString = outputString + "Portland, OR";
        } else {
            outputString = outputString + "Baton Rouge, LA";
        }

        outputString = outputString + ", and travel by ";

        switch (color) {
            case 'R':
                outputString = outputString + "Maserati";
                break;

            case 'O':
                outputString = outputString + "Stallion";
                break;

            case 'Y':
                outputString = outputString + "Chariot";
                break;

            case 'G':
                outputString = outputString + "Taxi";
                break;

            case 'B':
                outputString = outputString + "Rickshaw";
                break;

            case 'I':
                outputString = outputString + "Motor Scooter";
                break;

            case 'V':
                outputString = outputString + "Flying Saucer";
                break;

            default:
                break;
        }
        outputString = outputString + ".";
        System.out.println(outputString);
    }

    public static void main(String[] args) throws Exception {

        Scanner termScan = new Scanner(System.in);
        promptInfo(termScan);
        outputInfo();
        termScan.close();
    }
}
