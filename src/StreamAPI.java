import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPI {
    static ArrayList<SampleData2> al = new ArrayList<>();

    static {
        setArrayList();
    }

    public static void setArrayList() {
        SampleData2 ci = new SampleData2(1, "a");
        SampleData2 ci2 = new SampleData2(2, "aa");
        SampleData2 ci3 = new SampleData2(3, "aaa");
        SampleData2 ci4 = new SampleData2(4, "A");
        SampleData2 ci5 = new SampleData2(5, "AA");
        SampleData2 ci6 = new SampleData2(6, "AAA");
        SampleData2 ci7 = new SampleData2(0, "aA");
        SampleData2 ci8 = new SampleData2(-1, "Aa");
        SampleData2 ci9 = new SampleData2(-2, "aAa");
        SampleData2 ci10 = new SampleData2(-3, "AaA");
        SampleData2 ci11 = new SampleData2(-4, "aaA");
        SampleData2 ci12 = new SampleData2(-5, "AAa");
        al.clear();
        al = new ArrayList<>(Arrays.asList(ci, ci2, ci3, ci4, ci5, ci6, ci7, ci8, ci9, ci10, ci11, ci12));
    }

    public static void main(String[] args) {

        // Look into the code structure of the following interfaces.
        Predicate predicate; // for filter, anyMatch, allMatch, noneMatch
        Function function; // for map
        Consumer consumer; // for forEach
        BinaryOperator binaryOperator; // for reduce

    }

    public static void filter() {
        List<SampleData2> l1 = al.stream().filter((x) -> x.i > 0).collect(Collectors.toList());
        System.out.println(l1);
    }

    public static void forEach() {
        al.stream().forEach((x) -> System.out.println(x));
    }

    public static void Map() {
        // Converting SampleData2 stream to Integer stream.
        List<Integer> l1 = al.stream().map((x) -> {
            x.i += 10;
            return x.i;
        }).collect(Collectors.toList());
        System.out.println(al); // modified original arrayList.
        System.out.println(l1); // newly generated list.

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        al.stream().map((x)->x-1);
        System.out.println(al); // unmodified original arrayList.
    }

    public static void reduce() {
        List<Integer> l1 = al.stream().map((x) -> x.i).collect(Collectors.toList());
        int sum = l1.stream().reduce(0, (a, b) -> a + b);
        int max = l1.stream().reduce(0, (a, b) -> a > b ? a : b);
    }

    public static void Matching() {
        boolean b1 = al.stream().allMatch((x) -> x.str.equals("a"));
        boolean b2 = al.stream().anyMatch((x) -> x.str.equals("a"));
        boolean b3 = al.stream().noneMatch((x) -> x.str.equals("a"));
        System.out.println(b1 + " " + b2 + " " + b3);
    }

    public static void utilities() {
        al.stream().distinct().limit(5).sorted().collect(Collectors.toList());
    }
}

class SampleData2 {
    int i;
    String str;

    public String toString() {
        return str + ":" + i;
    }

    SampleData2(int i, String str) {
        this.i = i;
        this.str = str;
    }
}