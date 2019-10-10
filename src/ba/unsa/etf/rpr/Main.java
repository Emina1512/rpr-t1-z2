package ba.unsa.etf.rpr;
import java.util.*;

public class Main {

    public static int sumaCifara(int s) {
        if ( s < 10 ) return s;
        int suma = 0;
        while (s > 0) {
            suma += s % 10;
            s /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj elemenata: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++)
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
    }
}
