package mate.academy.homework12.myHashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyHashMapImplTest {
    MyHashMapImpl<String, String> expectedTestMyHasMap = new MyHashMapImpl<>();
    MyHashMapImpl<String, String> actualTestMyHasMap = new MyHashMapImpl<>();

    @Before
    public void initMyHashMap() {
        expectedTestMyHasMap.put("1", "Dynamo Kiev");
        expectedTestMyHasMap.put("2", "Karpaty Lviv");
        expectedTestMyHasMap.put("3", "Dnipro Dnipro");
    }

    @Test
    public void put() {
        actualTestMyHasMap.put("1", "Dynamo Kiev");
        actualTestMyHasMap.put("2", "Karpaty Lviv");
        actualTestMyHasMap.put("3", "Dnipro Dnipro");

        String first = expectedTestMyHasMap.get("1");
        String second = actualTestMyHasMap.get("1");
        Assert.assertEquals(first, second);
    }

    @Test
    public void clear() {
        expectedTestMyHasMap.clear();
        Assert.assertEquals(0, expectedTestMyHasMap.size());
    }

    @Test
    public void remove() {
        actualTestMyHasMap = new MyHashMapImpl<>();
        actualTestMyHasMap.put("1", "Illia");
        actualTestMyHasMap.put("2", "Maria");
        actualTestMyHasMap.remove("2");

        Assert.assertFalse("2", Boolean.parseBoolean(actualTestMyHasMap.get("2")));
    }

    @Test
    public void get() {
        Assert.assertEquals("Dynamo Kiev", expectedTestMyHasMap.get("1"));
    }

    @Test
    public void size() {
        Assert.assertEquals(3, expectedTestMyHasMap.size());
    }

    @Test
    public void iterator() {
        Assert.assertEquals(true, expectedTestMyHasMap.iterator().hasNext());
    }
}
