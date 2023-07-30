package greyNodesAssignment.SkipListTask;

import java.util.*;


public class SkipListSet<T extends Comparable<? super T>> implements Set<T> {

    private final int MAX_LEVEL = 32;
    private final double PROBABILITY = 0.5;
    private final SkipListSetItem<T> head;
    private final Random random;
    private static int size;
    private int height;

    public SkipListSet() {
        this.head = new SkipListSetItem<>(null, MAX_LEVEL);
        this.random = new Random();
        this.size = 0;
        this.height = 1;
    }

    public SkipListSet(Collection<? extends T> c) {
        this();
        addAll(c);
    }

    public void reBalance() {
        // create a new head with maximum level
        SkipListSetItem<T> newHead = new SkipListSetItem<>(null, MAX_LEVEL);

        SkipListSetItem<T>[] update = new SkipListSetItem[MAX_LEVEL];
        SkipListSetItem<T> current = head;
        for (int i = height - 1; i >= 0; i--) {
            update[i] = newHead;
        }

        while (current.next[0] != null) {
            current = current.next[0];
            int newHeight = randomHeight();
            if (newHeight > MAX_LEVEL) {
                newHeight = MAX_LEVEL;
            }
            SkipListSetItem<T> newItem = new SkipListSetItem<>(current.value, newHeight);

            // initialize update[i] to head if i >= newHeight
            for (int i = newHeight; i < height; i++) {
                update[i] = head;
            }

            for (int i = 0; i < newHeight; i++) {
                if(update[i]!=null) {
                    newItem.next[i] = update[i].next[i];
                    update[i].next[i] = newItem;
                }
            }

            // update update[i] for all i < newHeight
            for (int i = 0; i < newHeight; i++) {
                if(update[i]!=null) {
                    update[i] = update[i].next[i] == null ? newHead : update[i];
                }
            }

            // update height if necessary
            if (newHeight > height) {
                for (int i = height; i < newHeight; i++) {
                    update[i] = newHead;
                }
                height = newHeight;
            }
        }

        head.next = newHead.next;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (!(o instanceof Comparable)) {
            return false;
        }
        Comparable<? super T> key = (Comparable<? super T>) o;
        SkipListSetItem<T> current = head;
        for (int i = height - 1; i >= 0; i--) {
            while (current.next[i] != null && key.compareTo(current.next[i].value) > 0) {
                current = current.next[i];
            }
        }
        current = current.next[0];
        return current != null && key.compareTo(current.value) == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new SkipListSetIterator<>(head);
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (T item : this) {
            array[i++] = item;
        }
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < size) {
            a = Arrays.copyOf(a, size);
        }
        int i = 0;
        for (T item : this) {
            a[i++] = (T1) item;
        }
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean add(T value) {
        SkipListSetItem<T>[] update = new SkipListSetItem[MAX_LEVEL];
        SkipListSetItem<T> current = head;

        for (int i = height - 1; i >= 0; i--) {
            while (current.next[i] != null && value.compareTo(current.next[i].value) > 0) {
                current = current.next[i];
            }
            update[i] = current;
        }

        current = current.next[0];

        if (current != null && value.compareTo(current.value) == 0) {
            return false;
        }

        int newHeight = randomHeight();
        if (newHeight > height) {
            for (int i = height; i < newHeight; i++) {
                update[i] = head;
            }
            height = newHeight;
        }

        current = new SkipListSetItem<>(value, newHeight);
        for (int i = 0; i < newHeight; i++) {
            current.next[i] = update[i].next[i];
            update[i].next[i] = current;
        }

        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof Comparable)) {
            return false;
        }
        Comparable<? super T> key = (Comparable<? super T>) o;
        SkipListSetItem<T>[] update = new SkipListSetItem[MAX_LEVEL];
        SkipListSetItem<T> current = head;

        for (int i = height - 1; i >= 0; i--) {
            while (current.next[i] != null && key.compareTo(current.next[i].value) > 0) {
                current = current.next[i];
            }
            update[i] = current;
        }

        current = current.next[0];

        if (current == null || key.compareTo(current.value) != 0) {
            return false;
        }

        for (int i = 0; i < height; i++) {
            if (update[i].next[i] != current) {
                break;
            }
            update[i].next[i] = current.next[i];
        }

        while (height > 1 && head.next[height - 1] == null) {
            height--;
        }

        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override    public boolean addAll(Collection<? extends T> c) {
        boolean changed = false;
        for (T item : c) {
            changed |= add(item);
        }
        return changed;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean changed = false;
        for (Object item : c) {
            changed |= remove(item);
        }
        return changed;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean changed = false;
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            T item = it.next();
            if (!c.contains(item)) {
                it.remove();
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public void clear() {
        Arrays.fill(head.next, null);
        size = 0;
        height = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        Set<?> set = (Set<?>) o;
        if (set.size() != size()) {
            return false;
        }
        for (Object item : set) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (T item : this) {
            hash += item.hashCode();
        }
        return hash;
    }

    private int randomHeight() {
        int height = 1;
        while (random.nextDouble() < PROBABILITY && height < MAX_LEVEL) {
            height++;
        }
        return height;
    }

    private static class SkipListSetItem<T> {
        T value;
        SkipListSetItem<T>[] next;

        @SuppressWarnings("unchecked")
        public SkipListSetItem(T value, int level) {
            this.value = value;
            this.next = new SkipListSetItem[level];
        }
    }

    private class SkipListSetIterator<T> implements Iterator<T> {
        private SkipListSetItem<T> current;

        public SkipListSetIterator(SkipListSetItem<T> head) {
            this.current = head.next[0];
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = current.value;
            current = current.next[0];
            return value;
        }

        @Override
        public void remove() {
            if (current == null) {
                throw new IllegalStateException();
            }
            SkipListSetItem<T>[] update = new SkipListSetItem[current.next.length];
            SkipListSetItem<T> temp = current;
            for (int i = temp.next.length - 1; i >= 0; i--) {
                while (update[i] != null && update[i].next[i] != temp) {
                    update[i] = update[i].next[i];
                }
                update[i] = update[i] == null ? (SkipListSetItem<T>) head : update[i];
            }
            for (int i = 0; i < temp.next.length; i++) {
                update[i].next[i] = temp.next[i];
            }
            current = temp.next[0];
            size--;
        }
    }
}