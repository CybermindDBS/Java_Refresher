// Generics Advanced yet to learn

public class Generics <T extends Number>{
    T t;
    Generics(T t)
    {
        this.t = t;
    }

    public void print()
    {
        System.out.println(this.t);
    }

    public static void main(String[] args) {
        Generics<Float> ref = new Generics<>(1.99f);
        ref.print();
    }
}
