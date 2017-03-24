/**
 * Created by Mihnea on 19.03.2017.
 */
public class carte1 {
    public static void main(String[] args) {

        int[] sir = {1, 3, 5, 6, 9}; // initializez un sir

        boolean found = false; //dau valoarea fals la un boolean care poate fi doar true sau false, boolean numit found

        int val = 3;

        for(int i=0; i<sir.length;i++) { //pentru un i de la 0 la lungimea sirului si i primeste i + 1
            if (sir[i] == val) { //daca ajunge for-ul la valoarea i, care e element al sirului
                found = true; //schimbam valoarea booleanului found
            continue;
            }

        }

        if (found) {
            System.out.println("l-am gasit"); //daca found=true dar nu mai trebuie scris true sau false fiindca poate fi ori true ori false
        }
        else {
            System.out.println("nu l-am gasit");
        }

    }
}



