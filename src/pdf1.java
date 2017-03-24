
import java.util.Scanner;


public class pdf1 { //matrice
    public static void main(String[] args) {
       final int[][] myMatrix = {
                { 1, 2, 3},
                { 3, 4, 5},
                { 5, 6, 7 },
        };

        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix.length; j++) { //myMatrix.[i] fiindca se refera ca sirul de pe un row e format din i elemente, care e defapt nr. coloanelor.
                System.out.print(myMatrix[i][j] + " ");
            }

        }
        System.out.println("");


    }
}
