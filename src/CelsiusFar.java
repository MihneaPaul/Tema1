/**
 * Created by Mihnea on 21.03.2017.
 */
import java.util.Scanner;
public class CelsiusFar {
    public static void main(String[] args) {
        Scanner Far = new Scanner(System.in);


        System.out.println("Introduceti temperatura in Fahrenheit: ");
        float Fahr;
        Fahr = Far.nextFloat();
        float Celsius = ((Fahr - 32)*5/9);
        System.out.printf("Temperatura convertita in Celsius este " + Celsius);

    }
}
