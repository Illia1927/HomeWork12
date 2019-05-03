package mate.academy.homework12.myArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[10];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("invalid capacity");
        else if (capacity == 0)
            array = new Object[capacity];
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
    public boolean contains(Object value) {
        if (value == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (value.equals(array[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean add(T value) {
        ensureCapacity(size + 1);
        this.array[size++] = value;
        return true;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > array.length) {
            Object[] someList = new Object[array.length * 2];
            for (int j = 0; j < array.length; j++) {
                someList[j] = array[j];
            }
            array = someList;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public T get(int index) {
        {
            if (index >= size || index < 0) {
                throw new IndexOutOfBoundsException();
            }
            return (T) array[index];
        }
    }

    @Override
    public void add(int index, T value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object someList[] = new Object[size - index];
        for (int i = 0; i < someList.length; i++) {
            someList[i] = array[i + 1];
        }
        array[index] = value;
        for (int i = 0; i < someList.length; i++) {
            array[index + 1 + i] = someList[i];
        }
        size++;
    }

    @Override
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        T buf = (T) array[index];
        Object[] someArray = new Object[size - index - 1];
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = array[index + i + 1];
        }
        for (int i = 0; i < someArray.length; i++) {
            array[index + i] = someArray[i];
        }
        size--;
        array[size] = null;
        return buf;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
