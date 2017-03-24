/**
 * Created by Mihnea on 22.03.2017.
 */
// fa un program unde ai un sir de elemente,
// pe care le vrei tu si dupaia cu un for verifici daca fiecare element e mai mare decat dublul elementului anterior;
// daca da, afisezi pe ecran triplul elementului curent - 1,
// daca nu afisezi pe ecran media aritmetica dintre elementul anterior si elementul curent
    import java.util.Scanner;
public class exercitiu0 {
    public static void main(String[] args) {
       /* int[] sir1 = {10,25,51,120};*/

        Scanner nrel = new Scanner(System.in);
        System.out.println("Introduceti numarul elementelor din sir: ");
        int n = nrel.nextInt();
        int sir1[] = new int[n];
        System.out.println("Introduceti numerele din sir: ");
        for(int i=0; i< n; i++) {
            sir1[i] = nrel.nextInt();

        }



//        System.out.println(sir1.length);
        int test = sir1[0];
        for(int i=0; i<sir1.length; i++){
            if(i == 0) {
                continue;
            }
            if (sir1[i] * 2 > test) {
                System.out.println(sir1[i] * 3 - 1);
                }
             else {
                double x = (sir1[i]+test)/2.0;
                System.out.println(x);
            }
            test = sir1[i];

        }

    }
}
