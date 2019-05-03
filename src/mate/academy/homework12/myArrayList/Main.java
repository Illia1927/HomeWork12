package mate.academy.homework12.myArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> realizeArrayList = new MyArrayList<>();

        realizeArrayList.add("Illia");
        realizeArrayList.add("Vova");
        realizeArrayList.add("Anton");

        for (int i = 0; i < realizeArrayList.size(); i++) {
            System.out.println(realizeArrayList.get(i));
        }

        realizeArrayList.clear();

        for (int i = 0; i < realizeArrayList.size(); i++) {
            System.out.println(realizeArrayList.get(i));
        }
    }
}
