package greyNodesAssignment.SkipListTask;

import java.util.*;
import java.util.concurrent.Callable;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-28,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * Assignment
 * Implement a skip list as a genericized SkipListSet<T> collection in Java. Your class must implement SortedSet<T>
 * (and hence Set<T>, Collection<T> and Iterable<T>).
 * A program that has your class available will be able to instantiate a SkipListSet for any Comparable class, and treat
 * it like any other sorted collection (as long as it uses classes with a natural order).
 * Structure
 * You’ll create three things: a set class, an iterator class, and an item-wrapper (node) class. You’ll almost certainly want to
 * make the iterator and item-wrapper classes internal private classes of the set class. I’ll call the iterator and itemwrapper classes SkipListSetIterator and SkipListSetItem, but you can call them anything you like.
 * SortedSet is a Java interface. That means it specifies a set of methods that you must implement to make it work. Your
 * SkipListSet will implement it.
 * What this means is you’re not calling methods from SortedSet yourself – you’re writing them, so that a program that
 * wants to use your SkipListSet can work with it the same way it would any other SortedSet, like TreeSet.
 * Likewise, Iterator is another Java interface. Your SkipListSetIterator will implement the methods that it
 * requires.
 * Long ago in Java programming, iterators were important constructs to use directly, but enhanced-for syntax eliminates
 * nearly all need to use them explicitly. Once you create your SkipListSetIterator, and implement your
 * SortedSet’s iterator() method, you can immediately use Java enhanced-for syntax on your SkipListSet
 *
 * Implementing a Skip List
 * A skip list is a special linked list. To start with that means your item-wrapper class needs a link to the right like an
 * ordinary linked list (and you will almost certainly want a link to the left as well).
 * Working with links in Java is, overall, relatively easy.
 * • All non-primitive parameters in Java are passed by reference as default, so you don’t need to worry about
 * pointers at all.
 * • Java is a mostly garbage collected language, so to delete list items, all you have to do is “lose” them – nullify all
 * your references to them, and they’ll go away.
 * • This means that to clear your list, all you need to do is nullify your head and tail pointers, set any internal size
 * indicators back to zero or default, and let the garbage collector handle the rest.
 * A skip list is a two-dimensional linked list, so your items will need links vertically as well as horizontally. You can do this
 * two ways:
 * • A true two-dimensional linked list structure, with links upward (and likely downward) from item wrappers either
 * to other item wrappers or to an abbreviated “node hat” class that has only pointers and no payload. This is
 * probably more efficient.
 * • An ArrayList of pointers to the right (and possibly to the left) inside each wrapper item. This is probably
 * easier to implement.
 * o (A primitive array would actually be ideal, but primitive arrays don’t deal well with generics.)
 * No matter how you deal with the vertical dimension, you will need ways to:
 * • Find and traverse to the location of where an item is or could/should be in your skip list.
 * o This should leverage the verticality of the skip list to be �(log �).
 * o All of the methods for addition, removal and containment check will probably reference this.
 * o This will be distinct from your SkipListSetIterator class. More on this below.
 * • Add and delete items, and restore the left/right pointers across the whole verticality of the list.
 * • Shrink and grow items without breaking everything.
 * • Re-balance the list.
 * Remember that an instantiation of your item-wrapper class wraps an item, it is not an item itself. This has three
 * important implications:
 * • When you’re comparing items for traversal or containment checks, you want to compare the wrapped payload
 * items, not the objects of your item wrapper class. Make sure you pass compareTo() through to the wrapped
 * payload items.
 * • Your traversal function will be separate from your SkipListSetIterator. The traversal function works with
 * the item wrappers that you need to deal with internally, while the iterator returns the payload items that the
 * user of the skip list wants.
 * • If the user ever sees an item wrapper – that is, if an object of your SkipListSetItem class ever gets out of
 * your list – something has gone wron
 */
public class SkipListTestHarness {
    private static class CPUTimer {
        public static <T> long timeFor(Callable<T> task) {
            try {
                long start = System.currentTimeMillis();
                T t = task.call();
                long end = System.currentTimeMillis();
                return end - start;
            } catch (Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
            return 0;
        }
    }

