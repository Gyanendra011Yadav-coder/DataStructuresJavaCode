package FirstPhaseLearning.greyNodesAssignment.SkipListTask;

import java.util.TreeSet;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-29,Jul,2023
 * in Project: DataStructuresJavaCode
 */
class InterfacesExample implements Comparable<InterfacesExample> {
    String name;
    int level;
    int hp;

    public InterfacesExample(String ourName, int startingLevel, int startingHp) {
        name = ourName;
        level = startingLevel;
        hp = startingHp;
    }

    public void printCharacter() {
        System.out.printf("Name: %10s  Level: %5d  HP: %5d\n", name, level, hp);
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.  (From Java SDK)
     */

    @Override
    public int compareTo(InterfacesExample o) {
        if(level != o.level) return Integer.compare(level, o.level);
        if(hp != o.hp) return Integer.compare(hp, o.hp);
        return name.compareTo(o.name);
    }

    public static void main(String args[]) {
        TreeSet<InterfacesExample> characters = new TreeSet<>();

        InterfacesExample a = new InterfacesExample("Alice", 10, 100);
        InterfacesExample b = new InterfacesExample("bob", 10, 100);
        InterfacesExample c = new InterfacesExample("Carol", 10, 100);
        InterfacesExample e = new InterfacesExample("Eve", 25, 250);
        InterfacesExample m = new InterfacesExample("Mallory", 15, 75);
        InterfacesExample t = new InterfacesExample("Trent", 10, 200);

        characters.add(a);
        characters.add(b);
        characters.add(c);
        characters.add(e);
        characters.add(m);
        characters.add(t);

        for(InterfacesExample ch: characters) {
            ch.printCharacter();
        }
    }

}
