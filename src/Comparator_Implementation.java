import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Comparator_Implementation implements Comparator<SampleData> {
    // Implementing this comparator so that it sorts all the negative numbers in descending order and positive numbers in ascending order.
    public int compare(SampleData curr, SampleData next) {
        if (curr.i < 0) {
            if (curr.i < next.i && next.i < 0) return 1;
            else return -1;
        } else
            return Integer.valueOf(curr.i).compareTo(next.i);
    }

    public static void main(String[] args) {
        Comparator_Implementation myComparator = new Comparator_Implementation();
        SampleData ci = new SampleData(1, "a");
        SampleData ci2 = new SampleData(2, "aa");
        SampleData ci3 = new SampleData(3, "aaa");
        SampleData ci4 = new SampleData(4, "A");
        SampleData ci5 = new SampleData(5, "AA");
        SampleData ci6 = new SampleData(6, "AAA");
        SampleData ci7 = new SampleData(0, "aA");
        SampleData ci8 = new SampleData(-1, "Aa");
        SampleData ci9 = new SampleData(-2, "aAa");
        SampleData ci10 = new SampleData(-3, "AaA");
        SampleData ci11 = new SampleData(-4, "aaA");
        SampleData ci12 = new SampleData(-5, "AAa");
        ArrayList<SampleData> al = new ArrayList<>(Arrays.asList(ci,ci2,ci3,ci4,ci5,ci6,ci7,ci8,ci9,ci10,ci11,ci12));
        al.sort(myComparator);
        System.out.println(al);
    }
}

class SampleData {
    int i;
    String str;

    public String toString()
    {
        return str+":" +i;
    }

    SampleData(int i, String str) {
        this.i = i;
        this.str = str;
    }
}