    static long RandomSeed = 1;

    static Random RandomGenerator = new Random(RandomSeed);
    static byte[] buf = new byte[1024];

    private static ArrayList<Integer> generateIntArrayList(int howMany) {
        ArrayList<Integer> list = new ArrayList<Integer>(howMany);

        for(int i = 0; i < howMany; i++) {
            list.add(Integer.valueOf(RandomGenerator.nextInt()));
        }

        return list;
    }

    private static ArrayList<Double> generateDoubleArrayList(int howMany) {
        ArrayList<Double> list = new ArrayList<Double>(howMany);

        for(int i = 0; i < howMany; i++) {
            list.add(Double.valueOf(RandomGenerator.nextDouble()));
        }

        return list;
    }

    private static String generateRandomString(int len) {
        if(len > 1024) len = 1024;

        buf[len - 1] = (byte) 0;

        for(int j = 0; j < (len - 1); j++) {
            buf[j] = (byte) (RandomGenerator.nextInt(94) + 32);
        }

        return new String(buf);
    }

    private static ArrayList<String> generateStringArrayList(int howMany, int len) {
        ArrayList<String> list = new ArrayList<String>(howMany);

        for(int i = 0; i < howMany; i++) {
            list.add(generateRandomString(len));
        }

        return list;
    }

    private static <T> ArrayList<T> generateStrikeList(ArrayList<? extends T> fromList, int howMany) {
        ArrayList<T> strikeList = new ArrayList<T>(howMany);
        int fromLast = fromList.size() - 1;

        for(int i = 0; i < howMany; i++) {
            strikeList.add(fromList.get(RandomGenerator.nextInt(fromLast)));
        }

        return strikeList;
    }

    private static <T> ArrayList<T> generateRemoveList(ArrayList<? extends T> fromList) {
        ArrayList<T> removeList = new ArrayList<T>(fromList.size()/2);

        for(int i = 0; i < fromList.size() / 2; i++) {
            removeList.add(fromList.get(i));
        }

        return removeList;
    }

    private static <T> int executeFinds(Collection<? extends T> coll, ArrayList<? extends T> strikes) {
        boolean sentinel;
        int failures = 0;

        for (T e: strikes) {
            sentinel = coll.contains(e);
            if(sentinel == false) {
                failures++;
            }
        }

        if(failures > 0) {
            System.out.printf("(%,d missing) ", failures);
        }

        return 0;
    }

    private static <T extends Comparable<T>> void executeCase(ArrayList<? extends T> values, ArrayList<? extends T> strikes, boolean includeLinkedList, boolean includeRemoves) {
        ArrayList<T> removeList = generateRemoveList(strikes);
        long start;
        long end;
        long ms;

        if(includeLinkedList) {
            LinkedList<T> linkedList = new LinkedList<T>();

            System.out.printf("  LinkedList  ");
            ms = CPUTimer.timeFor(() -> linkedList.addAll(values));
            System.out.printf("add: %,6dms  ", ms);
            ms = CPUTimer.timeFor(() -> executeFinds(linkedList, strikes));
            System.out.printf("find: %,6dms  ", ms);
            if(includeRemoves) {
                ms = CPUTimer.timeFor(() -> linkedList.removeAll(removeList));
                System.out.printf("del: %,6dms  ", ms);
                ms = CPUTimer.timeFor(() -> executeFinds(linkedList, strikes));
                System.out.printf("find: %,6dms  ", ms);
            }
            System.out.printf("\n");
        }

        System.gc();


        if(true) {
            SkipListSet<T> skipListSet = new SkipListSet<T>();

            System.out.printf("  SkipListSet ");
            ms = CPUTimer.timeFor(() -> skipListSet.addAll(values));
            System.out.printf("add: %,6dms  ", ms);
            ms = CPUTimer.timeFor(() -> executeFinds(skipListSet, strikes));
            System.out.printf("find: %,6dms  ", ms);

            if(includeRemoves) {
                ms = CPUTimer.timeFor(() -> skipListSet.removeAll(removeList));
                System.out.printf("del: %,6dms  ", ms);
                ms = CPUTimer.timeFor(() -> executeFinds(skipListSet, strikes));
                System.out.printf("find: %,6dms  ", ms);
            }

            System.out.printf("\n");
            System.out.printf("                                             ");

            start = System.currentTimeMillis();
            skipListSet.reBalance();
            end = System.currentTimeMillis();
            ms = end - start;

            System.out.printf("bal: %,6dms  ", ms);

            ms = CPUTimer.timeFor(() -> executeFinds(skipListSet, strikes));
            System.out.printf("find: %,6dms  ", ms);

            System.out.printf("\n");
        }

        System.gc();


        if(true) {
            TreeSet<T> treeSet = new TreeSet<T>();

            System.out.printf("  TreeSet     ");
            ms = CPUTimer.timeFor(() -> treeSet.addAll(values));
            System.out.printf("add: %,6dms  ", ms);

            ms = CPUTimer.timeFor(() -> executeFinds(treeSet, strikes));
            System.out.printf("find: %,6dms  ", ms);

            if(includeRemoves) {
                ms = CPUTimer.timeFor(() -> treeSet.removeAll(removeList));
                System.out.printf("del: %,6dms  ", ms);
                ms = CPUTimer.timeFor(() -> executeFinds(treeSet, strikes));
                System.out.printf("find: %,6dms  ", ms);
            }
            System.out.printf("\n");
        }

        System.gc();

        System.out.printf("\n");
    }

