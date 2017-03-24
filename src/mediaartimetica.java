import java.util.Scanner;

/**
 * Created by Mihnea on 21.03.2017.
 */

public class mediaartimetica {


    public static void main(String[] args) {


        Scanner userInput = new Scanner (System.in);

        int numar1 = 0;
        int numar2 = 0;
        System.out.print("Introduceti primul numar: ");
        numar1 = userInput.nextInt(); // Get what the user types.
        System.out.print("Introduceti al doilea numar: ");
        numar2 = userInput.nextInt();
        System.out.println((numar1 + numar2)/2);

    }
}