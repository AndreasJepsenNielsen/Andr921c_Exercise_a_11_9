import java.util.*;

import java.util.Set;

//opgave 9

public class Opgave9 {

    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>();

        a.add(1);
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(5);
        a.add(6);
    hasEven(a);
}

    public static boolean hasEven(Set<Integer> set)
    {
        for (int n: set) {
            if(n % 2 == 0) { // hvis der er en even i settet
                System.out.println("true");
                return true;
            }

        }
        System.out.println("false");
        return false;
    }

}