    public static void executeStringCase(int listSize, int strikeSize, int stringSize, boolean includeLinkedList, boolean includeRemoves) {
        System.out.printf("CASE: %,d strings of length %,d, %,d finds, %,d removals.  Generating...\n", listSize, stringSize, strikeSize, (strikeSize/2));

        ArrayList<String> strings = generateStringArrayList(listSize, stringSize);
        ArrayList<String> strikes = generateStrikeList(strings, strikeSize);

        executeCase(strings, strikes, includeLinkedList, includeRemoves);
    }

    public static void executeIntCase(int listSize, int strikeSize, boolean includeLinkedList, boolean includeRemoves) {
        System.out.printf("CASE: %,d integers, %,d finds, %,d removals.  Generating...\n", listSize, strikeSize, strikeSize/2);

        ArrayList<Integer> intlist = generateIntArrayList(listSize);
        ArrayList<Integer> strikes = generateStrikeList(intlist, strikeSize);

        executeCase(intlist, strikes, includeLinkedList, includeRemoves);
    }

    public static void executeDoubleCase(int listSize, int strikeSize, boolean includeLinkedList, boolean includeRemoves) {
        System.out.printf("CASE: %,d doubles, %,d finds, %,d removals.  Generating...\n", listSize, strikeSize, strikeSize/2);

        ArrayList<Double> doubles = generateDoubleArrayList(listSize);
        ArrayList<Double> strikes = generateStrikeList(doubles, strikeSize);

        executeCase(doubles, strikes, includeLinkedList, includeRemoves);
    }

    public SkipListTestHarness() {}

    public static void main(String args[]) {
        SkipListTestHarness.executeStringCase(100000, 10000, 1000, false, true);
        System.gc();
        SkipListTestHarness.executeStringCase(1000000, 10000, 1000, false, true);
        System.gc();
        SkipListTestHarness.executeStringCase(1000000, 100000, 1000, false, true);
        System.gc();
        SkipListTestHarness.executeDoubleCase(100000, 10000, true, true);
        System.gc();
        SkipListTestHarness.executeDoubleCase(1000000, 10000, false, true);
        System.gc();
        SkipListTestHarness.executeDoubleCase(1000000, 100000, false, true);
        System.gc();
        SkipListTestHarness.executeIntCase(100000, 10000, true, true);
        System.gc();
        SkipListTestHarness.executeIntCase(1000000, 10000, false, true);
        System.gc();
        SkipListTestHarness.executeIntCase(10000000, 10000, false, true);
        System.gc();
        SkipListTestHarness.executeIntCase(10000000, 1000000, false, true);
        System.gc();
        SkipListTestHarness.executeIntCase(10000000, 10000000, false, true);
        System.gc();
    }
}
