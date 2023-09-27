package console_apps.MTN_Pulse;

import java.util.Scanner;

public class MashUp {
    public static void main(String[] args){
        System.out.println("Welcome to MTN Pulse.");
        System.out.println("1) MashUp for Self");
        System.out.println("2) MashUp for Others");
        System.out.println("3) Convert Minutes To Data");
        System.out.println("4) Pulse Loyalty");
        System.out.println("5) Check Promo Points");
        System.out.println("99) More");
        System.out.println("0) Back");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Reply: ");
        int reply = scanner.nextInt();

//        Switch
        switch(reply){
//            MashUp for Self
            case 1:
                System.out.println("\nMashUp Offers");
                System.out.println("1) MashUp GHC 1");
                System.out.println("2) MashUp GHC 5");
                System.out.println("3) MashUp GHC 10");
                System.out.println("4) MashUp GHC 30");
                System.out.println("0) Back");

                System.out.print("Reply: ");
                int mashUpForSelfReply = scanner.nextInt();

                switch(mashUpForSelfReply){
//                    MashUp GHC 1
                    case 1:
                        System.out.println("\nSelect one of the following:");
                        System.out.println("1) GHC 1");
                        System.out.println("2) Enter amount GHC(GHC 0.07 - 4.99)");
                        System.out.println("0) Back");
                        break;

                    case 2:
//                        MashUp GHC 5
                        System.out.println("\nSelect one of the following:");
                        System.out.println("1) GHC 5");
                        System.out.println("2) Enter amount GHC (Between 5 - 9.99)");
                        System.out.println("0) Back");
                        break;

                    case 3:
//                        MashUp GHC 10
                        System.out.println("\nSelect one of the following:");
                        System.out.println("1) GHC 10");
                        System.out.println("2) Enter amount GHC (Between 10 - 29.99");
                        System.out.println("0) Back");
                        break;

                    case 4:
//                        MashUp GHC 30
                        System.out.println("\nY'ello! the MashUp GHC 30 Bundle gives you 2690.58 MB.");
                        System.out.println("This bundle does not expire.");
                        System.out.println("1) Buy");
                        break;

                    case 0:
//                        Back
                        System.out.println("\nTo be implemented soon!");
                        break;

                    default:
                        System.out.println("\nPlease enter a valid response(number).");
                        break;

                }
                break;

            case 2:
//                MashUp For Others
                System.out.print("\nEnter Phone Number: ");
                break;

            case 3:
//                Convert Minutes To Data
                System.out.println("\nYou have zero minutes");
                break;

            default:
                System.out.println("\nPlease enter a valid response(number).");
                break;

        }

    }

}
