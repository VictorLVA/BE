public class Task8 {
    public static void main (String[] args) {
        StaticTest2 st1 = new StaticTest2();
        StaticTest2 st2 = new StaticTest2();
        Incrementable.increment();
        System.out.println();
        System.out.println("i "+StaticTest2.i);
        System.out.println("st1 "+st1.i);
        System.out.println("st2 "+st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println();
        System.out.println("i "+StaticTest2.i);
        System.out.println("st1 "+st1.i);
        System.out.println("st2 "+st2.i);
    }
}

class StaticTest2 {
    static int i = 47;
}

class Incrementable {
    static void increment () {
        StaticTest2.i++;
    }
}
