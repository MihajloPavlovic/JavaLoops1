
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//      System.out.println("Loops");
//      
//      int age = 18;
//      
//      if (age >= 18) {
//          System.out.println("Osoba je punoletna");
//      } else {
//         System.out.println("Osoba je maloletna");
//      }
//          System.out.println("Koliko imate godina");
//      
//        Scanner in = new Scanner(System.in);
//        int personAge = in.nextInt();
//        
//            System.out.println("Uneli ste broj: " + personAge);
//      if (personAge < 0 || personAge > 150) {
//        System.out.println("Neispravan unos");
//      } else if (personAge <= 2){
//        System.out.println("Osoba je beba");
//      } else if (personAge <= 10) {
//        System.out.println("Osoba je dete");
//      } else if (personAge <= 17) {
//        System.out.println("Osoba je tinejdzer");
//      } else {
//        System.out.println("Osoba je odrasla");
//      }
//          System.out.println("------------");
//          System.out.println("Unesite redni broj dana u nedelji(1-7) ");
//          Scanner in2 = new Scanner(System.in);
//          int dayNumber = in2.nextInt();
//         // System.out.println("Uneli ste broj" + dayNumber);
//         String day;
//         switch (dayNumber) {
//             case 1:
//                 day = "Ponedeljak";
//                 break;
//             case 2:
//                 day = "Utorak";
//                 break;
//             case 3:
//                 day = "Sreda";
//                 break;
//             case 4:
//                 day = "Cetvrtak";
//                 break;
//             case 5:
//                 day = "Petak";
//                 break;
//             case 6:
//                 day = "Subota";
//                 break;
//             case 7:
//                 day = "Nedelja";
//                 break;
//             default:
//                 day = "Dan je nepoznat";
//                 break;
//         }
//         System.out.println("Dan je: " + day );
//         System.out.println("Unesite redni broj dana u nedelji(1-7) ");
//          Scanner in3 = new Scanner(System.in);
//          int dayNumber1 = in3.nextInt();
//         // System.out.println("Uneli ste broj" + dayNumber);
//         String day1;
//         day = switch (dayNumber1) {
//            case 1 -> "Ponedeljak";
//            case 2 -> "Utorak";
//            case 3 -> "Sreda";
//            case 4 -> "Cetvrtak";
//            case 5 -> "Petak";
//            case 6 -> "Subota";
//            case 7 -> "Nedelja";
//            default -> "Dan je nepoznat";
//        };
//         System.out.println("Dan je: " + day );
        //Nova verzija
        
//        System.out.println("While loop example");
//        
//        int x = 1;
//        while ( x < 10); {
//        System.out.println(x);
//        x++;
//        }
//        while ( x > 0){
//        System.out.println(x);
//        x--;
//        }
//        System.out.println("Trenutna vrednost broja X je: " + x);
//        while (x > 5); {
//        System.out.println(x);
//        }
//        System.out.println("Do While loop example");
//        int y = 20;
//        do {
//            System.out.println(y);
//            y = y + 2;
//        } while (y < 40);
//          System.out.println("for loop example");
//          for (int i = 50; i < 70; i++) {
//              System.out.println("*");
//        }
//          for (int i = 99; i >= 90; i--) {
//            System.out.println("*");
//        }
//            for (int i = 0; i < 10; i++) {
//              System.out.println("* * * * * * * * * *");   
//          }
//            for (int i = 1; i <= 10; i++) {
//              System.out.println(i + ",1 " + i + ",2 " + i + ",3 ");   
//          }
//            for (int i = 1; i <= 20; i++) {
//                for (int j = 1; j <= 20; j++) {
//                    System.out.print(" * "); 
//                }
//            System.out.println();
//          }
            for (int i = 1; i < 20; i++) {
                for (int j = 1; j <= i ; j++) {
                    System.out.print(" * "); 
                }
            System.out.println(" ");
          }
    }
}
