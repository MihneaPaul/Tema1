/**
 * Created by Mihnea on 22.03.2017.
 */
import java.util.Scanner;
public class test1 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.println("the array size is" + n);
        int[] a = new int[7];
        for (int i = 0; i >= a.length; i++) {
            a[i] = sn.nextInt();
            System.out.println("the value of a[i]" + a[i]);
        }
        sn.close();
        System.out.println("array values are");
    }

    }

