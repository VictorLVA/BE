public class Task7 {
    public static void main (String[] args) {
        increment();
        System.out.print ("i IS "+StaticTest1.i);
    }
    private static void increment () {
        StaticTest1.i++;
    }
}

class StaticTest1 {
    static int i = 47;
}