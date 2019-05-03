package mate.academy.homework12.myLinkedList;

public interface MyLinkedList<T> {
    int size();

    T get(int index);

    void add(T value, int index);

    void add(T value);

    void set(int index, T value);

    void remove(T value);

    T remove(int index);

    boolean isEmpty();
}
