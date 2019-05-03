package mate.academy.homework12.myLinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedListImplTest {
    MyLinkedListImpl<String> expectedTestMyLinkedList = new MyLinkedListImpl<>();
    MyLinkedListImpl<String> actualTestMyLinkedList = new MyLinkedListImpl<>();

    @Before
    public void initDate() {
        expectedTestMyLinkedList.add("Dynamo");
        expectedTestMyLinkedList.add("Karpaty");
    }

    @Test
    public void add() {
        actualTestMyLinkedList.add("Dynamo");
        actualTestMyLinkedList.add("Karpaty");

        String expected = expectedTestMyLinkedList.get(1);
        String actual = actualTestMyLinkedList.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get() {
        Assert.assertEquals("Karpaty", expectedTestMyLinkedList.get(1));

        actualTestMyLinkedList.get(44);
    }

    @Test
    public void set() {
        actualTestMyLinkedList = new MyLinkedListImpl<>();
        actualTestMyLinkedList.add("Chelsea");
        actualTestMyLinkedList.add("Manchester");
        actualTestMyLinkedList.add("Dortmund");

        actualTestMyLinkedList.set(2, "Real Madrid");
        Assert.assertEquals("Real Madrid", actualTestMyLinkedList.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove() {
        actualTestMyLinkedList = new MyLinkedListImpl<>();
        actualTestMyLinkedList.add("Chelsea");
        actualTestMyLinkedList.add("Manchester");
        actualTestMyLinkedList.add("Dortmund");

        actualTestMyLinkedList.remove(1);
        Assert.assertEquals(2, actualTestMyLinkedList.size());

        expectedTestMyLinkedList.remove(15);
    }

    @Test
    public void size() {
        Assert.assertEquals(2, expectedTestMyLinkedList.size());
    }

    @Test
    public void isEmpty() {
        Assert.assertFalse(expectedTestMyLinkedList.isEmpty());
    }
}