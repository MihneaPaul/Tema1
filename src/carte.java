/**
 * Created by Mihnea on 19.03.2017.
 */
public class carte {
    public static void main(String[] args) {
       int a = 3, b= 4, options = 0; // optimizing code ^_^, since all your variables are integers you can group them

       if( a <= b ) { // testing beforehand for our desired to condition
                     // in order to determine on which branch on the below switch should the code proceed to
           options = 1; // this happens if a<b
       }
       else { // instead of else I could have written else if (b > a) but it is redundant, since if a is not smaller OR EQUAL to b , it can only be greater
           options = 2; // this happens if ELSE
       }

       switch(options) {  // the 'controller' of a switch can only be integer, no other data type accepted
           case 1: // cases of a switch can only be integers, no other data types accepted
               System.out.println("Mihnea"); break;
           case 2: // cases of a switch can only be integers, no other data types accepted
               System.out.println("David"); break;
            }
        }


    }




