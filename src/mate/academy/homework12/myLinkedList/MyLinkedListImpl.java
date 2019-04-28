package mate.academy.homework12.myLinkedList;

public class MyLinkedListImpl<T> implements MyLinkedList<T> {
    private Node<T> firstNode = null;
    private Node<T> lastNode = null;
    private int size = 0;

    private Node<T> getFirstNode() {
        return firstNode;
    }

    private Node<T> getLastNode() {
        return lastNode;
    }

    @Override
    public void add(T value) {
        if (firstNode == null) {
            firstNode = new Node<T>(value, null, null);
            lastNode = firstNode;
        } else {
            Node curentNode = new Node<T>(value, lastNode, null);
            lastNode.next = curentNode;
            lastNode = curentNode;
        }
        size++;
    }

    @Override
    public void add(T value, int index) {
        checkIndex(index);
        Node<T> bufferNode = getNode(index);
        Node<T> newNode = new Node<T>(value, bufferNode.prev, bufferNode);
        bufferNode.prev.next = newNode;
        bufferNode.prev = newNode;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> requiredNode = firstNode;
        for (int i = 0; i < index; i++) {
            requiredNode = requiredNode.next;
        }
        return requiredNode.value;
    }

    private Node<T> getNode(int index) {
        checkIndex(index);
        Node<T> requiredNode = firstNode;
        for (int i = 0; i < index; i++) {
            requiredNode = requiredNode.next;
        }
        return requiredNode;
    }

    @Override
    public void set(int index, T value) {
        checkIndex(index);
        Node<T> bufferNode = getNode(index);
        bufferNode.value = value;
        bufferNode = null;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        Node<T> bufferNode = getNode(index);
        if (index == 0) {
            firstNode = firstNode.next;
            firstNode.prev = null;
            bufferNode.next = null;
        } else {
            bufferNode.prev.next = bufferNode.next;
            bufferNode.next.prev = bufferNode.prev;
            bufferNode.prev = null;
            bufferNode.next = null;
        }
        size--;
        return bufferNode.value;
    }

    @Override
    public void remove(T value) {
        Node<T> bufferNode = firstNode;
        for (int i = 0; i < size; i++) {
            if (bufferNode.value.equals(value)) {
                remove(i);
                break;
            } else {
                bufferNode = bufferNode.next;
            }
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyLinkedListImpl)) return false;

        MyLinkedListImpl<?> that = (MyLinkedListImpl<?>) o;

        if (size != that.size) return false;
        if (getFirstNode() != null ? !getFirstNode().equals(that.getFirstNode()) : that.getFirstNode() != null)
            return false;
        return getLastNode() != null ? getLastNode().equals(that.getLastNode()) : that.getLastNode() == null;

    }

    @Override
    public int hashCode() {
        int result = getFirstNode() != null ? getFirstNode().hashCode() : 0;
        result = 31 * result + (getLastNode() != null ? getLastNode().hashCode() : 0);
        result = 31 * result + size;
        return result;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private class Node<T> {
        private T value;
        private Node prev;
        private Node next;

        public Node(T value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
