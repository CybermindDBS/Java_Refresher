import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Comparable_Implementation implements Comparable<Comparable_Implementation>{
    int i;
    String str;
    Comparable_Implementation(int i, String str)
    {
        this.i = i;
        this.str = str;
    }

    public int compareTo(Comparable_Implementation other)
    {
        return this.str.compareTo(other.str);
        //return Integer.valueOf(i).compareTo(other.i);
    }

    public String toString()
    {
        return str+":" +i;
    }

    public static void main(String[] args) {
        Comparable_Implementation ci = new Comparable_Implementation(1, "a");
        Comparable_Implementation ci2 = new Comparable_Implementation(2, "aa");
        Comparable_Implementation ci3 = new Comparable_Implementation(3, "aaa");
        Comparable_Implementation ci4 = new Comparable_Implementation(4, "A");
        Comparable_Implementation ci5 = new Comparable_Implementation(5, "AA");
        Comparable_Implementation ci6 = new Comparable_Implementation(6, "AAA");
        Comparable_Implementation ci7 = new Comparable_Implementation(0, "aA");
        Comparable_Implementation ci8 = new Comparable_Implementation(-1, "Aa");
        Comparable_Implementation ci9 = new Comparable_Implementation(-2, "aAa");
        Comparable_Implementation ci10 = new Comparable_Implementation(-3, "AaA");
        Comparable_Implementation ci11 = new Comparable_Implementation(-4, "aaA");
        Comparable_Implementation ci12 = new Comparable_Implementation(-5, "AAa");
        ArrayList<Comparable_Implementation> al = new ArrayList<>(Arrays.asList(ci,ci2,ci3,ci4,ci5,ci6,ci7,ci8,ci9,ci10,ci11,ci12));
        al.sort(Comparator.naturalOrder());
        System.out.println(al);
    }
}
