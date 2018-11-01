//import static net.mindview.util.Print.*;

/** Try to use JAVADOC
 * @author Victor Ladutko
 * @version 1.0
 * Other info
 */
class Tree {
    int height;
    Tree() {
        System.out.print("Planting a seedling");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.print("Creating new Tree that is " +
                height + " feet tall");
    }

    /**
     * try
     */
    void info() {
        System.out.print("Tree is " + height + " feet tall");
    }
    /**
     * try
     */
    void info(String s) {
        System.out.print(s + ": Tree is " + height + " feet tall");
    }
}
/** Try to use JAVADOC
 * @author Victor Ladutko
 * @version 1.0
 * Other info
 */
public class Task16 {
    /**
     * 123
     * @param args Arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~