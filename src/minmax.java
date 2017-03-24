/**
 * Created by Mihnea on 21.03.2017.
 */
public class minmax {
    public static void main(String[] args) {
        int[] maxarray = {1, 3, 6, 4, 9, 7, 15, 13};
        int[] minarray = {4, 5, 7, 11, 3, 9};
        int maxim = maxarray[0];
        int minim = minarray[0];

            for (int i = 0; i < maxarray.length; i++) {

                if (maxarray[i] > maxim) {
                    maxim = maxarray[i];
                }
            }

                System.out.println("Numarul maxim din primul sir este "+ maxim);
            for (int j =0; j < minarray.length; j++) {
                if (minarray[j]<minim ) {
                    minim = minarray[j];
                }
            }
        System.out.println("Numarul minim din al doilea sir este " + minim);


    }
}