public class Task6 {
    public static void main (String[] args) {
        String a = "Example";
        int count = storage(a);
        System.out.println("Double count of letters is: "+count);
    }

    private static int storage (String s) {
        return s.length() * 2;
    }
}