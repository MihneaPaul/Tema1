/**
 * Created by Mihnea on 21.03.2017.
 */
import java.util.Scanner;
public class tabelFarCelsius {
    public static void main(String[] args) {
       Scanner grade = new Scanner(System.in);
        System.out.println("Introduceti primul grad Fahrenheit");
        float gradx = grade.nextInt();
        System.out.println("Introduceti ultimul grad Fahrenheit");
        float grady = grade.nextInt();
        for (float i = gradx; i<=grady;i++) {
            float celsius  = ((i - 32)*5/9);
            System.out.println(i + " grade Fahrenheit sunt " + celsius + " grade Celsius");

        }
    }
}
