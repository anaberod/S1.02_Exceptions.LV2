import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {


    static Scanner scanner = new Scanner(System.in);



    public static byte readByte(String message) {

        while (true) {
            try {
                System.out.print(message + ": ");
                byte value = scanner.nextByte();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException i) {
                System.out.println("Format error. Please enter a valid byte number.");
                scanner.nextLine();
            }
        }

    }



    public static int readInt(String message) {

        while (true) {
            try {
                System.out.println (message + " : ");
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException i){
                System.out.println("Format error. Please enter a valid integer");
                scanner.nextLine();
            }
        }

    }

    public static float readFloat(String message) {

        while (true) {
            try {
                System.out.println(message + " : ");
                float value = scanner.nextFloat();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException i) {
                System.out.println ("Format error. Please enter a decimal number using a comma.");
                scanner.nextLine();
            }
        }

    }

    public static double readDouble(String message) {

        while (true) {
            try {
                System.out.println(message + " : ");
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException i) {
                System.out.println ("Format error. Please enter a valid decimal number.");
                scanner.nextLine();
            }
        }

    }

    public static char readChar(String message) {
       while (true) {
           try {
               System.out.print(message + ": ");
               String letter = scanner.next();
               if (letter.length() !=1) {
                   throw new PersonalizedException("You must enter exactly one character.");
               }
               return letter.charAt(0);

           }catch (PersonalizedException i) {
               System.out.println("Error: " + i.getMessage());
           }
       }
    }


    public static String readString(String message) {
        while (true) {
            try {
                System.out.println(message + " :");
                String words = scanner.nextLine();
                if (words.trim().isEmpty()) {
                    throw new PersonalizedException("Input cannot be empty.");
                }
                return words;
            } catch (PersonalizedException i) {
                System.out.println("Error: " + i.getMessage());
            }
        }
    }

    
    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.println(message + " (y/n): ");
                String response = scanner.next().toLowerCase();
                if (response.equals("y")) return true;
                if(response.equals("n")) return false;
                throw new PersonalizedException("Only 'y' or 'n' are valid responses.");
            } catch (PersonalizedException i) {
                System.out.println("Error: " + i.getMessage());
            }
        }
    }
}
