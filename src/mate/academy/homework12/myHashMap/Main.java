package mate.academy.homework12.myHashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMapImpl<String, String> myHashMap = new MyHashMapImpl<>();
        myHashMap.put("1", "2");
        myHashMap.put("2", "10");
        myHashMap.put("3", "123");
        myHashMap.put("4", "12311");
        myHashMap.put("5", "132131");

        for (int i = 1; i < myHashMap.size() + 1; i++) {
            System.out.println("Value " + i + " in myHashMap : " + myHashMap.get(String.valueOf(i)));
        }

        System.out.println("Processing delete 1 element of myHashmap : " + myHashMap.remove("5"));

        System.out.println("Size of myHashmap(before using the 'clear' method) : " + myHashMap.size());

        for (int i = 1; i < myHashMap.size() + 1; i++) {
            System.out.println("Value " + i + " in myHashMap : " + myHashMap.get(String.valueOf(i)));
        }

        System.out.println(myHashMap.iterator().hasNext());

        myHashMap.clear();
        System.out.println("Size of myHashmap(after using the 'clear' method) : " + myHashMap.size());

    }
}
